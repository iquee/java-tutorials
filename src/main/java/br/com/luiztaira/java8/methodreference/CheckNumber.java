package br.com.luiztaira.java8.methodreference;

public class CheckNumber {

    boolean isEven(int n){
        return (n % 2) == 0;
    }
    
    static void addingInt(int i) {
    	if ( i > 0)
    		i += 10;
    	else
    		i += 100;
		System.out.println("final count: " + i);
    }
}
