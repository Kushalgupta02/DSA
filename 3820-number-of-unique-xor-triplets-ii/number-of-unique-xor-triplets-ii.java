class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if(nums.length==1) return 1;
        HashSet<Integer> pairs = new HashSet<>(); 
        BitSet ans = new BitSet();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                pairs.add(nums[i]^nums[j]);
            }
        }
        for(int pair: pairs){
            for(int num:nums){
                ans.set(pair^num);
            }
        }
        for(int num:nums){
            ans.set(num);
        }
        return ans.cardinality();
    }
}