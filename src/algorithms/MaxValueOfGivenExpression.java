package algorithms;

public class MaxValueOfGivenExpression {
    //Find Max Value of expression |arr[i]+arr[j]| +|i-j|
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 5};
        bruteForce(arr);
    }

    public static void bruteForce(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
             max=Math.max(max,(Math.abs(arr[i]-arr[j])+Math.abs(i-j)));
            }
        }
        System.out.println("MAX VALUR FOR EXPRESSION:" +max);
    }
}
