/** 21.08.18 수 정렬하기 **/

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var N = br.readLine().toInt()
    val arr = Array<Int>(N){0}

    //입력받아서 배열에 저장
    for(i in 0 until N){
        arr.set(i,br.readLine().toInt())
    }

    //삽입정렬로 숫자 정렬
    for(i in 1 until arr.count()){
        for(j in i downTo 1){
            if(arr[j-1] > arr[j]){
                var temp = arr[j]
                arr[j]= arr[j-1]
                arr[j-1] = temp
            }
        }
    }

    arr.forEach { println(it) }

}

