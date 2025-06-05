class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            System.out.println(result[i]); 
        }
        for (int i = n; i < 2 * n; i++) {
            result[i] = nums[i - n];
            System.out.println(result[i]);  
        }
        
        return result;
    }
}
