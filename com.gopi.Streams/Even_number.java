//1. Write a program to filter even numbers from list

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_number {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenNumber = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println(evenNumber);
    }
}