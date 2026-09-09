class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];

        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                count[c - 'a']++;
            }
        }

        for (int num : count) {
            if (num % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}