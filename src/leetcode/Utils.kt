package leetcode

fun listNode(list: List<Int>): ListNode? {
    var listNode: ListNode? = null
    var head: ListNode? = null
    list.map {
        if (listNode == null) {
            listNode = ListNode(it)
            head = listNode!!
        } else {
            while (head!!.next != null) {
                head = head!!.next
            }
            head!!.next = ListNode(it)
        }
    }
    return listNode
}