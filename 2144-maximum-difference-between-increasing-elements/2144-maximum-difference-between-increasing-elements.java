class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        int min;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                if(i<j)
                {               
                    min=nums[j]-nums[i];
                    if(max<min)
                    {
                        max=min;
                    }
                }
                
            }

        }
        if(max>0)
        {
        return max;
        }
        else
        {
            return -1;
        }
    }
}