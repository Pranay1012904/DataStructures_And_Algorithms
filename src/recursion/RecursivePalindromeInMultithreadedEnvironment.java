package recursion;

public class RecursivePalindromeInMultithreadedEnvironment {
    public static void main(String[] args) {
        Thread t1=new Thread(new Thread_1("acbca"),"P-1");
        t1.start();
        try{
            Thread.sleep(2000L);
        }catch(InterruptedException ex){

        }
        Thread t2=new Thread(new Thread2("abcddba"),"P-2");
        t2.start();
    }
}

class Thread_1 implements Runnable {
    String s;

    public Thread_1(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " PALINDROME ::" + isPalindrome(s, 0, s.length() - 1));
    }

    public boolean isPalindrome(String s, int l, int r) {
        if (l >= r) return true;
        return s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1);
    }
}

class Thread2 implements Runnable {
    String s;

    public Thread2(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " PALINDROME ::" + isPalindrome(s, 0, s.length() - 1));
    }

    public boolean isPalindrome(String s, int l, int r) {
        if (l >= r) return true;
        return s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1);
    }
}
