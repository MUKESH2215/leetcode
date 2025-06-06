class Solution {
    public boolean isHappy(int n) {
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int ans = 0;
            while (n > 0) {
                int a = n % 10;
                ans += a * a;
                n = n / 10;
            }
            n = ans;
        }

        return n == 1;
    }
}
