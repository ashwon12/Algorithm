class Solution {
    var answer = 0
    var backet = arrayListOf<Int>(0) 
    
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        moves.forEach{ value ->
            for(i in 0..board.lastIndex){
                if(board[i][value-1] != 0){
                    checkBacket(board[i][value-1])
                    board[i][value-1] = 0
                    break
                }
            }
        }
        
        return answer
    }
    
    fun checkBacket(pick : Int){
        if(backet?.last() == pick){
            backet.removeAt(backet.lastIndex)
            answer += 2
        }else{
            backet.add(pick)
        }
    }
}
