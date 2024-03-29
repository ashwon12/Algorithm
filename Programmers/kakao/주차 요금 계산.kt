class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val keys = records.groupBy{it.split(" ")[1]}
        val blank = keys.keys.associateWith{0}.toMutableMap()
        
        keys.values.forEach{ key ->
            val times = key.map{(it.split(" ")[0].split(":"))}.flatten().toMutableList()
            if(times.size%4 != 0){
                times.add("23")
                times.add("59")
            }
            var i = 0
            var total = 0
            repeat(times.size/4){
                // 입출차 셋트
                var h = (times[i+2].toInt()-times[i].toInt()) * 60
                var m = times[i+3].toInt()-times[i+1].toInt()
                total += h+m
                i+=4
            }
            blank[key[0].split(" ")[1]] = total
        }
        
        answer = blank.mapValues{
            val v = it.value
            var temp = 0
            if(fees[0] < v){
                val add = if((v-fees[0])%fees[2] != 0) (v-fees[0])/fees[2]+1 else (v-fees[0])/fees[2]
                temp = add*fees[3]
            }
            fees[1] + temp
        }.toList().sortedBy{it.first}.map{it.second}.toIntArray()
        return answer
    }
}
