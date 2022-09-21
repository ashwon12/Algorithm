/**
 *  1. 2차원 배열 안의 값들을 정렬한다. ( 한쪽에 큰 거 , 한쪽에 작은 거 )
 *  2. 큰것중에 제일 큰 거 * 작은 것 중에 가장 작은 것을 곱해준다.
 *
 */


class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        val sorted = sizes.forEach {
            it.sortDescending()
        }
        val weight = sizes.maxOf { it[0] }
        val height = sizes.maxOf { it[1] }


        return (weight) * (height)
    }
}
