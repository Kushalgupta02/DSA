class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        long ne=0;
        int rev = 0;

        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        while(rev>0){
            int r=rev%10;
            if(r!=0){
                ne=ne*10 + r;
                sum=sum+r;
            
            }
            
            rev=rev/10;
        }

        long res=ne*sum;
        return res;
    }
}