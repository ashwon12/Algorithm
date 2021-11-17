package kakao

/**
 *  21년 블라인드 공개채용, 신규아이디 추천
 */

fun main() {
    println(solution("...!@BaT#*..y.abcdefghijklm"))
    println(solution("bat.y.abcdefghi"))
    println(solution("z-+.^."))
    println(solution("123_.def"))
    println(solution("abcdefghijklmn.p"))
}

fun solution(new_id: String): String {
    var answer: String = ""
    val regex = Regex("[^A-Za-z0-9-_.]")
    answer = regex.replace(new_id, "").toLowerCase()

    //3단계
    while (answer.contains("..")) {
        answer = answer.replace("..", ".")
    }

    //4단계
    val firstIndex = answer.indexOfFirst { it == '.' }
    val lastIndex = answer.indexOfLast { it =='.' }
    if (firstIndex != -1 && firstIndex == 0) {
        answer = answer.replaceFirst(".", "")
    }
    if (lastIndex != -1 && lastIndex == answer.lastIndex) {
        answer = answer.substring(0, answer.lastIndex)
    }

    //5단계
    if (answer.isNullOrBlank()) {
        answer = "a"
    }

    //6단계
    if(answer.length >= 16){
        answer = answer.substring(0,15)
    }
    if(answer.indexOfLast { it =='.'} == answer.lastIndex){
        answer = answer.substring(0,answer.lastIndex)
    }

    //7단계
    val result = StringBuffer(answer)
    while (result.length < 3){
        result.append(result.last())
    }
    return result.toString()
}

