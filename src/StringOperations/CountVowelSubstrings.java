package StringOperations;

import java.util.HashMap;

public class CountVowelSubstrings {

    public static void main(String[] args) {
      String s="aeiouu";
      int ans=solve(s);
        System.out.println(ans);
    }
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


        static int solve(String s) {
            int ans = 0, N = s.length();
            HashMap<Character, Integer> cnt = new HashMap<>();
           for(int i=0;i<N;i++){
               cnt.clear();
               for(int j=i;j<N && isVowel(s.charAt(j));j++){
                   cnt.put(s.charAt(j),(cnt.getOrDefault(s.charAt(j),0)+1));
                   if(cnt.size()==5) ++ans;
               }

            }

        return ans;
    }
}
