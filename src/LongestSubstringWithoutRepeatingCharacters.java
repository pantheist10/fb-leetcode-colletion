import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("ee"));
    }

    /*
    Here is the problem:
    https://leetcode.com/problems/longest-substring-without-repeating-characters/
    This program uses HashMap to implement the sliding window and get the longest substring without repeating char.
     */
    public static int lengthOfLongestSubstring(String s) {

        //This Map will hold the character of the string and their index.
        HashMap<Character,Integer> oMap = new HashMap<>();

        //This value will be returned.
        int maxLength = 0;

        //Temp variable to hold the max length of various passes.
        int count = 0;

        //Sliding from left to right in this loop
        for (int index=0;index<s.length();index++) {

            // If this character is not present in the map, add in the map and increase the count value.
            if(!oMap.containsKey(s.charAt(index))) {
                oMap.put(s.charAt(index),index);
                count++;
            }
            //If the encountered character is already present in the map, reset the index to the first occurrence of this
            //duplicate element. So if duplicate element was at index 2 before, loop will start with index=3
            // after that map will be cleared and count will be set to zero.
            else {
                index = oMap.get(s.charAt(index));
                oMap.clear();
                count = 0;
            }

            //set maxLength as max of maxLength and count
            maxLength = Math.max(maxLength,count);
        }


        return maxLength;
    }
}
