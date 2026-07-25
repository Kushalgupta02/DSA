class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        while(n>0){
            int num=n%10;
            list.add(num);
            n=n/10;
        }
        Collections.sort(list);
        int m=list.size();
        int ans=list.get(m-1) * list.get(m-2);
        return ans;
    }
}