package recursion;

public class MultiplyWithoutMultiply {
    int counter=0;
    public static void main(String[] args) {
        MultiplyWithoutMultiply mwm=new MultiplyWithoutMultiply();
        System.out.println(mwm.multiply(5,4));
    }

    public int multiply(int n,int m){
        if(m==0)
            return 0;
        return multiply(n,m-1)+n;
    }
}
