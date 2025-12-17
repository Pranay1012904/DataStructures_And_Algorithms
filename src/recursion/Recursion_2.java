package recursion;

import java.util.Scanner;

//print n-1
public class Recursion_2 {
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
        System.out.println(n);
        rec_1(n-1);
    }
}
