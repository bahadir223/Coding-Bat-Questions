package CodingBat_Questions.LambdaExercises.Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q03 {
    /*

    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.


    noTeen([12, 13, 19, 20]) → [12, 20]
    noTeen([1, 14, 1]) → [1, 1]
    noTeen([15]) → []
     */

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(12, 13, 19, 20);
        System.out.println(noTeen(myList));

    }

    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(t->!(t<=19 &&t>=13)).collect(Collectors.toList());
    }

}
