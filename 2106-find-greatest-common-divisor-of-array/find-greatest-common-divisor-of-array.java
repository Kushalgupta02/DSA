class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[0];
        int b=nums[n-1];
        int ans=gcd(a,b);
        return ans;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%temp;
            a=temp;
        }
        return a;
    }
}