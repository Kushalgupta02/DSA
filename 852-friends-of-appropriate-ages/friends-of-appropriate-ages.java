class Solution {
    public int numFriendRequests(int[] ages) {
        int[] freq = new int[121];

        // frequency count
        for (int age : ages) {
            freq[age]++;
        }

        int requests = 0;

        for (int x = 1; x <= 120; x++) {
            if (freq[x] == 0) continue;

            for (int y = 1; y <= 120; y++) {
                if (freq[y] == 0) continue;

                if (y <= 0.5 * x + 7) continue;
                if (y > x) continue;
                if (y > 100 && x < 100) continue;

                requests += freq[x] * freq[y];

                // remove self requests
                if (x == y) {
                    requests -= freq[x];
                }
            }
        }

        return requests;
    }
}
