class Solution {
    public int specialArray(int[] nums) {
        int length = nums.length;

        for (int x = 0; x <= length; x++) {
            int count = 0;
            for (int i = 0; i < length; i++) {
                if (nums[i] >= x) {
                    count++;
                }
            }
            if (count == x) {
                return x;
            }
        }

        return -1;
    }
}