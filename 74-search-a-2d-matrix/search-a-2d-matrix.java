class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int k=0;
        int []mat=new int[m*n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[k++]=matrix[i][j];
            }
        }
        int low = 0, high = mat.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (mat[mid] == target)
                return true;

            
            if (mat[mid] < target)
                low = mid + 1;

            
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return false;
    }
}