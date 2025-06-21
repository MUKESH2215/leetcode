class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double max=Integer.MIN_VALUE;
        if(nums.length==1) return nums[0];
        for(int i=0;i<=nums.length-k;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum=sum+nums[j];  
            }          
        max=Math.max(max,(double)sum/k);
            
        }
    return(max);
    }
}