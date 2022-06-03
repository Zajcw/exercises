package org.example;

import java.util.*;

public class BalancedWordsCounter {

    private static Integer count = 0;
    public static Integer count(String input) throws RuntimeException{
        //Check if the input is null. Throw RuntimeException accordingly
        if(Objects.isNull(input))
            throw new RuntimeException("Input is null");

        //Check if input consists of letters only. Throw RuntimeException accordingly
        if(!input.chars().allMatch(Character::isLetter)){
            throw new RuntimeException("There is a non-character present in the input");
        }

        //Check if input is blank (if it's empty and/or consists of only white spaces
        if(!input.isBlank()){
            checkSubstringsOfInputWord(input);
            return count;
        }
        else
            return 0;
    }

    private static void checkSubstringsOfInputWord(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                //For each substring word we check if it is balanced
                checkIfWordIsBalanced(input.substring(i,j));
            }
        }
    }

    private static boolean checkIfWordIsBalanced(String input){
        Map<Character, Integer> numCharMap = new HashMap<>();

        //We need to assign the char and its count
        //for ease of checking how many times each char occurs
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(numCharMap.containsKey(c)){
                numCharMap.put(c,numCharMap.get(c) + 1);
            }
            else{
                numCharMap.put(c,1);
            }
        }

        //Copy the values of each char count from the Map
        List<Integer> integerList = new ArrayList<>(numCharMap.values());

        //Check if all values are the same in the list
        boolean balanced = true;
        for (Integer integer:
             integerList) {
            if(!integer.equals(integerList.get(0)))
                balanced = false;
        }

        //If values in List are the same
        if(balanced){
            //System.out.println("Word: \"" + input + "\" is balanced");

            //Here we increment the amount of found balanced subwords
            //made from the input string
            count++;
            return true;
        }
        //If values in list are NOT the same
        else{
            //System.out.println("Word: \"" + input + "\" is not balanced");
            return false;
        }
    }
}
