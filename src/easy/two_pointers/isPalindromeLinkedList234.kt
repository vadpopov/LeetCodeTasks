package easy.two_pointers

class isPalindromeLinkedList234 {

    companion object Test {
        var a = ListNode(1)
        var b = ListNode(2)
        var c = ListNode(3)
        var d = ListNode(4)
//        var e = ListNode(1)

        init {
            a.next = b
            b.next = c
            c.next = d
//            d.next = e
        }

        @JvmStatic
        fun main(args: Array<String>) {
            val solution = isPalindromeLinkedList234()

            val tests = listOf(
                listOf(1),
                listOf(1, 1),
                listOf(1, 2),

                listOf(1, 2, 1),
                listOf(1, 2, 3),
                listOf(1, 2, 3, 2, 1),
                listOf(1, 2, 3, 4, 1),

                listOf(1, 2, 2, 1),
                listOf(1, 2, 3, 3, 2, 1),
                listOf(1, 2, 3, 4, 4, 3, 2, 1),

                listOf(1, 2, 1, 2, 1),
                listOf(1, 2, 2, 3, 2, 2, 1),
                listOf(1, 2, 3, 1, 2, 3),
                listOf(1, 2, 3, 3, 1, 2, 1),
                listOf(1, 1, 1, 1, 1, 1),
                listOf(1, 2, 1, 1, 2, 1),

                listOf(1, 2, 3, 4, 5, 4, 3, 2, 1),
                listOf(1, 2, 3, 4, 5, 6, 4, 3, 2, 1),
                listOf(1, 2, 3, 4, 5, 5, 4, 3, 2, 1),

                listOf(1, 2, 3, 4, 3, 2, 1),
                listOf(1, 2, 3, 4, 2, 3, 1)
            )

            tests.forEach { values ->
                var head: ListNode? = null
                var current: ListNode? = null

                values.forEach { value ->
                    val node = ListNode(value)

                    if (head == null) {
                        head = node
                    } else {
                        current!!.next = node
                    }

                    current = node
                }

                val result = solution.isPalindrome(head)

                println("$values → $result")
            }
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun isPalindrome(headAhead: ListNode?): Boolean {
        /**
         * Edge cases
         */
        if (headAhead == null) return false
        if (headAhead.next == null) return true

        /**
         * Main algorithm
         */
        var stack = ArrayDeque<Int>()
        var slow = headAhead
        var fast = headAhead
        while (fast?.next != null) {
            stack.addLast(slow!!.`val`)
            slow = slow.next!!
            fast = fast.next!!.next
        }
        if (fast != null) {
            slow = slow.next
        }
        while (stack.isNotEmpty()) {
            if (stack.removeLastOrNull()!= slow?.`val`) {
                return false
            }
            if (slow?.next != null) slow = slow.next
        }
        return true
    }
}


