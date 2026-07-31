class Solution {
    List<List<String>>res=new ArrayList<>();
    int n;
    public List<List<String>> partition(String s) {
        n=s.length();
        recur(s, 0, new ArrayList<>());
        return res;
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void recur(String s, int partind, List<String> subsplit){
        if(partind==n){
            res.add(new ArrayList<>(subsplit));
        }
        for(int end=partind; end<n; end++){
            if(isPalindrome(s,partind, end)){
                subsplit.add(s.substring(partind, end+1));
                recur(s, end+1, subsplit);
                subsplit.remove(subsplit.size()-1);
            }
        }
    }
}