class Solution {
    public int maxDifference(String s) {
        int maxOdd = 0;
        int minEven = 101;

        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : array) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> pairs : map.entrySet()) {
            if (pairs.getValue() % 2 == 0) {
                if (pairs.getValue() < minEven) {
                    minEven = pairs.getValue();
                }
            } else if (pairs.getValue() % 2 != 0) {
                if (pairs.getValue() > maxOdd) {
                    maxOdd = pairs.getValue();
                }
            }
        }

        int solution = maxOdd - minEven;
        return solution;
    }
}