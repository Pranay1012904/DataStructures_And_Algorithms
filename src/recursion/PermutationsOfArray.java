package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PermutationsOfArray {
    public static List<List<Integer>> ans;
    public static void main(String[] args) {
      int[] arr={1,2,3};
      ans=new LinkedList<>();
        permutations(arr, new LinkedList<>());
        ans.forEach(System.out::println);
    }

    public static void permutations(int[] arr, LinkedList<Integer> perms){
        if(perms.size()==arr.length){
            ans.add(new ArrayList<>(perms));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!perms.contains(arr[i])){
                perms.add(arr[i]);
                permutations(arr,perms);
                perms.removeLast();
            }
        }
    }
}
