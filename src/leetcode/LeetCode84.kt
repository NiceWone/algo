package leetcode

/*
1,2,3,3,4,4,5
1,1,1,2,3
*/
fun main() {
    val list = readln().split(",").map { it.toInt() }

    val listNode = listNode(list)
    println(listNode)
    println(deleteDuplicates(listNode))
}

private fun deleteDuplicates(head: ListNode?): ListNode? {
    var head2 = head
    if (head2?.next == null) {
        return head2
    }

    var previousNode = head2
    var currentNode = head2
    while (currentNode?.next != null) {
        if (currentNode.`val` == currentNode.next?.`val`) {
            if (previousNode == currentNode) {
                head2 = findNextUnique(currentNode.next!!)
                previousNode = head2
                currentNode = head2
            } else {
                currentNode = previousNode
                currentNode?.next = currentNode?.let { findNextUnique(currentNode?.next!!) }
            }
        } else {
            previousNode = currentNode
            currentNode = currentNode.next
        }
    }

    return head2
}

private fun findNextUnique(head: ListNode): ListNode? {
    while (head.next != null) {
        if (head.`val` == head.next?.`val`) {
            head.next = head.next?.next
        } else {
            return head.next!!
        }
    }
    return null
}

