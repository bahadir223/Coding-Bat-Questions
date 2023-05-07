package CodingBat_Questions.LambdaExercises.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q03 {
    /*

        Given a list of strings, return a list where each string has "*" added at its end.

        addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
        addStar(["hello", "there"]) → ["hello*", "there*"]
        addStar(["*"]) → ["**"]
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a","bb","ccc");
        System.out.println(addStar(myList));

    }

    public static List<String> addStar(List<String> strings) {
        return strings.stream().map(t->t+"*").collect(Collectors.toList());
    }



}
