package easy.two_pointers

class RemoveDuplicates26 {

    companion object Test{

        fun removeDuplicates(nums: IntArray): Int {
            var k = 0
            var v = 0
            while (k < nums.size) {
                if (nums[v] != nums[k]) {
                    v++
                    nums[v] = nums[k]
                }
                k++
            }
            return v+1
        }
    }
}