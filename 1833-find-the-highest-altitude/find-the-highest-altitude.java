class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int ans=0;
        for(int num: gain){
            sum+=num;
            ans=Math.max(ans, sum);
        }
        return ans;
    }
}