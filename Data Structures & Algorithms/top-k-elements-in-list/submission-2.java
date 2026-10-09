class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int num = nums[i];
        if(map.containsKey(num)){
            int prev = map.get(num);
            map.put(num,prev+1);
        }
        else{
            map.put(num,1);
        }
       }
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
       pq.addAll(map.keySet());
       int ans[] = new int[k];
       for(int i=0;i<ans.length;i++){
            ans[i] = pq.poll();
       }
       return ans;
    }
}
