package leetcode

fun main() {
//    println(longestCommonPrefix(listOf("flower", "flow", "flight").toTypedArray()))
    println(longestCommonPrefix(listOf("a").toTypedArray()))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var temp = ""
    for (index in strs[0].indices) {
        temp += strs[0][index].toString()
        for (str in strs) {
            if (!str.startsWith(temp)) {
                return temp.dropLast(1)
            }
        }
    }
    return temp
}

