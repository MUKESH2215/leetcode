class Solution {
    public int majorityElement(int[] nums) {
    int count=0;
    int candi=0;
    for(int n:nums)
    {
        if(count==0)
        {
            candi=n;
        }
        if(n==candi)
        {
            count++;
        }
        else
        {
            count--;
        }
    }
    return candi;
     
    }
}