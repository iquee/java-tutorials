package br.com.luiztaira.algorithms.sort;

import java.util.Random;

/**
 *
 * An Algorithm to sort an array of int, based on insertion method
 * This algorithm is not concerned in performance,
 * and it just shows how it works
 */
public class InsertionSort {

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
            insertionSort(numbers, j);
        }

        for (int number: numbers)
            System.out.println(number);

    }

    /**
     * Comparing and change, if necessary, the order
     *
     * @param numbers
     * @param offset
     */
    private static void insertionSort(int[] numbers, int offset) {
        for (int i = 1; i <= offset; i++){
            int analysing = i;

            while(i > 0 && (numbers[i] < numbers[i - 1])) {
                changeNumbers(numbers, i, i-1);
                i--;
            }
        }
    }

    private static void changeNumbers(int[] numbers, int i, int j) {
        int numberAnalysing = numbers[i];
        int numberBefore = numbers[j];

        numbers[i] = numberBefore;
        numbers[j] = numberAnalysing;
    }
}