class Solution {
    public int numberOfMatches(int n) {
       
        // int match=0;
        // int adv=0;
        
        // while(n!=1)
        // {
        //     if(n%2==0)
        //     {
        //     match+=Math.floor(n/2);
        //     adv=(int)Math.ceil(n/2);
           
        //     }
        //     else
        //     {
        //        match+=Math.floor((n-1)/2);
        //         adv=(int)Math.ceil(((n-1)/2)+1);
           
        //     }
        //      n=adv;
        // }
        // int sum=0;
        // while(n!=1)
        // {
        //     sum+=n/2;
        //     n-=n/2;
        // }
        // return sum;
        return n-1;
    }
}