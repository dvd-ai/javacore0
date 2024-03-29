package org.example.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        Assertions.assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
