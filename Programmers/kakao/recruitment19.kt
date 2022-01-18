class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = IntArray(N) // 정렬 된 배열
        val tempAnswer : MutableMap<Int, Double> = mutableMapOf() // 정렬 전 배열

        for(count in 0..N-1){
            var reach : Double = 0.0 // 해당 단계를 지나친 사람
            var notReach : Double = 0.0  // 해당 단계에 머물러 있는 사람
            for(i in 0..stages.size-1){
                if(stages[i] > count+1){
                    reach++
                }else if(stages[i] == count+1){
                    notReach++
                }
            }
            if(notReach+reach == 0.0 || notReach == 0.0) {
                tempAnswer.put(count+1,0.0)
            }
            else{
                tempAnswer.put(count+1,notReach/(notReach+reach))
            }
        }

        val list = tempAnswer.toList().sortedByDescending{it.second}
        
        for (i in 0 until N) {
            answer[i] = (list[i].first)
        }
        
        return answer
    }
}
