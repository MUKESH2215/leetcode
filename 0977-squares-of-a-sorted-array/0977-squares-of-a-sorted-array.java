class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Math.abs(nums[i]*nums[i]);

        }
        for(int i=0;i<nums.length;i++)
        {
            int ind=i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<nums[ind])
                {
                    ind=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[ind];
            nums[ind]=temp;
        }
        return nums;
    }
}