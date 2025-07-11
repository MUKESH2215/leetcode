class Solution {
    public int[] dailyTemperatures(int[] arr) {
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     int count=1;
        //     int max=arr[i];
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[j]>max)
        //         {
        //             arr[i]=count;
        //             break;
        //         }
        //         count++;
        //     }
        //     if(arr[i]==max)
        //     {
        //         arr[i]=0;
        //     }
        // }
        // return(arr);
         Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result; 


    }
}