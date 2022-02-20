import kotlin.math.min

class Solution {
    fun solution(name: String): Int {
        var count = 0
        val a = 'A'.toInt()
        val z = 'Z'.toInt()
        var move = name.length - 1
     
        name.forEachIndexed{index, it ->
          // 좌우 조작  
          var next = index+1
          while(next < name.length && name[next] == 'A') next++
          move = min(move, index+name.length-next+index)
          move = min(move, (name.length - next) * 2 + index)
            
            
          // 위아래 조작  
          count += if((it.toInt()-a) <= (z-it.toInt())){
                 (it.toInt()-a)
            }else{
                (z-it.toInt())+1
            }
        }
        
        count+=move
        return count
    }
}
