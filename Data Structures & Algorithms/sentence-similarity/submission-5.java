class Solution {
    public boolean areSentencesSimilar(
        String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) {
            return false;
        }
        for (int i = 0; i < sentence1.length; i++) {
            if (sentence1[i].equals(sentence2[i])) {
                continue;
            }

            boolean found = false;
            for (List<String> pair : similarPairs) {
                boolean s1 = sentence1[i].equals(pair.get(0)) || sentence1[i].equals(pair.get(1));
                boolean s2 = sentence2[i].equals(pair.get(0)) || sentence2[i].equals(pair.get(1));
                if (s1 && s2) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true;
    }
}
