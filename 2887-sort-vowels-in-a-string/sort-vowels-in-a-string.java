class Solution {
    public String sortVowels(String s) {
        List<Character> vowels=new ArrayList<>();
        for(char ch: s.toCharArray()){
            if(isVowel(ch)){
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        StringBuilder sb=new StringBuilder();
        int index=0;
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                sb.append(vowels.get(index++));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'; 
    }
}