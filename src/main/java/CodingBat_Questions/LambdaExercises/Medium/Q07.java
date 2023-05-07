package CodingBat_Questions.LambdaExercises.Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q07 {
    /*
    Given a list of strings, return a list where each string has "y" added at its end,
    omitting any resulting strings that contain "yy" as a substring anywhere.

    noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
    noYY(["a", "b", "cy"]) → ["ay", "by"]
    noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
     */

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a", "b", "cy");
        System.out.println(noYY(myList));

    }

    public static List<String> noYY(List<String> strings) {
        return strings.
                stream().filter(t->!t.contains("yy")&&!t.endsWith("y")).
                map(t->t + "y").
                collect(Collectors.toList());

    }
}
