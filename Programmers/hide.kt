class Solution {
    fun solution(phone_number: String): String {
        var answer = "*".repeat(phone_number.length-4) + phone_number.substring(phone_number.length - 4)
        
        return answer
    }
}
