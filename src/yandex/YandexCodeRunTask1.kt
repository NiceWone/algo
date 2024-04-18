package yandex

fun main(args: Array<String>) {
//    val (first, second, third) = readln().split(' ').map { it.toInt() }
//    val intArray = intArrayOf(first, second, third)
//    intArray.sort()
//    println(intArray[1])

    val groupingBy = listOf(1, 2, 3, 4, 4, 4, 100).groupingBy { it }
    println(
//        listOf(1, 2, 3, 4, 4, 4, 100).groupByTo(mutableMapOf()){it}
        groupingBy.eachCountTo(mutableMapOf())
    )
}