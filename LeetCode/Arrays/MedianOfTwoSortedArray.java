package LeetCode.Arrays;

// Que Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4};
        int[] nums2 = {3,5,6};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge(nums1, nums2, nums1.length, nums2.length);
        int n = arr.length;
        int ans = n/2;
        if (n % 2 == 0) {
            int sum = arr[ans] + arr[ans -1];
            return (double)sum/2;
        }
        return arr[ans];
    }

    public static int[] merge(int[] a, int[] b, int m, int n) {
        int[] arr = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            } else {
                arr[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j < n) {
            arr[k] = b[j];
            j++;
            k++;
        }
        return arr;
    }
}
