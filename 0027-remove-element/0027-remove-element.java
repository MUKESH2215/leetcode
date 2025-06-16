public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = sol.removeElement(nums1, val1);
        System.out.println("k = " + k1); // Output: 2
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " "); // Output: 2 2
        }

        System.out.println();

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        int k2 = sol.removeElement(nums2, val2);
        System.out.println("k = " + k2); // Output: 5
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " "); // Output could be any order of 0, 1, 3, 0, 4
        }
    }
}
