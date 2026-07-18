class Solution {
    public int maxArea(int[] heights) {
        
         int left =0;
         int right = heights.length-1;
         int max_water = Integer.MIN_VALUE;
         while(left < right){
            int length = Math.min(heights[left],heights[right]);
            int breadth = right - left;
            int area = length * breadth;
            max_water = Math.max(max_water,area);
            if(heights[left]<heights[right]){
               left++;
            }
            else{
                right--;
            }
         }
         return max_water;
    }
}
