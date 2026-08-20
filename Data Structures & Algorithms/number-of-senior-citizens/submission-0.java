class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            String cur = details[i];
            char digit1 = cur.charAt(11);
            char digit2 = cur.charAt(12);

            int tens = (digit1 - '0') * 10;
            int units = (digit2 - '0') * 1;
            int age = tens + units;

            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}