package br.com.luiztaira.algorithms.sort;

import java.util.Random;

public class MergeSort3 {

    public static void main(String[] args) {
        int[] numbers1 = new  int[100];

        buildArray(numbers1);

        System.out.println("Unsorted array");
        for (int number: numbers1)
            System.out.println(number);

        System.out.println("----");

        System.out.println("----");
        sort(numbers1, 0, numbers1.length);

        for (int number: numbers1)
            System.out.println(number);
    }

    static void buildArray(int[] numbers){
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt();
        }
    }

    /**
     * Sort an array
     * Divide in small chunks and intercalete
     * If can't intercalate, call sort again(recursion)
     * until the chunk be ready
     *
     * @param array
     * @param begin
     * @param end
     */
    static void sort(int[] array, int begin, int end){
        int size = end - begin;
        if (size > 1){
            int middle = (begin + end) / 2;
            sort(array, begin, middle);
            sort(array, middle, end);

            intercalate(array, begin, middle, end);
        }
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
