package org.example.easy;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String palindrome = new StringBuilder(s).reverse().toString();
        return palindrome.equals(s);
    }

}
