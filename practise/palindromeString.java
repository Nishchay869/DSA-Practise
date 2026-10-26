package practise;

import java.util.*;

public class palindromeString {
    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        // to lowercase
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < result.length(); i++) {
            sb.append(Character.toLowerCase(result.charAt(i)));
        }

        // check palindrome
        int start = 0;
        int end = sb.length() - 1;
        while (start < end) {

            if (sb.charAt(start) != sb.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    public static void main(String args[]) {
        // removed alphanumeric
        String s = "medem";
        System.out.print(isPalindrome(s));

    }
}