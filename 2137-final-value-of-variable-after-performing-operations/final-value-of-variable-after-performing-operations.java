class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        int n=operations.length;
        for(String str:operations){
            if(str.charAt(1)=='+'){
                 x++;
            }
            else x--;
        }
        return x;
    }
}