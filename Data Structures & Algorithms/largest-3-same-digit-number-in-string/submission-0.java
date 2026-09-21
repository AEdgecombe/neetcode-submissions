class Solution {
    public String largestGoodInteger(String num) {
        String[] solutions = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};

        for (String s : solutions) {
            if (num.contains(s)) {
                return s;
            }
        }

        return "";
    }
}