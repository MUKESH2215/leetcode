public class Solution {
    // you need to treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;         // Left shift result
            result |= (n & 1);    // Add the least significant bit of n to result
            n >>>= 1;             // Unsigned right shift of n
        }
        return result;
    }
}

