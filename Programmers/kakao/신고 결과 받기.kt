fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    val temp = id_list.associateWith { 0 }.toMutableMap()

    report.groupBy { it.split(" ")[1]}
        .values
        .map { it.distinct() }
        .filter { it.size>= k }
        .map{ it.map { reporter -> reporter.split(" ")[0]} }
        .flatten()
        .forEach {  reporter ->
        temp[reporter] = temp[reporter]!! + 1
    }

    return temp.values.toIntArray()
}
