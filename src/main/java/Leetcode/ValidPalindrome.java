package main.java.Leetcode;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isValidPalindrome(String s) {
        s = removeNonAlphaNumericCharacters(s);
        String[] stringArr = s.split("");
        int left = 0;
        int right = stringArr.length - 1;

        while (left <= right) {
            if (left == right) {
                return true;
            }
            if (!stringArr[left].equals(stringArr[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String removeNonAlphaNumericCharacters(String str) {
        str = str.replaceAll(
                        "[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        return str;
    }
}
