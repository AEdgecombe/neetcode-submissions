class Solution {
    public boolean isDecomposable(String s) {
        int twoCount = 0;
        String[] splits = s.split("(?<=(.))(?!\\1)");

        for (String results : splits) {
            int len = results.length();
            if (len % 3 == 2) {
                twoCount += 1;
            } else if (len % 3 == 1) {
                return false;
            }
            if (twoCount > 1) {
                return false;
            }
        }

        if (twoCount != 1) {
            return false;
        } else {
            return true;
        }
    }
}