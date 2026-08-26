class Solution {
    public int appendCharacters(String s, String t) {
        int index = 0;
        int i = 0;
        int j = 0;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
     
        while(i < s.length() && j < t.length()){
            if(sArray[i] == tArray[j]){
                index++;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        
        int result = t.length() - index;
        return result;
    }
}