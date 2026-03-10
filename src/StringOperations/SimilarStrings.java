package StringOperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SimilarStrings {

    public static void main(String[] args) {
        Runnable run=()->{
          SimilarStrings.similarStrings(new String[]{"aba","aabb","abcd","bac","aabc"});
        };
        Thread t1=new Thread(run,"killer - 1");
        t1.start();
        similarStrings(new String[]{"aabb","ab","ba"});
    }

    public static void similarStrings(String[] strings){
        int count=0;
        for(int i=0;i<strings.length;i++){
            String s=strings[i];
            Set<Character> temp1=new HashSet<>();
            for(Character c:s.toCharArray()){
                temp1.add(c);
            }
            Set<Character> temp2=new HashSet<>();
            for(int j=i+1;j<strings.length;j++){
                String s2=strings[j];
                for(Character c:s2.toCharArray()){
                    temp2.add(c);
                }
                if(temp1.equals(temp2)) count++;
                temp2.clear();
            }
        }
        System.out.println(Thread.currentThread().getName()+" :: "+ Arrays.toString(strings)+" :: "+count);
    }
}
