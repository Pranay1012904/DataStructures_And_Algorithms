package StringOperations;

public class ReverseString {
    public static void main(String[] args) {
        String s="abc";
        reverse_1(s);
        reverse_2(s);
    }

    public static void reverse_1(String s){
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println("BUFFER :: "+sb);

    }

    public static void reverse_2(String s){
        StringBuffer sb=new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(String.valueOf(s.charAt(i)));
        }
        System.out.println("REVERSE :: "+sb);
    }
}
