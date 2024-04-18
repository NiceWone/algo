package leetcode

import kotlin.math.abs

fun main() {
    val leetCode7 = LeetCode7()

    println(leetCode7.reverse(12345678))
    println(leetCode7.reverse(120))
    println(leetCode7.reverse(-12345678))
}

class LeetCode7 {
    fun reverse(x: Int): Int {
        return if (x < 0) {
            abs(x).toString().reversed().toIntOrNull()?.unaryMinus() ?: 0
        } else {
            x.toString().reversed().toIntOrNull() ?: 0
        }
    }
}




