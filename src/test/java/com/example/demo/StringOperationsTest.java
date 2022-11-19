package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringOperationsTest {

    private StringOperations operations;

    @BeforeEach
    public void init() {
        operations = new StringOperations();
    }

    @AfterEach
    public void clean() {
        operations = null;
    }

    @Test
    public void reverse_test() {
        String input = "abcde";
        String result = operations.reverse(input);
        assertThat("edcba", is(result));
    }

    @Test
    public void reverse_should_be_null_test() {
        String input = null;
        String result = operations.reverse(input);
        assertThat(null, is(result));
    }

    @Test
    public void concat_test() {
        String firstInput = "asa";
        String secondInput = "abc";
        String result = operations.concat(firstInput, secondInput);
        assertThat("asaabc", is(result));
    }

    @Test
    public void concat_should_be_null_test() {
        String firstInput = null;
        String secondInput = "tr";
        String result = operations.concat(firstInput, secondInput);
        assertThat(null, is(result));
    }

    @Test
    public void isPalindrome_test() {
        String input = "asa";
        boolean result = operations.isPalindrome(input);
        assertThat(true, is(result));
    }

    @Test
    public void isPalindrome_test2() {
        String input = "asa   ";
        boolean result = operations.isPalindrome(input);
        assertThat(false, is(result));
    }

    @Test
    public void isPalindrome_test3() {
        String input = "abc";
        boolean result = operations.isPalindrome(input);
        assertThat(false, is(result));
    }
    @Test
    public void isPalindrome_test4() {
        String input = "ąsą";
        boolean result = operations.isPalindrome(input);
        assertThat(true, is(result));
    }
}
