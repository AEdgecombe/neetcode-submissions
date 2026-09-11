class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc = 1;
        int dec = 1;
        for (int i = 0, j = i + 1; i < nums.length && j < nums.length; i++, j++) {
            if (nums[i] >= nums[j]) {
                dec++;

            }  
            if (nums[i] <= nums[j]) {
                inc++;
            }
        }
        if (inc == nums.length || dec == nums.length ) {
            return true;
        }
        return false;
    }
}