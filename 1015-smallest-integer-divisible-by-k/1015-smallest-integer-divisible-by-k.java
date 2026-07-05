class Solution {
    public int smallestRepunitDivByK(int k) {
        // 1. Check if a solution is impossible
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int remainder = 0;
        
        // 2. Iterate through possible lengths from 1 up to k
        // The Pigeonhole Principle guarantees that if a solution exists, 
        // it will be found within k iterations.
        for (int length = 1; length <= k; length++) {
            // Calculate (remainder * 10 + 1) % k
            remainder = (remainder * 10 + 1) % k;
            
            // If remainder is 0, we found the smallest n
            if (remainder == 0) {
                return length;
            }
        }
        
        return -1;
    }
}