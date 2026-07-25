class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(int i=0; i<details.length ;i++){
           String str = details[i];
           int n = str.charAt(11)-'0';
           int age =  n*10 + str.charAt(12)-'0';
           if(age > 60){
            count++;
           }   
        }
        return count;
    }
}