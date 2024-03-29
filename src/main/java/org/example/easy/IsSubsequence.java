package org.example.easy;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        byte[] substringChars = s.getBytes();
        byte[] stringChars = t.getBytes();
        int counter = 0;

        for (int i = 0; i < stringChars.length && counter != substringChars.length; i++) {
            if (stringChars[i] == substringChars[counter]) {
                counter++;
            }
        }

        return counter == substringChars.length;
    }
}
