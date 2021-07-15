/** 하노이탑 이동순서 , 21.07.15 **/
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow



val string = StringBuilder()
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()

    string.append("${((2.toDouble().pow(N))-1).toInt()} \n")

    hanoi(N,1,2,3)
    print(string)
}

fun hanoi(num : Int, A : Int, B : Int, C : Int){
    if(num == 1){
       string.append("$A $C \n")
        return
    }

    //A에서 B로 n-1개를 이동.
    hanoi(num-1, A,C,B)

    //A에서 C로 n번째 원판을 옮긴다.
    string.append("$A $C \n")

    //N-1개가 B에서 C로 이동
    hanoi(num-1, B,A,C)
}
