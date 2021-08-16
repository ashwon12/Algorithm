/** 21.08.16 영화감독 숌 **/

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    var count = 1
    var num = 666

    if(N == 1){
        print(num)
        return
    }
    while(count != N){
        num++
        if(num.toString().contains("666")){
            count++
        }
    }

    print(num)
}
