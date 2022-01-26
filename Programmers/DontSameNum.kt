class Solution {
    fun solution(arr : Array<Int>) : List<Int>{
      var list  = arrayListOf<Int>()
      arr.forEach {
          if(list.isEmpty()){
              list.add(it)
          }else if(list.last() != it){
              list.add(it)
          }
      }
      return list
  }
}
