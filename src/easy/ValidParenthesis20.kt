package easy

class ValidParenthesis {

    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) return false
        val stack = ArrayDeque<Char>()
        for (c in s) {
            if(c == '(' || c == '[' || c == '{') {
                stack.addLast(c)
            }
            else {
                if (stack.isEmpty()) return false
                val lastChar = stack.removeLast()
                if ( c != getOppositeBracket(lastChar)) return false
            }
        }
        return stack.isEmpty()
    }

    fun getOppositeBracket(char: Char): Char {
        val bracket = '('.code
        var charCode = char.code
        if (charCode == bracket) {
            return Char(charCode+1)
        }
        else return Char(charCode+2)
    }
}