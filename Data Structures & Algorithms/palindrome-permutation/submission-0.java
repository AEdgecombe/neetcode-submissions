class Solution {
    public boolean canPermutePalindrome(String s) {
        int odd = 0;

        char[] array = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char ch : array) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        for (Integer value : hashMap.values()) {
            if (value % 2 != 0) {
                odd++;
            }
        }

        if (odd > 1) {
            return false;
        }

        return true;
    }
}
