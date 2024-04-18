package yandex

import kotlin.math.max
import kotlin.math.min

fun main() {
    val (firstPos, firstCount) = readln().split(' ').map { it.toInt() }
    val (secondPos, secondCount) = readln().split(' ').map { it.toInt() }
    val left = Pair(firstPos, firstCount)
    val right = Pair(secondPos, secondCount)

    if (firstPos - firstCount < secondPos - secondCount) {
        println(calculate(left, right))
    } else {
        println(calculate(right, left))
    }
}

private fun calculate(left: Pair<Int, Int>, right: Pair<Int, Int>): Int {
    val leftEnd = left.first + left.second
    val rightStart = right.first - right.second

    val leftStart = left.first - left.second
    val rightEnd = right.first + right.second
    val minStart = min(leftStart, rightStart)
    val maxEnd = max(leftEnd, rightEnd)

    return if (left.first == right.first) {
        left.second * 2 + 1
    } else if (leftEnd < rightStart) {
        left.second * 2 + right.second * 2 + 2
    } else if (leftEnd == rightStart) {
        left.second * 2 + right.second * 2 + 1
    } else {
        maxEnd - minStart + 1
    }
}