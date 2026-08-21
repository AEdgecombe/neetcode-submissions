class Solution {
    public List<String> stringMatching(String[] words) {


        // Created an array list with the same order as words
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            arrayList.add(words[i]);
        }

        // Create the array list solution
        ArrayList<String> solution = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i].toLowerCase();

            for (int j = 0; j < arrayList.size(); j++) {
                String listWord = arrayList.get(j).toLowerCase();
                if (i != j) {
                    if (listWord.contains(currentWord)) {
                        solution.add(currentWord);
                        break;
                    }
                }
            }
        }

        return solution;
    }
}