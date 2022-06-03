package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BalancedWordsCounter {
    public static Integer count(String input) throws RuntimeException{
        if(Objects.isNull(input))
            throw new RuntimeException("Input is null");
        if(!input.chars().allMatch(Character::isLetter)){
            throw new RuntimeException("There is a non-character present in the input");
        }
        Map<Character, Integer> numCharMap = new HashMap<>();
        for(int i = 0; i < input.length(); i++){

        }

        //For now, as it's not finished
        return null;
    }
}
