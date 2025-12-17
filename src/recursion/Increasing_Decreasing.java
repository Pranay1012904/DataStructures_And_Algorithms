package recursion;

//43211234
public class Increasing_Decreasing {
    public static void main(String[] args) {
        recursion(4);
    }

    public static void recursion(int n) {
        System.out.print(n);

        if (n == 1) {
            System.out.print(n);
            return;
        }
        recursion(n - 1);

        System.out.print(n);

    }
}
