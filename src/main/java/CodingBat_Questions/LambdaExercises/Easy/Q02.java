package CodingBat_Questions.LambdaExercises.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q02 {
    /*

    Given a list of integers, return a list where each integer is multiplied with itself.

    square([1, 2, 3]) → [1, 4, 9]
    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    square([]) → []
     */

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3);
        System.out.println(square(myList));

    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(t->t*t).collect(Collectors.toList());
    }

}
