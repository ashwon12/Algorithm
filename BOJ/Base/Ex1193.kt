/** 21.07.23 분해합 **/

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    var X = br.readLine().toInt()
    var T = 1 // 분모 + 분자, 껍데기

    while (true){
        if(X > T){
            X -= T
            T++
        }else{
            break
        }
    }

    when(T%2){
        0 -> print("${X}/${T- (X-1)}")
        else -> print("${T- (X-1)}/${X}")
    }
}
