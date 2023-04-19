package CodingBat_Questions.String_Questions.Easy;

public class WithoutX2 {
    /*

    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged. This is a little harder than it looks.


    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
     */

    public static void main(String[] args) {

        System.out.println(withoutX2("xHi"));

    }

    public static String withoutX2(String str) {

        if (str.length() > +2) {
            if (str.substring(1, 2).equals("x") || str.substring(0, 1).equals("x")) {
                if (str.substring(2).contains("x")) {
                    return str.substring(1);
                } else {
                    return str.replace("x", "");
                }
            } else if (str.length() == 0) {
                return str = "";
            } else {
                return str;
            }
        } else if (str.length() == 0) {
            return str = "";
        } else {
            return str.replace("x", "");
        }
    }

}
