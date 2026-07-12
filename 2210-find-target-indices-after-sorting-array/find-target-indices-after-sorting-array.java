class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smallcount=0;
        int targetcount=0;
        
        for(int num:nums){
            if(num<target){
                smallcount++;
            }else if(num==target){
                targetcount++;
            }

        }
        
    List<Integer> result=new ArrayList<>();
    for(int i=0;i<targetcount;i++){
        result.add(smallcount+i);
        }
    
    return result;
    }
}