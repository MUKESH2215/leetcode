class Solution {
    public int diagonalPrime(int[][] nums) {
        List<Integer> diagonalPrimes = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val1 = nums[i][i];
            int val2 = nums[i][nums.length - i - 1];

            if (isPrime(val1)) diagonalPrimes.add(val1);
            if (isPrime(val2)) diagonalPrimes.add(val2);
        }

        int maxPrime = 0;
        for (int prime : diagonalPrimes) {
            if (prime > maxPrime) {
                maxPrime = prime;
            }
        }

        return maxPrime;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}