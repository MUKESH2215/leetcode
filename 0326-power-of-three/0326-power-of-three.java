public class Solution {
    public boolean isPowerOfThree(int n) {
        
        for (int i = 0; i <= 31; i++) {
            long ans = (long) Math.pow(3, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}