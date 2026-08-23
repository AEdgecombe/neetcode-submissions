class Solution {
    public boolean confusingNumber(int n) {
        int temp = n;
        int newNumber = 0;

        if (n == 1 || n == 0 || n == 8) {
            return false;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                newNumber = (newNumber * 10) + digit;
                if (digit == 2 || digit == 3 || digit == 4 || digit == 5 || digit == 7) {
                    return false;
                }
                temp = temp / 10;
            }
            if (newNumber >= 10) {
                if (newNumber == n) {
                    return false;
                }
            }
            return true;
        }
    }
}
