package br.com.luiztaira.oop.abstractclass;

/**
 * Abstract class with constructor, abstract methods and a non abstract method
 * @author taira
 *
 */
public abstract class Production {
	
	public Production(){
		System.out.println("Starting production...");
	}
	
	abstract void doIntructions(String instructions);	
	abstract void make();
	
	public void packing(){
		System.out.println("Packing product");
	}

}
