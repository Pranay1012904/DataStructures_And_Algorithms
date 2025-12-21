package algorithms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {
        Thread t1=new Thread(new Thread_1("pwwkew"),"CHECK-1");
        t1.start();
    }
}

class Thread_1 implements Runnable {
    String s;

    public Thread_1(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        longestSubstring(s);
    }

    public void longestSubstring(String s) {
        int l = 0, r = 0, max = 0;
        Set<Character> mySet=new HashSet<>();
        while(r<s.length()){
            if( !mySet.contains(s.charAt(r))){
                mySet.add(s.charAt(r));
                max=Math.max(max,(r-l)+1);
                r++;
            }else{
                mySet.clear();
                l++;
                r=l;
            }
        }
        System.out.println("LONGEST SUBSTRING :: "+max+" THREAD :: "+Thread.currentThread().getName());
    }
}
