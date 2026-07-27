class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        return recursion(n, dp);
    }
    private int recursion(int n, int dp[]){
        if(n==0) return 0;
        if(dp[n]>0) return dp[n];
        int min=n;
        for(int i=1; i*i<=n;i++){
            min=Math.min(recursion(n-(i*i), dp), min);
        }
        dp[n]=min+1;
        return min+1;
    }
}