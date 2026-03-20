class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        sequence(nums, current, res);
        return res;

    }
    private void sequence(int nums[], List<Integer>current, List<List<Integer>>res){
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(current.contains(nums[i])) continue;
            current.add(nums[i]);
            sequence(nums, current, res);
            current.remove(current.size()-1);
            while((i+1)<nums.length && nums[i]==nums[i+1]){
            i++;
            }
        }
        

    }
}