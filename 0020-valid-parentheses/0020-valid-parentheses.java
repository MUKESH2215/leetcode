import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
        
    //     System.out.println(sol.isValid("()"));       
    //     System.out.println(sol.isValid("()[]{}"));   
    //     System.out.println(sol.isValid("(]"));      
    //     System.out.println(sol.isValid("([])"));    
    // }
}
