package org.example.medium;

public class SubstringPalindrome {

    public static void main(String[] args) {
        String input = "cbbd";
        System.out.println(longestPalindrome(input));

    }


        static public String longestPalindrome(String s) {
            int first = 0;
            int last = s.length();

            while (last != first) {
                String substr = s.substring(first, last);
                if (isPalindrome(substr))
                    return substr;
                else {
                    last--;
                }
            }

            first = 0;
            last = s.length();

            while (first != last) {
                String substr = s.substring(first, last);
                if (isPalindrome(substr))
                    return substr;
                else {
                    first++;
                }
            }

            return "";
        }



        static boolean isPalindrome(String s) {
            return new StringBuilder(s)
                    .equals(
                            new StringBuilder(s).reverse()
                    );
        }

}
