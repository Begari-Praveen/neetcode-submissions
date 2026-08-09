class Solution {
    public int pivot(int[] nums){
        int low =0;
        int high = nums.length-1;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(mid < high && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > low &&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[low] < nums[mid]){
               low = mid;
            }
            else{
               high = mid-1;
            }
        }
        return 0;
    }
    public int binarySearch(int[] nums,int low,int high,int target){
        while(low <= high){
            int mid = low +(high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
         int pivot =pivot(nums);
         int result =  binarySearch(nums,0,pivot,target);
          if(result == -1){
             return  binarySearch(nums,pivot+1,nums.length-1,target);
          }
          return result;
    }
}
