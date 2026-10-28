class Solution {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();

        char[] array = s.toCharArray();

        for(Character c: array){
            if(!(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')){
                sb.append(c);
            }
        }
        String solution = sb.toString();
        return solution;
    }
}
