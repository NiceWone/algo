package leetcode

fun main() {
    val leetCode = LeetCode941()

//    println(leetCode.validMountainArray(intArrayOf(2, 1)))
//    println(leetCode.validMountainArray(intArrayOf(1, 3, 2)))
//    println(leetCode.validMountainArray(intArrayOf(3, 5, 5)))
//    println(leetCode.validMountainArray(intArrayOf(0, 3, 2, 1)))
//    println(leetCode.validMountainArray(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)))
    println(leetCode.validMountainArray(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)))
}

class LeetCode941 {
    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3 || arr[0] >= arr[1] || arr[arr.lastIndex - 1] <= arr[arr.lastIndex]) {
            return false
        }
        var isTopFound = false
        for (i in 0..<arr.lastIndex) {
            if (!isTopFound) {
                if (arr[i] >= arr[i + 1]) {
                    isTopFound = true
                }
            } else {
                if (arr[i] <= arr[i + 1]) {
                    return false
                }
            }
        }
        return true
    }
}