package br.com.luiztaira.threads.module3;

public class MyList {

    private String[] elements = new String[100];
    private int index = 0;

    // using synchronized, we guarantee that just one element in a unique position
    public synchronized void addElement(int threadNumber, int element) {
        this.elements[this.index] = "Adding element " + element + " in Thread " + threadNumber;
        this.index++;
    }

    public int getSize(){
        return this.index;
    }

    public String getElement(int position){
        return this.elements[position];
    }
}