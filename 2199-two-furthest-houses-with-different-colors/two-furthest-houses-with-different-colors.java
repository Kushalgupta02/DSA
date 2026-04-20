class Solution {
    public int maxDistance(int[] colors) {
        int n= colors.length;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(colors[i]!=colors[j]){
                    count=Math.max(count, Math.abs(i-j));
                }
            }
            
        }
        return count;
    }
}