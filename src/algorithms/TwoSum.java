package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 18};
        int target = 9;
        int[] ans=twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int comp = target - nums[i];
            if (myMap.containsKey(comp)) {
                return new int[]{myMap.get(comp), i};
            }
            myMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
