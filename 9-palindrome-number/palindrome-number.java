class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int rev=0;
        int r=0;
        if(org<0){
            return false;
        }
        while(org>0){
            r=org%10;
            rev=rev*10+r;
            org=org/10;
        }
        return rev==x;
    }
}