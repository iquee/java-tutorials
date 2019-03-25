package br.com.luiztaira.threads.module3;

public class ListManagment implements Runnable {

    private MyList myList;
    private int threadNumber;

    public ListManagment(MyList myList, int threadNumber) {
        this.myList = myList;
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            myList.addElement(threadNumber, i);
        }
    }
}
