package CodingBat_Questions.LambdaExercises.Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q06 {
    /*
    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

    no34(["a", "bb", "ccc"]) → ["a", "bb"]
    no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
    no34(["ccc", "dddd", "apple"]) → ["apple"]
     */

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("ccc", "dddd", "apple");
        System.out.println(no34(myList));

    }

    public static List<String> no34(List<String> strings) {
        return strings.stream().filter(t->t.length()<3 ||t.length()>4).collect(Collectors.toList());
    }

}
