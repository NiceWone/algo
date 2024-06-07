package leetcode

/*
1,2,3,4,5
1,1,2
1,1,2,3,3
*/
fun main() {
    val list = readln().split(",").map { it.toInt() }

    val listNode = listNode(list)
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

