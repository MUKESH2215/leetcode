public class Solution {
    public int removeElement(int[] nums, int val) {
        int end=nums.length;
        int count=0;
        for(int i=0;i<end;i++)
        {
            
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
            
        }
        return count;
        
}
}
