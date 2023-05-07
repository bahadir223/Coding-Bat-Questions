package CodingBat_Questions.LambdaExercises.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q07 {
    /*
    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

    rightDigit([1, 22, 93]) → [1, 2, 3]
    rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
    rightDigit([10, 0]) → [0, 0]
     */

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,22,93);
        System.out.println(rightDigit(myList));

    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(t->t%10).collect(Collectors.toList());
    }
}
