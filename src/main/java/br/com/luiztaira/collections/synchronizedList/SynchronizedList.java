package br.com.luiztaira.collections.synchronizedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Two list, in this example, one synchronized and other not
 *  Two threads trying to input the same value in the lists.
 *
 *  The synchronized list can deal with threads one by one. Meanwhile ths list not synchronized lost some values
 *
 *  Using the static method Collections.synchronizedList, the second thread can not modify the list while the first thread not finish all instructions
 */
public class SynchronizedList {

    public static void main(String[] args) throws InterruptedException {

        final List<String> list = new ArrayList<String>();
        List<String> syncList = Collections.synchronizedList(new ArrayList<String>());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    syncList.add("t1-" + i);
                    list.add("t1-" + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    syncList.add("t2-" + i);
                    list.add("t2-" + i);
                }
            }
        });
        t1.start();
        t2.start();

        Thread.sleep(3000);

        System.out.println("List not synchronized");
        System.out.println("Size: " +  list.size());
        System.out.println(list);

        System.out.println();

        System.out.println("List synchronized");
        System.out.println("Size: " + syncList.size());
        System.out.println(syncList);
    }
}
