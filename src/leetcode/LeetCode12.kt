package leetcode

fun main() {
//    val firstPos = readln().toInt()
//    println(firstPos)
//    println(intToRoman(firstPos))

    val listOf = listOf(
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
        10, 11, 22, 33, 44, 55, 66, 77, 88, 99, 58,
        500,
        1994
    )
    listOf.forEach {
        println("$it = ${intToRoman(it)}")
    }
}
val first = arrayListOf(
    "",
    "I",
    "II",
    "III",
    "IV",
    "V",
    "VI",
    "VII",
    "VIII",
    "IX",
)
val second = arrayListOf(
    "",
    "X",
    "XX",
    "XXX",
    "XL",
    "L",
    "LX",
    "LXX",
    "LXXX",
    "XC",
)
val third = arrayListOf(
    "",
    "C",
    "CC",
    "CCC",
    "CD",
    "D",
    "DC",
    "DCC",
    "DCCC",
    "CM",
)
val fourth = arrayListOf(
    "",
    "M",
    "MM",
    "MMM"
)
private fun intToRoman(num: Int): String {
    var result = ""
    result += fourth[num % 10000 / 1000]
    result += third[num % 1000 / 100]
    result += second[num % 100 / 10]
    result += first[num % 10]
    return result
}

