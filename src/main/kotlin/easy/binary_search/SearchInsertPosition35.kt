package easy

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {

        return 1
    }

    companion object Test {
        fun binarySearch(nums: IntArray, target: Int): Int {
            var left = 0
            var right = nums.lastIndex
            var mid = 0
            while(left <= right) {
                mid = left + (right - left) / 2
                when {
                    nums[mid] == target -> return mid
                    target > nums[mid] -> left = mid + 1
                    else -> right = mid - 1
                }
            }
            println(mid)
            if (nums[mid] > target) {

                return mid-1
            }
            else {
                return mid + 1
            }
        }
    }
}