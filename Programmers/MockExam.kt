class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = ArrayList<Int>()
        var tempAnswer = Array(3,{0})
        
        var supoja1Num = intArrayOf(1,2,3,4,5)
        var supoja2Num = intArrayOf(2,1,2,3,2,4,2,5)
        var supoja3Num = intArrayOf(3,3,1,1,2,2,4,4,5,5)


        answers.forEachIndexed {index, it ->
            if(supoja1Num[index%5] == it){tempAnswer[0]++}
 
            if(supoja2Num[index%8] == it){tempAnswer[1]++}
            
            if(supoja3Num[index%10] == it){ tempAnswer[2]++}
        }
        
        val max = tempAnswer.max()
        tempAnswer.forEachIndexed {index, it ->
            if (tempAnswer[index] == max) answer.add(index + 1)
        }
        
        return answer.toIntArray()
    }
}
