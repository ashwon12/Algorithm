/** 21.07.18 분해합 **/

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    var result=0

    for( i in 1 until N){
        var sum = 0
        var num = i

        for(j in 0 .. Math.log10(num.toDouble()).toInt()){
            sum += num %10
            num /= 10
        }

        if(sum + i == N){
            result = i
            break
        }
    }
    print(result)

}
