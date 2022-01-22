class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var num = x
        var sum = 0
        
        while (num != 0) {
            sum += num % 10
            num /= 10
        }
        
        answer = if( x % sum == 0){
             true
        }else {
            false
        }
        print(answer)
        return answer
    }
}
