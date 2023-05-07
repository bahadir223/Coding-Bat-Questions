package CodingBat_Questions.LambdaExercises.Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q05 {
    /*
    Given a list of strings, return a list of the strings, omitting any string length 4 or more.


    noLong(["this", "not", "too", "long"]) → ["not", "too"]
    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
    noLong(["cccc", "cccc", "cccc"]) → []
     */

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("this", "not", "too", "long");
        System.out.println(noLong(myList));

    }

    public static List<String> noLong(List<String> strings) {
        return strings.stream().filter(t->t.length()<4).collect(Collectors.toList());
    }

}
