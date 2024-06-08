package leetcode

fun main() {
    val leetCode = LeetCode941()

//    println(leetCode.validMountainArray(intArrayOf(2, 1)))
//    println(leetCode.validMountainArray(intArrayOf(3, 5, 5)))
//    println(leetCode.validMountainArray(intArrayOf(0, 3, 2, 1)))
    println(leetCode.validMountainArray(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)))
}

class LeetCode941 {
    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3) {
            return false
        }
        // find max & index
        var indexMax = 0
        var valueMax = arr[0]
        for (i in 0..arr.lastIndex) {
            if (valueMax < arr[i]) {
                indexMax = i
                valueMax = arr[i]
            }
        }
        if (indexMax == arr.lastIndex || indexMax == 0) {
            return false
        }
        // max to start
        for (i in 0..<indexMax - 1) {
            if (arr[i + 1] <= arr[i]) {
                return false
            }
        }
        // max to end
        for (i in indexMax..<arr.size - 1) {
            if (arr[i + 1] >= arr[i]) {
                return false
            }
        }
        return true
    }
}