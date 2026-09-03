class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        for (Character ch : ransomArray) {
            ransomMap.put(ch, ransomMap.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : magazineArray) {
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }

        for (HashMap.Entry<Character, Integer> entry : ransomMap.entrySet()) {
            Character letter = entry.getKey();
            Integer occurence = entry.getValue();

            if (magazineMap.getOrDefault(letter, 0) < occurence) {
                return false;
            }
        }

        return true;
    }
}