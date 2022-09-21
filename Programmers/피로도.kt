import kotlin.math.max

/**
 *  1. 순열을 통해 모든 순서 구하기
 *  2. 이전에 구한 탐험수가 배열의 길이와 같다면 ( 최대임을 의미 ) 종료하고 바로 출력
 *  3. 각 순서별로 최대탐험 수 구하기 
 *  4. 이전에 구한 탐험수와 새로운 탐험수 비교해서 더 큰 수 저장
 */


class Solution {
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        val list = mutableListOf<List<Int>>()
        var answer  = 0
        dungeons.forEach{list.add(it.toList())}

        permutation(list).forEach{
            var index = 0
            var kk = k
            var temp = 0
            if(answer == dungeons.size){
                return@forEach
            }
            while(index < dungeons.size){
                if(kk >= it[index][0]) {
                    kk -= it[index][1]
                    temp++
                }
                index++
            }
            answer = max(temp,answer)
        }
        return answer
    }
    
    fun  <T> permutation( element : List<T>, finish : List<T> = listOf(), subList : List<T> = element) : List<List<T>>{
        return if(subList.isEmpty()) listOf(finish)
        else {
            subList.flatMap {
                permutation(element, finish + it, subList - it)
            }
        }
    }
}
