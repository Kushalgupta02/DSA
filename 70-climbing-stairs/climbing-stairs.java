class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int states=3; states<=n; states++){
            dp[states]=dp[states-1]+dp[states-2];
        }
        return dp[n];
    }
    
}