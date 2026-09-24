class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean flag = true;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        char[] array = allowed.toCharArray();

        for (Character c : array) {
            set.add(c);
        }

        for (int i = 0; i < words.length; i++) {
            flag = true;
            char[] array2 = words[i].toCharArray();
            for (int j = 0; j < array2.length; j++) {
                if (!set.contains(array2[j])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }
}