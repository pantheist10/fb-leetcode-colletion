import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExampleCollection {

    /*
    Some good Regular Expressions.
    Floating point number excluding exponent, such as 1.5e8
    > [+-]? - Plus or Minus sign - may or may not exist
    > [0-9]*\.[0-9]+ - Digits followed be decimal followed by at least 1 digit.
    | > OR
    > [0-9]+ At least one number with no decimal.
    [+-]?([0-9]*\.[0-9]+|[0-9]+)



     */

    public static void main(String[] args) {

        //Example for pattern matching.
        String line = "I got 90 marks.";
        String pattern = "(.*)(\\d+)(.*)";
        Pattern regex = Pattern.compile(pattern);
        Matcher m = regex.matcher(line);
        //System.out.println(m.matches()); //Returns true or false

        //Group Matching ((.*)(\\d+)(.*) - Group 0 is always full string, group 1 2 3 are the whatever is in the bracket
        // (.*) - Group1
        // (\\d+) - Group 2
        // (.*) - Group 3
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        }
        System.out.println("*****************************************");

        //Getting the indexes for matching counts.
        String REGEX = "\\bcat\\b";
        String INPUT = "cat cat cat cattie cat";
        Pattern p = Pattern.compile(REGEX);
        Matcher mat = p.matcher(INPUT);
        int count =0;
        while (mat.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+mat.start());
            System.out.println("end(): "+mat.end());
        }

        System.out.println("*****************************************");
        //Replace and Replace All text replacement
        String reg = "dog";
        String input = "The dog says meow. " + "All dogs say meow.";
        String REPLACE = "cat";

        Pattern newpattern = Pattern.compile(reg);
        Matcher match = newpattern.matcher(input);
        String output = match.replaceAll(REPLACE);
        System.out.println(output);

        System.out.println("*****************************************");
        //Replace and Replace All text replacement

        String replaceRegex = "a*b";
        String replaceInput = "aabfooaabfooabfoob";
        String replace = "-";

        Pattern replacePattern = Pattern.compile(replaceRegex);
        Matcher replaceMatcher = replacePattern.matcher(replaceInput);

        StringBuffer sb = new StringBuffer();
        while(replaceMatcher.find()) {
            replaceMatcher.appendReplacement(sb, replace);
        }
        //replaceMatcher.appendTail(sb);
        System.out.println(sb.toString());
    }

}
