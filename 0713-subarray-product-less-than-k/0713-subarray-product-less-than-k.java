class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int l=0;
        long p=1;
        int count=0;
        for(int r=0;r<nums.length;r++)
        {
            p=p*nums[r];
            while(p>=k)
            {
                p=p/nums[l];
                l++;
            }
        count+=(r-l+1);
        }
    return count;
    }
}