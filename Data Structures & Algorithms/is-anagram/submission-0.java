class Solution {
    public boolean isAnagram(String s, String t) {
        // use hashMaps, hashMaps should equal each other

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (sMap.containsKey(x)) {
                sMap.put(x, sMap.get(x) + 1);
            } else {
                sMap.put(x, 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char y = t.charAt(j);
            if (tMap.containsKey(y)) {
                tMap.put(y, tMap.get(y) + 1);
            } else {
                tMap.put(y, 1);
            }
        }

        if (sMap.equals(tMap)) {
            return true;
        } else {
            return false;
        }
    }
}
