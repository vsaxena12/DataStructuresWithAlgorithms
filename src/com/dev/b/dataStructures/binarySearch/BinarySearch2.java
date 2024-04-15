package com.dev.b.dataStructures.binarySearch;

public class BinarySearch2 {
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }
}
