package recursion;

public class PalindromeUsingRecursion {

    public static void main(String[] args) {
        String s = "abchba";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }

    public static boolean isPalindrome(String s, int l, int r) {
        if (l >= r) return true;
        return s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1);
    }
}
