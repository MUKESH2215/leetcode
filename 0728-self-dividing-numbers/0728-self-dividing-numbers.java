class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ans=new ArrayList<>();
        int c=0;
        int[] arr=new int[c];
        for(int i=left;i<=right;i++)
        {
            int temp=i;
            boolean isSelfDividing = true;
            while(temp!=0)
            {
                int rem=temp%10;
                if(rem==0|| i%rem!=0)
                {
                    isSelfDividing = false;
                }
                temp=temp/10;
            }
             if (isSelfDividing) {
                ans.add(i);
            }
        }
        return ans;
    }
}