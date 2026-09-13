class Solution {
    public boolean isPalindrome(String s) {
        String original = s.replaceAll("[^a-zA-Z0-9]","");
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equalsIgnoreCase(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}
