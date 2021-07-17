/** 2021.07.17 블랙잭**/

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val numList= mutableListOf<Int>()

    var st = StringTokenizer(readLine(), " ")
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    var result = 1000000

    st = StringTokenizer(readLine(), " ")
    while(numList.size < N){
        numList.add(st.nextToken().toInt())
    }

    loop@for(i in 0 until N-2){
        for( k in i+1 until N-1){
            for (j in k+1 until N){
                val temp  = numList[i] + numList[k] + numList[j]
                if(M == temp){
                    result = temp
                    break@loop
                }
                else if(temp < M && abs(M-temp) < abs(M-result)){
                    result = temp
                }
            }
        }
    }
    print(result)
}
