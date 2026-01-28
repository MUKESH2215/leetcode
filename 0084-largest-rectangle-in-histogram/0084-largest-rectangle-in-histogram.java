class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        // Next Smaller Element (right)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        st.clear();

        // Previous Smaller Element (left)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = h[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
