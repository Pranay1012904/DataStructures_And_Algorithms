package algorithms;

//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
//the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected
//and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given an integer array nums representing the amount of money of each house,
//return the maximum amount of money you can rob tonight without alerting the police.
//------------------------------------------------------------------------------------
//Example 1:
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//Total amount you can rob = 1 + 3 = 4.
//-------------------------------------------------------------------------------------
//Example 2:
//Input: nums = [2,7,9,3,1]
//Output: 12
//Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
//Total amount you can rob = 2 + 9 + 1 = 12.

import java.util.Arrays;

public class HouseRobber {

    public static void main(String[] args) {
        // int[] nums = {2, 7, 9, 3, 1};
        //System.out.println("MAX ::" + houseRobber(nums));
        Thread t1 = new Thread(new Thread_101(new int[]{2, 7, 9, 3, 1}));
        Thread t2 = new Thread(new Thread_102(new int[]{1, 2, 3, 1}));
        t1.start();
        t2.start();
    }

    public static int houseRobber(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        if (n == 0) return 0;
        if (n == 1) return arr[0];
        dp[0] = arr[0];
        dp[1] = arr[1];

        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }
        return dp[n - 1];
    }
}

class Thread_101 implements Runnable {
    int[] nums;

    public Thread_101(int[] nums) {
        this.nums = nums;
    }

    @Override
    public void run() {
        int res = HouseRobber.houseRobber(nums);
        System.out.println(Arrays.toString(nums) + "\n ROBBED ::" + res + " --" + Thread.currentThread().getName());
    }
}

class Thread_102 implements Runnable {
    int[] nums;

    public Thread_102(int[] nums) {
        this.nums = nums;
    }

    @Override
    public void run() {
        int res = HouseRobber.houseRobber(nums);
        System.out.println(Arrays.toString(nums) + "\n ROBBED ::" + res + " --" + Thread.currentThread().getName());
    }
}

