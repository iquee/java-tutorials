package br.com.luiztaira.threads1.module3;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        MyList list = new MyList();

        for (int i = 0; i < 10; i++) {
            new Thread(new AddElementOnList(list, i)).start();
        }

        Thread.sleep(1000);

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(i + " " + list.getElement(i));
        }
    }
}
