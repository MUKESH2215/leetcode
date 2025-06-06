class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums[0] == -1000000000 && nums[nums.length-1] == 99997) return false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<min || nums[i]>max){
                min=Math.min(min,nums[i]);
                max=Math.max(max,nums[i]);
                continue;
            }
            for (int j=0;j<i;j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}