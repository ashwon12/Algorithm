/**피보나치**/
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine().toInt()
    val output = fibonacci(N)
    print(output)
}

fun fibonacci(num : Int) : Int{
    return when(num){
        0 -> 0
        1 -> 1
        else -> fibonacci(num-2)+fibonacci(num-1)
    }
}
