package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning {

    static List<List<String>> ans=new ArrayList<>();

    public static void main(String[] args) {
        helper("abaaba", new LinkedList<>());
        System.out.println(ans);
    }

    public static void helper(String s, LinkedList<String> currentPartitions){
        if(s.isEmpty()){
            ans.add(new LinkedList<>(currentPartitions));
            return;
        }
        for(int partitions=1; partitions<=s.length(); partitions++){
            String prefix=s.substring(0,partitions);
            String remaining=s.substring(partitions);
            if(isPalindrome(prefix,0,prefix.length()-1)){
                currentPartitions.add(prefix);
                helper(remaining,currentPartitions);
                currentPartitions.removeLast();
            }
        }
    }

    public static boolean isPalindrome(String p,int l,int r){
        if(l>=r) return true;
        return p.charAt(l)==p.charAt(r) && isPalindrome(p, l+1, r-1);
    }
}
