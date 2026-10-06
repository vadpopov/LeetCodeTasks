package easy.two_pointers

class Palindrom {

    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        while (left < right) {
            if (!s[left].isLetterOrDigit()) {
                println(" left ${s[left]} : $left is not a letter or digit, moving")
                left++
            }
            if (!s[right].isLetterOrDigit()) {
                println(" right ${s[right]} : $right is not a letter or digit, moving")
                right--
            }
            if (s[left].isLetterOrDigit() && s[right].isLetterOrDigit()) {
                if (s[left].equals(s[right], ignoreCase = true)) {
                    left++
                    right--
                    continue
                }
                else {
                    println("${s[left]} : ${s[right]} is not equals, leaving loop")
                    return false
                }
            }
        }
        return true
    }
}