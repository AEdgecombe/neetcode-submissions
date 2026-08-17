class Solution {
    public int scoreOfString(String s) {
        int solution = 0;
        char[] letters = s.toCharArray();
        int[] numbers = new int[letters.length];

        for (int i = 0; i < letters.length; i++) {
            int ascii = letters[i];
            numbers[i] = ascii;
        }

        for (int j = 1; j < numbers.length; j++) {
            int result = Math.abs(numbers[j] - numbers[j - 1]);
            solution = solution + result;
        }

        return solution;
    }
}