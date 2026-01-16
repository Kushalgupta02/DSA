class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int merge[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

        if (nums1[i] <= nums2[j]) {
            merge[k] = nums1[i];
            i++;
        } else {
            merge[k] = nums2[j];
            j++;
        }

        k++;

        }

        while (i < n1) {
        merge[k] = nums1[i];
        i++;
        k++;
        }

        while (j < n2) {
        merge[k] = nums2[j];
        j++;
        k++;
        }

        int len = merge.length;

        if (len % 2 == 0) {

        return (merge[len / 2] + merge[len / 2 - 1]) / 2.0;

        } else {
        return merge[len / 2];
        }
    }
}