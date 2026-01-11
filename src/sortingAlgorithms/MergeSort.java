package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 5, 1, 7, 4};
        int[] sorted=mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] mergeSort(int[] arr, int start, int end) {
       if(start==end){
           return new int[]{arr[start]};
       }
        int mid = (start + end) / 2;
        int[] fH=mergeSort(arr,start,mid);
        int[] sH=mergeSort(arr,mid+1,end);
        return merge(fH,sH);
    }

    public static int[] merge(int[] a, int[] b){
        int[] res=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                res[k++]=a[i++];
            }else{
                res[k++]=b[j++];
            }
        }

        while(i<a.length){
            res[k++]=a[i++];
        }
        while(j<b.length){
            res[k++]=b[j++];
        }
        return res;
    }
}
