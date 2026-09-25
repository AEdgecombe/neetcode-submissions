class Solution {
    public List<String> commonChars(String[] words) {
        List<String> solution = new ArrayList<>();
        char[] array = words[0].toCharArray();

        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            String ch = String.valueOf(array[i]);
            for (int j = 1; j < words.length; j++) {
                if (!(words[j].contains(ch))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                solution.add(ch);
                for (int j = 1; j < words.length; j++) {
                    words[j] = words[j].replaceFirst(ch, "");
                }
            }
        }

        return solution;
    }
}