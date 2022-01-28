class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        var weight = yellow // 노랑색의 가로  (24,2) (12,2)
        var height = 1      // 노랑색의 세로
        
        while(true){
            if(((weight+2)*(height+2)-yellow) == brown && yellow%height == 0){
                answer = intArrayOf(weight+2,height+2)
                break
            }
            height++
            weight = yellow/height
        }
        return answer
    }
}
