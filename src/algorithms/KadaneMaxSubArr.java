package algorithms;

public class KadaneMaxSubArr {
    //    Kadane's algorithm is primarily used to solve the maximum subarray sum problem,
//    which involves finding the contiguous subarray within
//    a one-dimensional array of numbers that has the largest sum.
//    This problem is a classic example of dynamic programming and can be solved very efficiently using this algorithm.
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        KadaneMaxSubArr obj = new KadaneMaxSubArr();
        obj.kadane(arr);
    }

    public void kadane(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }
        System.out.println("MAX :: "+max);
    }
}
