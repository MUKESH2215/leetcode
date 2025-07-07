import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> a=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(!(a.isEmpty()) && ch==a.peek())
            {
                a.pop();
            }
            else
            {
                a.push(ch);
            }
            
           
        }
         StringBuilder result = new StringBuilder();
        for (char ch : a) {
            result.append(ch);
        }

        return result.toString();
    }
}