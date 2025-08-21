class Solution {
    public boolean checkPrimeFrequency(int[] nums)
    {
        
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                
                    if(nums[i]==nums[j])
                    {
                        count++;
                    }
                
            }
            if (isPrime(count)) {
                return true;
            }
        }
        return false;
    }
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int limit = (int) Math.sqrt(n);
        for (int k = 3; k <= limit; k += 2) {
            if (n % k == 0) return false;
        }
        return true;
    }
}