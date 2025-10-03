class Solution {
    public int pivotInteger(int n) {
        int t=n*(n+1)/2;
        int leftSum=0;
        int rightSum=0;
        for(int i=1;i<=n;i++)
        {
            leftSum+=i;
            rightSum=t-leftSum+i;
            if(leftSum==rightSum)
            {
                return i;
            }
        }
        return -1;
    }
}