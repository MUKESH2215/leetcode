class Solution {
    public int majorityElement(int[] nums) {
    int ans=0;
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
        if(count>Math.ceil((nums.length)/2))
        {
           return(nums[i]);
        }
     } 
            return -1;  
     
    }
}