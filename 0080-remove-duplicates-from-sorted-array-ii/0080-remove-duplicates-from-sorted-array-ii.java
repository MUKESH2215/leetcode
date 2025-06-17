class Solution {
    public int removeDuplicates(int[] nums) {
        int end=2;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]!=nums[end-2])
            {
               
                nums[end]=nums[i];
                end++;
            }
        }
        return end;
    }
}