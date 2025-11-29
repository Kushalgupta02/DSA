class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int maxPairsum=0;
        while(left<right){
            int pairSum= nums[left] + nums[right];
            maxPairsum=Math.max(pairSum, maxPairsum);
            left++;
            right--;
        }
        return maxPairsum;
    }
}