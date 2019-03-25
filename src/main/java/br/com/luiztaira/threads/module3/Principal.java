package br.com.luiztaira.threads.module3;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        MyList list = new MyList();

        for (int i = 0; i < 10; i++) {
        	ListManagment add = new ListManagment(list, i);
            new Thread(add).start();
        }

        Thread.sleep(1000);

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.getElement(i));
        }
    }
}
