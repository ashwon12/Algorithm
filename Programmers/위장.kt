fun solution(clothes: Array<Array<String>>): Int{
    var multiple = 1
    clothes.groupingBy {it[1]}.eachCount().values.forEach{ multiple *= (it+1)}
    return multiple-1
}
