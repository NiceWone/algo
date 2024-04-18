package leetcode

fun main() {
    val firstPos = readln().toInt()
    println(firstPos)
    println(climbStairs(firstPos))
}

fun climbStairs(n: Int): Int {
    val map = mutableMapOf<Int, Int>()
    return calculate(map, n)
}

private fun calculate(map: MutableMap<Int, Int>, n: Int): Int {
    if (map.contains(n)) {
        return map[n]!!
    }
    val result = when (n) {
        1 -> 1
        2 -> 2
        else -> {
            calculate(map, n - 1) + calculate(map, n - 2)
        }
    }
    map[n] = result
    return result
}


