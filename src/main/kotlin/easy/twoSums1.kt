package easy

class twoSums1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            var leftover = target - nums[i]
            if (map[leftover] != null) {
                return intArrayOf(i, map.getValue(leftover))
            }
            else {
                map[nums[i]] = i
            }
        }
        return intArrayOf()
    }
}