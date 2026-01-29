package StringOperations;

public class CircularSentence {
    public static void main(String[] args) {
        String s = "leetcode exercises sound delightful";
        boolean res = checkCircular(s);
        System.out.println(res);
    }

    private static boolean checkCircular(String s) {
        boolean flag = true;
        String[] sArr = s.split(" ");
        if (sArr.length == 1) {
            if (sArr[0].charAt(0) != sArr[0].charAt(sArr[0].length() - 1)) {
                flag = false;
            }
        } else {
            if (sArr[0].charAt(0) != sArr[sArr.length - 1].charAt(sArr[sArr.length-1].length() - 1)) {
                flag = false;
            } else {
                for (int i = 0; i < sArr.length-1; i++) {
                    if (sArr[i].charAt(sArr[i].length() - 1) != sArr[i + 1].charAt(0)) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }
}
