class Solution {
    public boolean canReach(int[] start, int[] target) {
        int sum1=start[0]+start[1];
        int sum2=target[0]+target[1];
        int ans=Math.abs(sum2-sum1);
        if(ans%2==0)return true;

        return false;
    }
}