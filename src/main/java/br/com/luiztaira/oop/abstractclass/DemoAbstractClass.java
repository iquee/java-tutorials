package br.com.luiztaira.oop.abstractclass;

public class DemoAbstractClass {
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		iphone.doIntructions("Instruction 1: put screen");
		iphone.doIntructions("Instruction 2: put button");
		iphone.make();
		iphone.packing();
		
		System.out.println("");
		
		Monitor monitor = new Monitor();
		monitor.doIntructions("Instruction 1: put the cable");
		monitor.make();
		monitor.packing();
	}

}
