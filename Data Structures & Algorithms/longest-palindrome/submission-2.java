class Solution {
    public int longestPalindrome(String s) {
        boolean hasOdd = false;
        int total = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        char[] array = s.toCharArray();

        for (Character ch : array) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count % 2 == 0) {
                total += count;
            } else {
                total += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) total += 1;
        return total;
    }
}