class Solution {
    public boolean hasDuplicate(int[] nums) {
        // First go
        // for (int i = 0; i < (nums.length - 1); i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // Improving
        HashSet<Integer> x = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (x.add(nums[i]) == false) {
                return true;
            }
        }
        return false;
    }
}