package leetcode

fun main() {
//    val firstPos = readln().toInt()
//    println(firstPos)
//    println(intToRoman(firstPos))

    val listOf = listOf(
        "III",
        "VI",
        "MC",
        "LVIII",
        "MCMXCIV",
    )
    listOf.forEach {
        println("$it = ${romanToInt(it)}")
    }
}

private fun romanToInt(s: String): Int {
    var result = 0
    var line = s
    while (line.isNotEmpty()) {
        val length = if (line.length > 3) 3 else line.length
        loop@ for (i in length downTo 0) {
            val roman = line.substring(0, i)
            var count = 0
            count += if (first.indexOf(roman) == -1) 0 else first.indexOf(roman)
            count += if (second.indexOf(roman) == -1) 0 else second.indexOf(roman) * 10
            count += if (third.indexOf(roman) == -1) 0 else third.indexOf(roman) * 100
            count += if (fourth.indexOf(roman) == -1) 0 else fourth.indexOf(roman) * 1000
            if (count > 0) {
                result += count
                line = line.substring(i)
                break@loop
            }
        }
    }
    return result
}

