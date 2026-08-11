class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int ans=nums[0];
        for(int num:nums){
            set.add(num);
        }
        for (int i = 1; i < nums.length; ++i) {
          if (nums[i] != nums[i - 1] + 1)
            break;
          ans += nums[i];
        }

        while (set.contains(ans))
          ++ans;

        return ans;
        }
}