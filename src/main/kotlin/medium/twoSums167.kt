package medium

class twoSums167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.lastIndex
        while (true) {
            var current = numbers[left] + numbers[right]
            if (current == target) {
                left ++
                right ++
                return intArrayOf(left, right)
            }
            if (current > target) right --
            else left ++
        }
    }
}