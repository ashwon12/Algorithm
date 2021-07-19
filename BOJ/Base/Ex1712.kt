/**21.07.19 손익분기점 **/
import java.util.*

fun main(){
    var st = StringTokenizer(readLine(), " ")
    val A = st.nextToken().toInt()
    val B = st.nextToken().toInt()
    val C = st.nextToken().toInt()

    if(B >= C){
        print(-1)
        return
    }
    print(A / (C-B) +1)

}
