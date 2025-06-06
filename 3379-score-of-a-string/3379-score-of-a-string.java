public class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.scoreOfString("hello"));  
        System.out.println(sol.scoreOfString("zaz")); 
    }
}

