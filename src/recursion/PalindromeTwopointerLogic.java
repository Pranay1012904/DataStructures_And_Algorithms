package recursion;

class PalindromeTwopointerLogic2 implements Runnable {
    String s1;

    public PalindromeTwopointerLogic2(String s1) {
        this.s1 = s1;
    }

    @Override
    public void run() {
        System.out.println(checker(s1));
    }

    public boolean checker(String s1) {
        int l = 0, r = s1.length() - 1;
        while (l <= r) {
            if (s1.charAt(l) != s1.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}


public class PalindromeTwopointerLogic implements Runnable {
    String s1;

    public PalindromeTwopointerLogic(String s1) {
        this.s1 = s1;
    }

    @Override
    public void run() {
        System.out.println(checker(s1));

    }

    public boolean checker(String s1) {
        int l = 0, r = s1.length() - 1;
        while (l <= r) {
            if (s1.charAt(l) != s1.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new PalindromeTwopointerLogic("ababa"), "Thread-1");
        t1.start();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        Thread t2 = new Thread(new PalindromeTwopointerLogic2("abakba"), "Thread-2");
        t2.start();
    }
}
