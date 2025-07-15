class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if (n < 3) return false;
        boolean vowel = false;
        boolean consonant = false;
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (ch == '@' || ch == '#' || ch == '$') return false;

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowel = true;
            }
        
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonant = true;
            }
        }

        return vowel && consonant;
    }
}

