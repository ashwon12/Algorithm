/** 21.07.18 덩치 **/

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val N = readLine()!!.toInt()

    var arr = Array<Pair<Int, Int>>(N) { Pair(0,0) }
    val rank = Array<Int>(N) {1}

    for(i in 0 until N){
        val st = readLine()!!.split(' ').map(String::toInt)
        arr[i] = Pair(st[0], st[1])
    }

    for (i in 0 until N){
        for(j in 0 until N){
            if(arr[i].first > arr[j].first && arr[i].second > arr[j].second){
                rank[j]++
            }
        }
    }

    rank.forEach {
        print("$it ")
    }
}
