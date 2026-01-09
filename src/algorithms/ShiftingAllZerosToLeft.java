package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftingAllZerosToLeft {
    public static void main(String[] args) {
        int[] arr={1,0,3,4,0,9,8};
        shiftingAllZerosToLeft(arr);
    }

    public static void shiftingAllZerosToLeft(int[] arr){
        int count=0;

        List<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                count++;
            }else{
            list.add(arr[i]);
            }
        }
        int[] arr2=new int[arr.length];
        for(int i=count;i<arr2.length;i++){
                arr2[i]=0;
        }
        int index=0;
        for(int i=count;i<arr2.length;i++){
            arr2[i]=list.get(index);
            index++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
