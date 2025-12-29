package StringOperations;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        String nS=s.replaceAll(" ","").toUpperCase();
        System.out.println(nS);
        Set<Character> set=new HashSet<>();
        for(int i=0;i<nS.length();i++){

                set.add(nS.charAt(i));

        }
        System.out.println(set.size());
    }
}
