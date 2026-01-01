class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxprod=nums[0];
        int minprod=nums[0];
        int res=nums[0];
        for(int i=1; i<n; i++){
            int temp=maxprod;
            if(nums[i]<0){
                int swap=maxprod;
                maxprod=minprod;
                minprod=swap;
            }
            maxprod=Math.max(nums[i], nums[i]*maxprod);
            minprod=Math.min(nums[i], nums[i]*minprod);
            res=Math.max(res, maxprod);
        }
        return res;
    }
}