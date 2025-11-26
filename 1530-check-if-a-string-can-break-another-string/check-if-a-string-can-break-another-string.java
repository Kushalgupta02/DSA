class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] a= s1.toCharArray();
        char[] b= s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean canbreak1=true;
        boolean canbreak2=true;
        for(int i=0; i<a.length; i++){
            if(a[i]<b[i]) canbreak1=false;
            if(b[i]<a[i]) canbreak2=false;
        }
        return canbreak1 || canbreak2;
    }
}