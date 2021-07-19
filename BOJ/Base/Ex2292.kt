/** 21.07.19 벌집 **/

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    var i = 1
    var count = 1

    if(N == 1) {
        print((1))
        return
    }
    while( i < N){
        i += (6 * count)
        count++
    }

    print(count)

}
