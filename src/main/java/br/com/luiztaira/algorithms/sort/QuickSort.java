package br.com.luiztaira.algorithms.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = new int[]{4,5,7,3,6};
        //buildArray(numbers);
        System.out.println("Unsorted array");
        for (int number: numbers)
            System.out.println(number);

        System.out.println("----");

        System.out.println("Sorted array using QuickSort");
        quickSort(numbers, 0, numbers.length);
        for (int number: numbers)
            System.out.println(number);
    }

    static void quickSort(int[] numbers, int from, int until){
        int size = until - from;
        if (size > 1){
            int pivotPosition = partition(numbers, from, until);
            // sort numbers of left pivot side
            quickSort(numbers, from, pivotPosition);
            // sort numbers of right pivot side
            quickSort(numbers, pivotPosition + 1, until);
        }
    }

    /**
     *  Change numbers orders based on pivot position
     *
     * @param numbers
     * @param begin
     * @param end
     * @return
     */
    static int partition(int[] numbers, int begin, int end) {
        int countOfSmallNumbers = 0;
        int pivot = numbers[end - 1];
        for (int current = 0;current < end - 1; current++){
            if (numbers[current] <= pivot){
                // change numbers based on pivot position
                changePosition(numbers, current, countOfSmallNumbers);
                countOfSmallNumbers++;
            }
        }
        // change pivot position
        changePosition(numbers, end - 1, countOfSmallNumbers);
        return countOfSmallNumbers;
    }

    /**
     * Change position
     *
     * @param numbers
     * @param from
     * @param to
     */
    private static void changePosition(int[] numbers, int from, int to) {
        int number1 = numbers[from];
        int number2 = numbers[to];
        numbers[from] = number2;
        numbers[to] = number1;
    }
}
