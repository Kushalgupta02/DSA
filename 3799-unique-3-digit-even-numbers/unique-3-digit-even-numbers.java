class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }
        
        int uniqueCount = 0;
        for (int num = 100; num < 1000; num += 2) {
            int h = num / 100;
            int t = (num / 10) % 10;
            int u = num % 10;
            
            int[] needed = new int[10];
            needed[h]++;
            needed[t]++;
            needed[u]++;
            
            boolean canForm = true;
            for (int i = 0; i < 10; i++) {
                if (needed[i] > count[i]) {
                    canForm = false;
                    break;
                }
            }
            
            if (canForm) {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}