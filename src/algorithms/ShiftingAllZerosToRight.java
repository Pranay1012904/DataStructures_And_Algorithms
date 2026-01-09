package algorithms;

import java.util.Arrays;

public class ShiftingAllZerosToRight {

    public static void main(String[] args) {
        int[] arr={1,0,3,4,0,9,8};

        pushZerosToEnd(arr);
        }

        public static void pushZerosToEnd(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<arr.length){
            arr[count]=0;
            count++;
        }
            System.out.print(Arrays.toString(arr));
        }
    }

