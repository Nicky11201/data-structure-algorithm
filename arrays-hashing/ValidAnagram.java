import java.util.*;
public class ValidAnagram {
    public static void main(String [] args) {
        System.out.println(isAnagram("xx", "x"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char [] chars = s.toCharArray();
        char [] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars, chars1);
    }
}