class Solution {
    public boolean isAnagram(String s, String t) {
        char[] word1 = s.toCharArray();
        char[] word2 = t.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        String new1 = new String(word1);
        String new2 = new String(word2);

        if (new1.equalsIgnoreCase(new2)) {
            return true;
        }
        return false;
    }
}
