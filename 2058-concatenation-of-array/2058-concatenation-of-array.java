class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[2*nums.length];
       System.arraycopy(nums, 0, res, 0, nums.length);
        System.arraycopy(nums, 0, res, nums.length, nums.length);
        return res;
    }
}
