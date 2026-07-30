class Solution {
    public int majorityElement(int[] nums) {
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
        int n = nums.length;
        for(int num:map.keySet()){
            if(map.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}