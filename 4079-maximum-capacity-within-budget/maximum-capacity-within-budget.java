class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        int[][] items = new int[n][2];
        for (int i = 0; i < n; i++) {
            items[i][0] = costs[i];
            items[i][1] = capacity[i];
        }

        java.util.Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        long maxCap = 0;
        int[] prefixMax = new int[n];
        int currentMax = 0;
        
        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax, items[i][1]);
            prefixMax[i] = currentMax;
        }

        for (int i = 0; i < n; i++) {
            int costI = items[i][0];
            int capI = items[i][1];

            if (costI < budget) {
                maxCap = Math.max(maxCap, (long)capI);
            } else {
                break;
            }

            int remainingBudget = budget - costI;
            
            int left = 0;
            int right = i - 1;
            int bestJ = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (items[mid][0] < remainingBudget) {
                    bestJ = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (bestJ != -1) {
                maxCap = Math.max(maxCap, (long)capI + prefixMax[bestJ]);
            }
        }

        return (int) maxCap;
    }
}