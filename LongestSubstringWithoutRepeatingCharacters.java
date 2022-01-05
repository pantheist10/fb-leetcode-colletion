import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("ankitkhare"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> oMap = new HashMap<>();
        int count = 0;
        int ret = 0;
        String output = "";

        for (int i=0;i<s.length();i++) {
            if (oMap.containsKey(s.charAt(i))) {
                i = oMap.get(s.charAt(i));
                oMap.clear();
                count=0;
                output = "";
                System.out.println("  ");
            }
            else {
                oMap.put(s.charAt(i),i);
                System.out.println(oMap.toString());
                count++;
            }
            ret = Math.max(ret,count);
        }
        System.out.println(output);
        return ret;
    }
}
