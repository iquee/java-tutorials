package br.com.luiztaira.algorithms;

/**
 * Binary search only works on sorted arrays
 *
 * If is a unsorted array, it must be a Linear Search
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] array ={-9,0,1,2,3,4,5,8,9};
        Algorithm a = new Algorithm(array);
        System.out.println(a.bynarySearch(0, array.length, 5));
    }
}


class Algorithm{

    private int[] array;

    public Algorithm(int[] array){
        this.array = array;
    }

    public int bynarySearch(int startIndex, int endIndex, int item){
        if(endIndex < startIndex)
            return -1;

        int middleIndex = (startIndex + endIndex) / 2;
        if(item == array[middleIndex])
            return middleIndex;
        else if(item < array[middleIndex])
            return bynarySearch(startIndex, middleIndex - 1, item);
        else
            return bynarySearch(middleIndex + 1, endIndex, item);
    }

}
