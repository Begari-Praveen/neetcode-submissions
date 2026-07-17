class Solution {
    public boolean isPalindrome(String s) {        
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char ch[] = str.toCharArray();
        int low = 0;
        int high = ch.length-1;
        while(low<high){
            if(ch[low] != ch[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}