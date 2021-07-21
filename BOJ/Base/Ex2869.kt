package math

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*


object Main {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val st = StringTokenizer(br.readLine(), " ")
        val A = st.nextToken().toInt()
        val B = st.nextToken().toInt()
        val V = st.nextToken().toInt()
        var day = (V - B) / (A - B)
        if ((V - B) % (A - B) != 0) {
            day++
        }
        println(day)
    }
}
