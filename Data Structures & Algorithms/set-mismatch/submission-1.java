class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] solution = new int[2];

        for (Integer num : nums) {
            if (set.add(num) == false) {
                solution[0] = num;
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                solution[1] = i;
                break;
            }
        }

        return solution;
    }
}