class Solution {
    public int lengthOfLastWord(String s) {
        String[] array = s.split("\\s+");
        int lastElementIndex = array.length - 1;
        String lastWord = array[lastElementIndex];
        int lastWordLength = lastWord.length();
        return lastWordLength;
    }
}