class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int temp1=0;
        int rem=0;
        while(x>0)
        {
            rem=x%10;
            temp1+=rem;
            x=x/10;
        }
        if(temp%temp1==0)
        {
            return(temp1);
        }
        else
        {
            return(-1);
        }
    }
}