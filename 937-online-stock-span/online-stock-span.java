class StockSpanner {
    Stack<Integer>s;
    ArrayList<Integer>list;
    public StockSpanner() {
        s=new Stack<>();
        list=new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        while(!s.isEmpty() && list.get(s.peek())<=price){
            s.pop();
        }
        int prev=(s.isEmpty())?-1:s.peek();
        int curr=list.size()-1;
        int ans=curr-prev;
        s.push(curr);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */