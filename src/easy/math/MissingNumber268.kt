package easy.math

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        val expectedSum = nums.size * (nums.size + 1) / 2
        var actualSum = 0
        for (i in nums.indices) {
            actualSum += nums[i]
        }
        return expectedSum - actualSum
    }
}