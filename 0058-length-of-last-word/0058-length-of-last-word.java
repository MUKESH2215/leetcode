class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        // int i = s.length() - 1;
        // while (i >= 0 && s.charAt(i) == ' ') {
        //     i--;
        // }
        // while (i >= 0 && s.charAt(i) != ' ') {
        //     length++;
        //     i--;
        //}
        //return length;

        String word[]=s.split(" ");
        for(String re:word)
        {
            StringBuilder str=new StringBuilder(re);
            length=str.length();
        }
        return length;
    }
}
