package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {

    @Test
    void should_return_28_if_input_string_is_aabbabcccba() {
        String input = "aabbabcccba";
        Integer expectedOutputNumber = 28;
        Integer outputNumber = BalancedWordsCounter.count(input);
        assertEquals(expectedOutputNumber,outputNumber);
    }

    @Test
    void should_return_0_if_input_string_is_empty(){
        String input = "";
        Integer expectedOutputNumber = 0;
        Integer outputNumber = BalancedWordsCounter.count(input);
        assertEquals(expectedOutputNumber,outputNumber);
    }

    @Test
    void should_throw_runtime_exception_if_input_string_contains_non_alphabet_character(){
        String input = "abababa1";
        assertThrows(RuntimeException.class, () -> {BalancedWordsCounter.count(input);});
    }

    @Test
    void should_throw_runtime_exception_if_input_is_null(){
        String input = null;
        assertThrows(RuntimeException.class, () -> {BalancedWordsCounter.count(input);});
    }
}