class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(n,k,1,new ArrayList<>(),res);
        return res;
    }
    static void backtrack(int n,int k,int j,List<Integer>curr,List<List<Integer>>res)
    {
        if(curr.size()==k)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=j;i<=n;i++)
        {
            curr.add(i);
            backtrack(n,k,i+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}