package javaprogram;

import java.util.Arrays;

public class ArrayHighestNumber {
    public static void main(String[] args) {

                int[] numbers = {10, 25, 98, 47, 66}; // Sample array

                int max = numbers[0]; // Assume first element is the largest

                for (int num : numbers) {
                    if (num > max) {
                        max = num; // Update max if a larger number is found
                    }
                }
                Arrays.sort(numbers);
                int sec=numbers[numbers.length-2];
        System.out.println(sec);
                System.out.println("The highest number in the array is: " + max);
            }

}
