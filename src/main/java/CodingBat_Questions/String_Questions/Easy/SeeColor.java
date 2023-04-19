package CodingBat_Questions.String_Questions.Easy;

public class SeeColor {
    /*

    Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.

    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
     */

    public static void main(String[] args) {

        System.out.println(seeColor("redxx"));
    }

    public static String seeColor(String str) {
        if(str.indexOf("red")==0){
            return "red";
        }
        if(str.indexOf("blue")==0){
            return "blue";
        }else{
            return "";
        }
    }

}
