package algorithms;

//1131. Maximum of Absolute Value Expression
//Given two arrays of integers with equal lengths, return the maximum value of:
//
//        |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
//
//where the maximum is taken over all 0 <= i, j < arr1.length.
//        Example 1:
//
//Input: arr1 = [1,2,3,4], arr2 = [-1,4,5,6]
//Output: 13
//Example 2:
//
//Input: arr1 = [1,-2,-5,0,10], arr2 = [0,-2,-1,-7,-4]
//Output: 20
public class MaxValueOfGivenExpression_2 {
    public static void main(String[] args) {
        int[] a={1,2,3,4}; int[] b={-1,4,5,6};
        System.out.println(maxAbsValue(a,b));
    }

    public static int maxAbsValue(int[] a,int[] b){
        int c1max=Integer.MIN_VALUE;
        int c2max=Integer.MIN_VALUE;
        int c3max=Integer.MIN_VALUE;
        int c4max=Integer.MIN_VALUE;
        int c1min=Integer.MAX_VALUE;
        int c2min=Integer.MAX_VALUE;
        int c3min=Integer.MAX_VALUE;
        int c4min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            //case1
            c1max=Math.max(a[i]+b[i]+i,c1max);
            c1min=Math.min(a[i]+b[i]+i,c1min);
            //case2
            c2max=Math.max(b[i]-a[i]+i,c2max);
            c2min=Math.min(b[i]-a[i]+i,c2min);
            //case3
            c3max=Math.max(a[i]-b[i]+i,c3max);
            c3min=Math.min(a[i]-b[i]+i,c3min);
            //case3
            c4max=Math.max(i-b[i]-a[i],c4max);
            c4min=Math.min(i-b[i]-a[i],c4min);
        }

       return Math.max(Math.max((c1max-c1min),(c2max-c2min)),
        Math.max((c3max-c3min),(c4max-c4min)));

    }
}
