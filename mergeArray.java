class Solution {
    public void mergeArray(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int p = m + n - 1;
    while ((p1 >= 0) && (p2 >= 0)){
          nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
}
    System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 num1 成为一个有序数组。