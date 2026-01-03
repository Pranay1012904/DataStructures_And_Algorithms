package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
        static int count=0;
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3, 5, 7, 8};
//        int[] arr = {1,2,4,5,7,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j+1]<arr[j]){
                    arr[j]+=arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]-=arr[j+1];
                    count++;
                    flag=true;
                }
            }
            if(!flag) break;
        }
        System.out.println(count);
    }
}
