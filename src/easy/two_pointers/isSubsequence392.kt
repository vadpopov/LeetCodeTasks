package easy.two_pointers

class isSubsequence392 {

    companion object Test {

        fun isSubsequence(s: String, t: String): Boolean {
            var firstPointer = 0
            var secondPointer = 0
            if (s.length == 1 && t.length == 1) return s == t
            if (s.isEmpty()) return true
            if (t.length < s.length) return false
            while (firstPointer < s.length && secondPointer < t.length) {
                if (s[firstPointer] == t[secondPointer]) {
                    firstPointer++
                }
                secondPointer++
            }
            return firstPointer == s.length
        }
    }


}