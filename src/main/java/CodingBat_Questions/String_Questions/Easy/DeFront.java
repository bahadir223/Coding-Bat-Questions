package CodingBat_Questions.String_Questions.Easy;

public class DeFront {
    /*
     Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and
     keep the second char if it is 'b'. The string may be any length. Harder than it looks.


     deFront("Hello") → "llo"
     deFront("java") → "va"
     deFront("away") → "aay"
     */

    public static void main(String[] args) {

        System.out.println(deFront("Hello"));
    }

    public static String deFront(String str) {

        if (str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")) {
            return str;

        } else if (str.substring(1, 2).equals("b")) {
            return str.substring(1);
        } else if (str.substring(0, 1).equals("a")) {
            return str.substring(0, 1) + str.substring(2);
        } else {
            return str.substring(2);
        }

    }

}
