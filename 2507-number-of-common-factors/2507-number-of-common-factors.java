class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int c=0;
        if(a>b)
        {
            c=a;
        }       
        else if(b>a)
        {
            c=b;
        }
        else
        {
            c=a;
        } 
        for(int i=1;i<=c;i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        return count;
    }
}