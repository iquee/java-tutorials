package br.com.luiztaira.algorithms.sort;

import java.util.Random;

/**
 * Given a unique array, divided in 2 ordered parts
 * Merge and sort this array
 */
public class MergeSort2 {

    public static void main(String[] args) {
        int[] numbers = new  int[]{2,4,6,8,1,3,5,7,9};
        int begin = 0;
        int middle = 4;

        System.out.println("Unsorted array");
        for (int number: numbers)
            System.out.println(number);

        System.out.println("----");

        numbers = intercalate(numbers, begin, middle, numbers.length);
        for (int number: numbers)
            System.out.println(number);
    }

    /**
     * Given parameters, sort a chunk inside array
     *
     * @param numbers
     * @param begin
     * @param middle
     * @param end
     * @return a sorted chunk
     */
    static int[] intercalate(int[] numbers, int begin, int middle, int end){
        int[] newArray = new int[end - begin];
        int current = 0;
        int current1 = begin;
        int current2 = middle;

        while (current1 < middle &&
                current2 < end){
            int number1 = numbers[current1];
            int number2 = numbers[current2];

            if (number1 < number2){
                newArray[current++] = number1;
                current1++;
            } else{
                newArray[current++] = number2;
                current2++;
            }
        }

        while (current1 < middle)
            newArray[current++] = numbers[current1++];

        while (current2 < end)
            newArray[current++] = numbers[current2++];

        for (int cont = 0; cont < current; cont++){
            numbers[begin + cont] = newArray[cont];
        }

        return numbers;
    }
}
