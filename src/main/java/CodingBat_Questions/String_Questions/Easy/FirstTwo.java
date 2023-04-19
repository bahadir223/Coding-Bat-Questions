package CodingBat_Questions.String_Questions.Easy;

public class FirstTwo {
    /*
    Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty
    string "" yields the empty string "". Note that str.length() returns the length of a string.


    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"
     */

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));

    }

    public static String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

}
