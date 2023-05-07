package CodingBat_Questions.LambdaExercises.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q01 {
    /*
    Given a list of integers, return a list where each integer is multiplied by 2.

    doubling([1, 2, 3]) → [2, 4, 6]
    doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
    doubling([]) → []
     */

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3);
        System.out.println(doubling(myList));
    }

    public static  List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(t->t*2).collect(Collectors.toList());
    }


}
