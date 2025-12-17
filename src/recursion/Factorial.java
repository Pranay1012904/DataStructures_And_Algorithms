package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :: ");
        int n=sc.nextInt();
        Factorial fact=new Factorial();
        int factorial=fact.facto(n);
        System.out.println("FACTORIAL :: "+factorial);
    }

    public  int facto(int fact){
        if(fact==1)
            return 1;
        return fact*facto(fact-1);
    }
}
