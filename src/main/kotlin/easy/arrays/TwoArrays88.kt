package easy.arrays

class TwoArrays {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if (n == 0) {
            return
        }
        else if (m == 0) {
            for (k in nums2.indices) {
                nums1[k]=nums2[k]
            }
        }
         else {
            var lastElementToPaste = m
            for (i in nums2.lastIndex downTo 0) {
                nums1.set(lastElementToPaste,nums2[i])
                var currentIndex = lastElementToPaste
                for (j in currentIndex - 1 downTo  0) {
                    if (nums1[j] > nums1[currentIndex]) {
                        val temp = nums1[j]
                        nums1[j] = nums1[currentIndex]
                        nums1[currentIndex] = temp
                        currentIndex = j
                    }
                    else break
                }
                lastElementToPaste += 1
            }

        }

    }

}