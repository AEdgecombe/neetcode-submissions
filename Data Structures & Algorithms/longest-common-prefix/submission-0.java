class Solution {
    public String longestCommonPrefix(String[] strs) {
        String solution = "";
        if (strs.length == 0) {
            return solution;
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                solution += first.charAt(i);
            } else {
                break;
            }
        }

        return solution;
    }
}