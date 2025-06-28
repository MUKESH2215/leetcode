class Solution {
    public int countDigits(int num) {
        int count=(int)Math.log10(num)+1;
        int temp=num;
        int count1=0;
        for(int i=0;i<count;i++)
        {
            int res=num%10;
            if(temp%res==0)
            {
                count1++;
            }
            num=num/10;
        }
        return count1;
    }
}