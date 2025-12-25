package recursion;

import java.util.*;

public class UniquePermutationsUsingLinkedList {

    static List<List<Integer>> ans = new LinkedList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        Arrays.sort(arr);
        permutations(arr, new LinkedList<>(), new boolean[arr.length]);
        System.out.println(ans);
    }

    public static void permutations(int[] arr, LinkedList<Integer> used, boolean[] visited) {
        if (used.size() == arr.length) {
            ans.add(new LinkedList<>(used));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] || ((i > 0 && arr[i] == arr[i - 1]) && !visited[i - 1]))
                continue;
            used.add(arr[i]);
            visited[i] = true;
            permutations(arr, used, visited);
            visited[i]=false;
            used.removeLast();
        }
    }
}

