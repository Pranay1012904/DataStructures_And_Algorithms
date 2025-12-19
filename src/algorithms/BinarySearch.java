package algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {23, 12, 45, 8, 67, 3, 89, 78, 99, 32};
        Arrays.sort(arr);
        System.out.println(binSearch(arr, 0, arr.length - 1, 77));
    }

    public static boolean binSearch(int[] arr, int l, int r, int key) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                l = mid + 1;
                binSearch(arr, l, r, key);
            } else if (arr[mid] > key) {
                r = mid - 1;
                binSearch(arr, l, r, key);
            }
        }
        return false;
    }
}
