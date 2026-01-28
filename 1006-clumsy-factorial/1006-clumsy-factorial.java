class Solution {
    public int clumsy(int n) {
        Stack<Integer> st = new Stack<>();
        st.push(n);
        int op = 0;   // 0=*, 1=/, 2=+, 3=-
        n--;

        while (n > 0) {
            if (op == 0) {
                st.push(st.pop() * n);
            } 
            else if (op == 1) {
                st.push(st.pop() / n);
            } 
            else if (op == 2) {
                st.push(n);
            } 
            else {
                st.push(-n);
            }

            op = (op + 1) % 4;
            n--;
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }
}
