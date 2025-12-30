import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
    if(n==0){
        return 0;
    }
    int longest=1;
    Set<Integer> set = new HashSet<>();
    for(int i=0; i<n; i++){
        set.add(nums[i]);
    }
    for(int x: set){
        if(!set.contains(x-1)){
            int count=1;
            int y=x;
            while(set.contains(y+1)){
                y=y+1;
                count+=1;
            }
            longest=Math.max(longest, count);

        }
        
    }
    return longest;
    }
}