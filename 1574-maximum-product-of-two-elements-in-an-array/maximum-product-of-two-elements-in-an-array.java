class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer>maxpq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            maxpq.offer(nums[i]);
        }
        int x=maxpq.poll();
        int y=maxpq.poll();
        return (x-1)*(y-1);
    }
}