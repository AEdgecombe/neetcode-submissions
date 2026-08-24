class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();

        int size = nums1.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (nums1[i] == nums2[j]) {
                    result.add(j);
                    break;
                }
            }
        }

        int solutionSize = result.size();
        int[] solution = new int[solutionSize];

        for (int i = 0; i < solutionSize; i++) {
            solution[i] = result.get(i);
        }

        return solution;
    }
}
