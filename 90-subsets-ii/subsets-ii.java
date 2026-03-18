class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        Subset(0, nums, current, res);
        return res;
    }
    
    private void Subset(int index, int[] nums, List<Integer> current, List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<> (current));
            return;
        }
        current.add(nums[index]);
        Subset(index+1, nums, current, res);
        current.remove(current.size()-1);
        while((index+1)<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        Subset(index+1, nums, current, res);
    }

}