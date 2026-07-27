class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        for(int i=1;i<=x;i++){
            long val = (long)i*i;
            if(val == x){
                return i;
            }
            else if(val > x){
                return i-1;
            }
        }
        return -1;
    }
}