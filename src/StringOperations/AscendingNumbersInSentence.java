package StringOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingNumbersInSentence {

    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 5 yellow marbles";

        System.out.println(check(s.split(" ")));
    }

    public static boolean check(String[] sArr) {
        int temp = Integer.MIN_VALUE;
        for (String s : sArr) {
            try {
                int val = Integer.parseInt(s);
                if (val > temp)
                    temp = val;
                else
                    return false;
            } catch (Exception ex) {
                //do nothing
            }
        }
        return true;
    }
}
