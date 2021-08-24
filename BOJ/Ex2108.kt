package sort

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.roundToInt


/** 21.08.21 통계학 **/

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var N = br.readLine().toInt()
    val arr = MutableList(N) {br.readLine().toInt()}.sorted()

    // 산술평균
    val avg : Float = (arr.sum().toFloat()/N)

    // 중앙값
    val middle = when(N%2){
        1 -> arr[(N-1)/2]
        0 -> (arr[N/2] + arr[(N/2)-1])/2
        else -> 0
    }

    //최빈값
    val counting = MutableList(8001) {0}
    for(i in arr.indices){
        if(arr[i] < 0){
            counting[abs(arr[i])+4000]++
        }else{
            counting[arr[i]]++
        }
    }

    var maxIndex = counting.maxOf { it }

    val array = ArrayList<Int>()
    for(i in counting.indices){
        if(counting[i] == maxIndex ){
            if(i > 4000){
                array.add(-(i-4000))
            }else {
                array.add(i)
            }
        }
    }

    array.sort()
    maxIndex = if(array.size>1){
        array[1]
    }else{
        array[0]
    }

    // 범위
    val range = arr[N-1]- arr[0]

    println(avg.roundToInt())
    println(middle)
    println(maxIndex)
    println(range)

}
