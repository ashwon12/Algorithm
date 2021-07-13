/**팩토리얼**/

import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine().toInt()
    val output = factorial(N)
    print(output)
}

fun factorial(num : Int) : Int{
    if (num <=1 ) return 1
    return num *factorial(num-1)
}
