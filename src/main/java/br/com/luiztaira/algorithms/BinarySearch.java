package br.com.luiztaira.algorithms;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array ={1,5,6,3,-9,20};
        Algorithm a = new Algorithm(array);
        System.out.println(a.bynarySearch(0, array.length, 3));
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
