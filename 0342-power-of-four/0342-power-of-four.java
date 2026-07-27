class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        long x = 1;
        while (x < n) {
            x *= 4;
        }
        return x == n;
    }
}