class Solution {
    public int minOperations(String[] logs) {
        int steps = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (steps > 0) {
                    steps = steps - 1;
                }
            } else if (!logs[i].equals("./")) {
                steps = steps + 1;
            }
        }
        return steps;
    }
}