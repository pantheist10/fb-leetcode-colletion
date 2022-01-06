import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAtoi {

    /*
    https://leetcode.com/problems/string-to-integer-atoi/
     */
    public static int myAtoi(String str) {

        //Trim the white spaces
        str = str.trim();
        if (!str.matches("([+-]?\\d+).*")) return 0;

        Pattern pattern = Pattern.compile("([+-]?\\d+).*");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            str = matcher.group(1);
            //System.out.println(str);
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            return str.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
    }
}
