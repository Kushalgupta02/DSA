class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
        if(s.length()==0)return 0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                if(open<=0)
                    close++;
                else{
                    open--;
                }
            }
        }
        int ans=Math.abs(open+close);
        //if(ans==0) return 0;
        return ans;
    }
}