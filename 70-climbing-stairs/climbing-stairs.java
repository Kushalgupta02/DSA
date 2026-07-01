class Solution {
    public int climbStairs(int n) {
        int dp[] =new int[n+1];
        return helper(dp, n);
    }
    private int helper(int dp[], int n){
        if(n==1 || n==2)
            return dp[n]=n;
        if(dp[n]!=0)
            return dp[n];
        int x=helper(dp, n-1);
        int y=helper(dp, n-2);
        dp[n]=x+y;
        return dp[n];
    }
}