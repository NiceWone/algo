package leetcode

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "$`val`->${next}"
    }
}
/*
1,2,3,4,5
1,1,2
1,1,2,3,3
*/
fun main() {
    val list = readln().split(",").map { it.toInt() }

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
    println(listNode)
    deleteDuplicates(listNode)
    println(listNode)
}

private fun deleteDuplicates(head: ListNode?): ListNode? {
    if (head?.next == null) {
        return head
    }

    var currentNode = head
    while (currentNode?.next != null) {
        if (currentNode.`val` == currentNode.next?.`val`) {
            currentNode.next = currentNode.next?.next
        } else {
            currentNode = currentNode.next
        }
    }
    return head
}

