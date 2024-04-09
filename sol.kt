class Solution {
    fun plusOne(digits: IntArray): IntArray {

        for (i in digits.size - 1 downTo 0) {
            val sum = digits[i] + 1
            if (sum < 10) {
                digits[i] = sum
                return digits
            } else {
                digits[i] = 0
            }
        }
        return intArrayOf(1) + digits
    }
}
