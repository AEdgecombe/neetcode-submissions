class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return true;
        } else {
            boolean flag = true;
            for (int i = 0, j = 1; i < nums.length - 1 && j < nums.length; i++, j++) {
                int one = nums[i];
                int two = nums[j];
                if ((one % 2 == 0 && two % 2 == 0) || (one % 2 != 0 && two % 2 != 0)) {
                    flag = false;
                    return flag;
                }
            }
            return flag;
        }
    }
}