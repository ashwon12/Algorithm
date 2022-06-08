class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var answer = mutableListOf<Int>()

        plays.groupBy (keySelector = {genres[plays.indexOf(it)]}, valueTransform = {it}).toList()
            .sortedByDescending{it.second.sum()}
            .forEach { (_, playList) ->
                var bestList = playList.sortedWith (compareBy<Int> {-it}).take(2)
                bestList.forEach { play ->
                    if(answer.contains(plays.indexOf(play))){
                        answer.add(plays.lastIndexOf(play))
                    }else{
                        answer.add(plays.indexOf(play))
                    }
                }
            }
        return answer.toIntArray()
    }
}
