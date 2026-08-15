class Solution {
    public int superPow(int a, int[] b) {
        a%=1337;
        int res=1;
        for(int digit : b){
            res=mypow(res,10)*mypow(a,digit)%1337;
        }
        return res;
    } 
    private int mypow(int x,int n){
        int res=1;
        x%=1337;
        for(int i=0;i<n;i++){
            res=(res*x)%1337;
        }
        return res;
    }
}