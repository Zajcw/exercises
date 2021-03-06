package org.example;

import java.util.List;
import java.util.Objects;

public class BubbleSort{
    public static <T extends Comparable<T>> List<T> sort(List<T> input) throws RuntimeException {
        //Check if input is null. Throw RuntimeException accordingly
        if(Objects.isNull(input))
            throw new RuntimeException("Input is null");

        //Remove objects from list which have null as their value
        input.removeIf(Objects::isNull);

        //Execute sorting using compareTo() method
        for(int i = 0; i < input.size() - 1; i++){
            for(int j = 0; j < input.size() - i - 1; j++){
                T a =  input.get(j);
                T b =  input.get(j + 1);
                if(a.compareTo(b) >= 1){
                        input.set(j, b);
                        input.set(j + 1, a);
                    }
            }
        }
        return input;
    }
}
