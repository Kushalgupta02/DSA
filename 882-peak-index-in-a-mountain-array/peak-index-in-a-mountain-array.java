class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int ans=0;
        for(int i=1; i<=r; i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                ans= i;
            }
        }
        return ans;
    }
}