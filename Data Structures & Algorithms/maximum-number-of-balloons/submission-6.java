class Solution {
    public int maxNumberOfBalloons(String text) {
        String mapper = "balon";
        int min = 0;
        int min2 = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        char[] array = mapper.toCharArray();

        for (char ch : array) {
            map.put(ch, 0);
        }

        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
        }

        if (map.get('b') == 0 || map.get('a') == 0 || map.get('l') == 0 || map.get('o') == 0
            || map.get('n') == 0) {
            return 0;
        } else {
            if (map.containsKey('l') && map.containsKey('o')) {
                int lValue = map.get('l');
                int oValue = map.get('o');
                int temp = Math.min(lValue, oValue);
                min = temp / 2;
            }
            if (map.containsKey('b') && map.containsKey('a') && map.containsKey('n')) {
                int bValue = map.get('b');
                int aValue = map.get('a');
                int nValue = map.get('n');
                int temp1 = Math.min(bValue, aValue);
                int temp2 = Math.min(temp1, nValue);
                min2 = temp2;
            }

            int solution = Math.min(min, min2);
            return solution;
        }
    }
}