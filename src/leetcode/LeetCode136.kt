package leetcode

fun main() {
    println(singleNumber(intArrayOf(4, 1, 2, 1, 2)))
}

fun singleNumber(nums: IntArray): Int {
    var res = 0
    for (it in nums) {
        res = res xor it
    }
    return res
}



