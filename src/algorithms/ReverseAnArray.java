package algorithms;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr={5,1,9,6,7,3};
        int l=0,r=arr.length-1,temp=Integer.MIN_VALUE;
        while(l<=r){
            temp=arr[r];
            arr[r--]=arr[l];
            arr[l++]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
