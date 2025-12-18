package recursion;

public class PowerViaRecursion {

    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }

    public static int pow(int n, int p) {
        if(p==1)
            return n;
        return pow(n,p-1)*n;
    }
}
