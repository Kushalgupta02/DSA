class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k - 1);
    }
    private int atmost(int[] nums, int k){
        int left=0;
        int res=0;
        for(int right=0; right<nums.length; right++){
            if((nums[right]&1)==1){
                k--;
            }
            while(k<0){
                if((nums[left]&1)==1){
                    k++;
                }
                left++;
            }
            res+=right-left+1;
        }
        return res;
    }
}