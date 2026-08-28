class Solution {
    public int calculateTime(String keyboard, String word) {
        int value = 0;
        int solution = 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] array = keyboard.toCharArray();
        char[] wordArray = word.toCharArray();

        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], i);
        }

        for (int i = 0; i < wordArray.length; i++) {
            int letterValue = hashMap.get(wordArray[i]);
            solution = solution + Math.abs(letterValue - value);
            value = letterValue;
        }

        return solution;
    }
}
