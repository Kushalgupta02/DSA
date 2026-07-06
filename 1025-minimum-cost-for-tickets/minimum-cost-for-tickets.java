class Solution {
    HashSet<Integer>set=new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        int last=days[days.length-1]+30;
        int dp[]=new int[last+1];
        Arrays.fill(dp, -1);
        for(int day:days){
            set.add(day);
        }
        return recur(dp, days, costs, days[0]);

    }
    int recur(int dp[], int days[], int costs[], int curr){
        if(curr>days[days.length-1]){
            dp[curr]=0;
            return 0;
        }
        if(dp[curr]!=-1){
            return dp[curr];
        }
        if(!set.contains(curr)){
            dp[curr]=recur(dp, days, costs, curr+1);
            return dp[curr];
        }
        int one=costs[0]+ recur(dp, days, costs, curr+1);
        int seven=costs[1]+ recur(dp, days, costs, curr+7);
        int thirty=costs[2]+ recur(dp, days, costs, curr+30);
        dp[curr]=Math.min(one, Math.min(seven, thirty));
        return dp[curr];
    }
}