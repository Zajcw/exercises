package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {5,4,null,45,1,null,6,74};
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integers));
        List<Integer> newList = BubbleSort.sort(integerList);
        System.out.println(newList);
    }
}