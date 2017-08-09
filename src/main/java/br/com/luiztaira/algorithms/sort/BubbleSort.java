package br.com.luiztaira.algorithms.sort;

/**
 *  In bubble sort, we basically traverse the array from first element of array
 *  to (array.length - 1) position and compare the element with the next one.
 *  Element is swapped with the next element if the next element is greater.
 *  - Worst-case performance   O(n^{2})
 *  - Best-case performance	   O(n^{2})
 */
public class BubbleSort {

    public static void main(String[] args) {

        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Unsorted array");
        for(int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("-------------");

        //sorting array elements using bubble sort
        bubbleSort(arr);

        System.out.println("Sorted array using Bubble sort");
        for(int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    /**
     * Check array arr.length times
     * @param arr
     */
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
}
