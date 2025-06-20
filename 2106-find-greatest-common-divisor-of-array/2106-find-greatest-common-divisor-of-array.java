class Solution {
    public int findGCD(int[] nums) {
        int min=99999;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
           if(nums[i]<min)
            {
                min=nums[i];
            }
            
        }
        int GCD=0;
        for(int i=1;i<=max;i++)
        {
            if(max%i==0 && min%i==0)
            {
                GCD=i;
            }
        }
        return(GCD);
    }
}