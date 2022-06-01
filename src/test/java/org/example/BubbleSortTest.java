package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void should_sort_list_of_integers() {
        Integer[] input = {1,4,5,6,8,3,8};
        Integer[] expectedOutput = {1,3,4,5,6,8,8};
        List<Integer> inputList = new ArrayList<>(Arrays.asList(input));
        List<Integer> expectedOutputList = new ArrayList<>(Arrays.asList(expectedOutput));
        BubbleSort.sort(inputList);
        assertEquals(expectedOutputList,inputList);
    }

    @Test
    void should_sort_list_of_doubles(){
        double[] input = {-9.3,0.2,4,0.1,5,9};
        double[] expectedOutput = {-9.3,0.1,0.2,4,5,9};
        List<Double> inputList = DoubleStream.of(input)
                .boxed().collect(Collectors.toList());
        List<Double> expectedOutputList = DoubleStream.of(expectedOutput)
                .boxed().collect(Collectors.toList());
        BubbleSort.sort(inputList);
        assertEquals(expectedOutputList,inputList);
    }

    @Test
    void should_sort_empty_list(){
        List input = new ArrayList<>();
        List expectedOutput = new ArrayList<>();
        BubbleSort.sort(input);
        assertEquals(expectedOutput,input);
    }

    @Test
    void should_sort_list_and_omit_null(){
        Double[] input = {null, 5.00001};
        Double[] expectedOutput = {5.00001};
        List<Double> inputList = new ArrayList<>(Arrays.asList(input));
        List<Double> expectedOutputList = new ArrayList<>(Arrays.asList(expectedOutput));
        BubbleSort.sort(inputList);
        assertEquals(expectedOutputList,inputList);
    }

    @Test
    void should_throw_runtime_exception_if_null_element_in_list(){
        List input = null;
        assertThrows(RuntimeException.class, () -> {BubbleSort.sort(input);});
    }
}