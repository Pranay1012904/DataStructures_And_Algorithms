package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 8, 1, 5, 7, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]){

        for(int usi=0;usi<arr.length-1;usi++){
            for(int minIndex=usi+1;minIndex<arr.length;minIndex++){
                if(arr[usi]>arr[minIndex]){
                    swap(arr,usi,minIndex);
                }
            }
        }

    }

    public static void swap(int []arr, int usi, int minIndex ){
        arr[usi]+=arr[minIndex];
        arr[minIndex]=arr[usi]-arr[minIndex];
        arr[usi]-=arr[minIndex];
    }
}
