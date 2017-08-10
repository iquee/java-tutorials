package br.com.luiztaira.threads.module3;

public class MyList {

    private String[] elements = new String[100];
    private int index = 0;

    // using synchronized, we guarantee that just one element in a unique position
    public synchronized void addElement(String element){
        this.elements[this.index] = element;
        this.index++;
    }

    public int getSize(){
        return this.index;
    }

    public String getElement(int position){
        return this.elements[position];
    }

}
