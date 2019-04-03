package br.com.luiztaira.algorithms.sort;

/**
 * Basic implementation of merge sort
 * given two arrays, already sorted, merge both and sort
 *
 */
public class MergeSort1 {

    public static void main(String[] args) {

        //two arrays already sorted
        int[] numbers1 = new int[]{2,5,6,9};
        int[] numbers2 = new int[]{1,4,8,11,12};

        System.out.println("array1");
        for (int number: numbers1)
            System.out.println(number);

        System.out.println("---");

        System.out.println("array2");
        for (int number: numbers2)
            System.out.println(number);

        System.out.println("---");
        System.out.println("");
        System.out.println("Sorted merged array");
        int[] sortedArray = mergeAndSortArrays(numbers1, numbers2);
        for (int number: sortedArray)
            System.out.println(number);
    }

    /**
     * Compare index by index and put in other array
     *
     * @param numbers1
     * @param numbers2
     * @return
     */
    static int[] mergeAndSortArrays(int[] numbers1, int[] numbers2){
        int[] sortedArray = new int[numbers1.length + numbers2.length];
        int i = 0;

        int currentIndexNumbers1 = 0;
        int currentIndexNumbers2 = 0;

        while (currentIndexNumbers1 < numbers1.length && currentIndexNumbers2 < numbers2.length){
            if(numbers1[currentIndexNumbers1] < numbers2[currentIndexNumbers2]){
                sortedArray[i++] = numbers1[currentIndexNumbers1++];
            } else{
                sortedArray[i++] = numbers2[currentIndexNumbers2++];
            }
        }

        // if exist more elements in one of two arrays, put all...one by one
        while (currentIndexNumbers1 < numbers1.length)
            sortedArray[i++] = numbers1[currentIndexNumbers1++];

        while (currentIndexNumbers2 < numbers2.length)
            sortedArray[i++] = numbers2[currentIndexNumbers2++];

        return sortedArray;
    }
}
