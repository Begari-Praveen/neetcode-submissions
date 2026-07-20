class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int low =0;
        int high = matrix[0].length-1;

        while(low<matrix.length&& high >=0){
            int num = matrix[low][high];
            if(num == target){
                return true;
            }
            else if(target > num){
                low++;
            }
            else{
                high--;
            }
        }
        return false;
    }
}
