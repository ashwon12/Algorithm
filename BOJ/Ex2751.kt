/** 21. 08.19 수 정렬하기2  **/

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    var N = br.readLine().toInt()
    val arr = Array<Int>(N){0}

    //입력받아서 배열에 저장
    for(i in 0 until N){
        arr[i] = br.readLine().toInt()
    }

    arr.sort()
    val sb = StringBuilder()
    for( i in arr.indices){
        sb.append(arr[i])
        sb.append("\n")
    }

    print(sb.toString())

}
