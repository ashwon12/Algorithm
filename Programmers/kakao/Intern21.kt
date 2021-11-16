
/**
 * 21 채용연계형 인턴쉽 Lv1. 숫자 문자열과 영단어
 */

class Intern21{
    fun solution(s: String): Int {
        val temp = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine")
        var tempText = s
        temp.forEachIndexed { index, it ->
            tempText = tempText.replace(it,"$index")
        }

        return tempText.toInt()
    }
}
