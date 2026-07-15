class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<=j){
            while(i<j && !isVowel(sb.charAt(i)))
                ++i;
            while(i<j && !isVowel(sb.charAt(j)))
                --j;
            sb.setCharAt(i, s.charAt(j));
            sb.setCharAt(j, s.charAt(i));
            ++i;
            --j;
        }
        return sb.toString();
        
    }
    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'; 
    }
}