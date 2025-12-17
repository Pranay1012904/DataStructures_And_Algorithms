package recursion;

import java.util.Scanner;

//print 1-n
public class Recursion_1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base case:");
        int n=s.nextInt();
        rec_1(n);
    }

    public static void rec_1(int n){
        if(n<1){
            return;
        }
        rec_1(n-1);
        System.out.println(n);
    }
}
