class Solution {
    public int countElements(int[] arr) {
        int solution = 0;
        HashMap<Integer, Integer> nums = new HashMap<>();

        for (int num : arr) {
            nums.put(num, nums.getOrDefault(num, 0) + 1);
        }

        for (int num : nums.keySet()) {
            if (nums.containsKey(num + 1)) {
                solution = solution + nums.get(num);
            }
        }
        return solution;
    }
}
