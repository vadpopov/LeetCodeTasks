package easy

class RomanToInt {
    fun romanToInt(s: String): Int {
        val map = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000)
        fun getIntValue(roman : Char) : Int {
            return map.getValue(roman)
        }

        if(s.length==1) return getIntValue(s[0])

        var total = 0

        var lastIndex = s.lastIndex
        var previous = 0
        while (lastIndex >= 0) {
            if(getIntValue(s[lastIndex]) >= previous) {
                total+=getIntValue(s[lastIndex])
            }
            else total-=getIntValue(s[lastIndex])
            previous = getIntValue(s[lastIndex])
            lastIndex--
        }
        return total
        }
}