package br.com.luiztaira.algorithms.sort;

import java.util.Random;

/**
 * An Algorithm to sort an array of int, based in selection
 * This algorithm is not concerned in performance,
 * and it just shows how it works
 */
public class SelectionSort {

    public static void main(String[] args) {
        int numbers[] = new int[10];
        Random random = new Random();
        System.out.println("Unsorted numbers: ");
        for (int i = 0; i < 10; i++){
            numbers[i] = random.nextInt();
            System.out.println(numbers[i]);
        }

        System.out.println(" ----- ");

        System.out.println("Sorted numbers: ");
        // sorting
        for (int j = 0; j < numbers.length; j++){
            int small = SelectionSort.getSmallest(numbers, j);

            int actualNumber = numbers[j];
            int smallestNumber = numbers[small];

            numbers[j] = smallestNumber;
            numbers[small] = actualNumber;
        }

        for (int number: numbers)
            System.out.println(number);

    }

    /**
     *  Given an array of int, an initial position, return the smallest number,
     *  comparing one by one
     *
     * @param numbers
     * @param position
     * @return
     */
    public static int getSmallest(int[] numbers, int position){
        int smallest = position;
        for (int i = position; i < numbers.length; i++)
            if(numbers[i] < numbers[smallest])
                smallest = i;

        return smallest;
    }
}