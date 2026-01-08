package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 8, 1, 5, 7, 3};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr){
        int key,curr;
        for(int usi=1;usi<arr.length;usi++){
            key=arr[usi];
            for(curr=usi-1; curr>=0 && arr[curr]>key;curr--){
                arr[curr+1]=arr[curr];
            }
            arr[curr+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
