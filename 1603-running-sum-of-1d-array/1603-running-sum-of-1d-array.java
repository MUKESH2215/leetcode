class Solution {
    public int[] runningSum(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[j];
            j++;
        }
        return nums;
    }
}