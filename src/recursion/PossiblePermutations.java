package recursion;

public class PossiblePermutations {

    public static void main(String[] args) {
        permutations("abc", "");
    }

    public static void permutations(String q, String a) {
        if (q.isEmpty()) {
            System.out.println(a);
            return;
        }
        for (int i = 0; i < q.length(); i++) {
            char c = q.charAt(i);
            String nq = q.substring(0, i) + q.substring(i + 1);
            permutations(nq, a + c);
        }

    }
}
