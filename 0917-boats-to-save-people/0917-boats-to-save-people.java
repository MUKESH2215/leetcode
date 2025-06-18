class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=0;
        int r=people.length-1;
        int boat=0;
        Arrays.sort(people);
        while(l<=r)
        {
            if(people[l]+people[r]>limit)
            {
                r--;
                boat++;
            }
            else if(people[l]+people[r]<=limit)
            {
                l++;
                r--;
                boat++;
            }
            

        }
        
        return boat;
    }
}