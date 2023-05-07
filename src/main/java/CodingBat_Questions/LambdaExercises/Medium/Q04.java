package CodingBat_Questions.LambdaExercises.Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q04 {
    /*

    Given a list of strings, return a list of the strings, omitting
    any string that contains a "z". (Note: the str.contains(x) method returns a boolean)


    noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
    noZ(["hziz", "hzello", "hi"]) → ["hi"]
    noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("hello", "howz", "are", "youz");
        System.out.println(noZ(myList));

    }

    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(t->!(t.contains("z"))).collect(Collectors.toList());
    }

}
