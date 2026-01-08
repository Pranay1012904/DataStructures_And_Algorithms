package algorithms;

public class RomantoInteger {
    public static void main(String[] args) {
        Thread t0=new Thread(new Thread_0("III"));
        Thread t2=new Thread(new Thread_2("LVIII"));
        Thread t3=new Thread(new Thread_3("MCMXCIV"));
        t0.start();
        t2.start();
        t3.start();
    }

}

class Thread_0 implements Runnable {
    String s;

    public Thread_0(String s) {
        this.s = s;
    }
    @Override
    public void run() {
        System.out.println(s+" ANSWER :: "+Helper.helper(s)+" THREAD :: "+Thread.currentThread().getName());
    }
}

class Thread_2 implements Runnable {
    String s;

    public Thread_2(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(s+ " :: ANSWER :: "+Helper.helper(s)+" THREAD :: "+Thread.currentThread().getName());
    }
}

class Thread_3 implements Runnable {
    String s;

    public Thread_3(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(s+":: ANSWER :: "+Helper.helper(s)+" THREAD :: "+Thread.currentThread().getName());
    }
}
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

class Helper {
    public static synchronized int helper(String s) {
        int num = 0, ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if(4*num<ans){
                ans-=num;
            }else{
                ans+=num;
            }
        }
        return ans;
    }
}