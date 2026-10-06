package easy

class LengthLastWord {
    fun lengthOfLastWord(s: String): Int {
        var counter = 0

        for (i in s.length - 1 downTo 0) {
            if (s[i].isLetter()) {
               counter++
            }
            else {
              if (counter > 0) {
                  break
              }
            }
        }
        return counter
    }
}