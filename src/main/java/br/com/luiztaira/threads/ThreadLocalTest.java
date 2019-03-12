package br.com.luiztaira.threads;

public class ThreadLocalTest {

    public static void main(String[] args) {

        ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
        threadLocalValue.set(1);

        System.out.println(threadLocalValue.get());

        threadLocalValue.remove();

        System.out.println(threadLocalValue.get());
    }
}
