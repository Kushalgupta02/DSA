class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, (a, b)->{
            if(a[0]==b[0])
                return b[1]-a[1];
            return a[0]-b[0];
        });
        int remove=0;
        int prev=0;
        for(int i=1; i<n; i++){
            int start=intervals[i][0], end=intervals[i][1];
            int prevs=intervals[prev][0], preve=intervals[prev][1];
            if(start>=prevs && end<=preve){
                remove++;
            }
            else prev=i;
        }
        return n-remove;
    }
}