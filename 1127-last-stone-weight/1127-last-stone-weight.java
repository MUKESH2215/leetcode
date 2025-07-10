class Solution {
    // public int lastStoneWeight(int[] A) {
    //    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);
    //     for (int a : A)
    //         pq.offer(a);
    //     while (pq.size() > 1)
    //         pq.offer(pq.poll() - pq.poll());
    //     return pq.poll();
    // }


     public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        Arrays.sort(stones);
        for(int i=n-1;i>0;i--){
            stones[i-1]=stones[i]-stones[i-1];
            Arrays.sort(stones);
        }
        return stones[0];
    }
}