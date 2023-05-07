package CodingBat_Questions.LambdaExercises.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q08 {
    /*

    Given a list of strings, return a list where each string is converted to lower case
    (Note: String toLowerCase() method).


    lower(["Hello", "Hi"]) → ["hello", "hi"]
    lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
    lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Hello","Hi");
        System.out.println(lower(myList));

    }

    public static List<String> lower(List<String> strings) {
        return strings.stream().map(t->t.toLowerCase()).collect(Collectors.toList());
    }
}
