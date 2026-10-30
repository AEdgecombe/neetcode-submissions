class Solution {
    public int sumOfDigits(int[] nums) {
        int min = nums[0];
        int total = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        while (min > 0) {
            int digit = min % 10;
            total += digit;
            min = min / 10;
        }

        if (total % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
