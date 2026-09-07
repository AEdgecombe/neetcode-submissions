class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            ans[i] = -1;
            for(int j = 0; j < nums2.length; j++){
                // find where nums1[i] = nums2[j]
                if(nums1[i] == nums2[j]){
                    int temp = j + 1;
                    //return next greater element in nums2
                    while(temp < nums2.length){
                        if(nums2[temp] > nums2[j]){
                            ans[i] = nums2[temp];
                            break;
                        }
                        temp++;
                    }
                    break;
                }
            }
        }
        return ans;
    }
}