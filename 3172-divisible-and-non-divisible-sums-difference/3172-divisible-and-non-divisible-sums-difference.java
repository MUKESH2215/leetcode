class Solution {
    public int differenceOfSums(int n, int m) {
        int divisible=0;
        int notdivisible=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                divisible=divisible+i;
            }
            else
            {
                notdivisible=notdivisible+i;
            }
            
        }
        return notdivisible-divisible;
    }
}