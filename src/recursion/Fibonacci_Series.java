package recursion;

import java.util.Scanner;

public class Fibonacci_Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter No Of Terms Of the Fibonacci Series Needed:");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++)
            System.out.print("\t"+fibonacci(i));

    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
