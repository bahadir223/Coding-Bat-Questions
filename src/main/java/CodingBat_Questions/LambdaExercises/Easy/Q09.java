package CodingBat_Questions.LambdaExercises.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q09 {
    /*
    Given a list of strings, return a list where each string has all its "x" removed.


    noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
    noX(["x"]) → [""]
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("ax","bb","cx");
        System.out.println(noX(myList));
    }

    public static List<String> noX(List<String> strings) {
        return strings.stream().map(t->t.replace("x","")).collect(Collectors.toList());
    }

}
