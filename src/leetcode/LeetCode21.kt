package leetcode

fun main() {
//    val list = readln().split(",").map { it.toInt() }
//    val list = readln().split(",").map { it.toInt() }
    val list = listOf(1, 2, 4)
    val list2 = listOf(1, 3, 4)

    val listNode = listNode(list)
    val listNode2 = listNode(list2)
    println(listNode)
    println(listNode2)
    println(mergeTwoLists(listNode, listNode2))
}

private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null) {
        return list2
    }
    if (list2 == null) {
        return list1
    }
    return null
}