class Solution {
    public String stringShift(String s, int[][] shift) {
        int netShift = 0;
        for (int[] move : shift) {
            if (move[0] == 1) {
                netShift += move[1];
            } else {
                netShift -= move[1];
            }
        }
        int n = s.length();
        netShift = ((netShift % n) + n) % n;
        return s.substring(n - netShift) + s.substring(0, n - netShift);
    }
}