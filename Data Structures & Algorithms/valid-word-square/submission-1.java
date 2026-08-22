class Solution {
    public boolean validWordSquare(List<String> words) {
        for(int i = 0; i < words.size(); i++){
            StringBuilder sb = new StringBuilder();
            String word = words.get(i);
            for(int j = 0; j < word.length(); j++){
                if (j >= words.size() || i >= words.get(j).length()) {
                    return false;
                }
                sb.append(words.get(j).charAt(i));
            }
            String check = sb.toString();
            if(!check.equalsIgnoreCase(word)){
                return false;
            }
        }
        return true;
    }
}
