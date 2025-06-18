class Solution {
    public int maximumWealth(int[][] accounts) {
        int a=accounts.length;
        int b=accounts[0].length;
        int max=0;
        for(int i=0;i<a;i++)
        {
            
            int count=0;
            for(int j=0;j<b;j++)
            {
                count+=accounts[i][j];
                
            }
            if(count>max)
            {
                max=count;
            }
            
          
        }
        return max;

    }
}