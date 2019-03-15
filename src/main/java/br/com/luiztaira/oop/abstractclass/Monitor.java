package br.com.luiztaira.oop.abstractclass;

public class Monitor extends Production{

	@Override
	void doIntructions(String instructions) {
		if(instructions == null || instructions == "")
			throw new IllegalArgumentException("Instructions can not be empty");
		System.out.println(instructions);
	}

	@Override
	void make() {
		System.out.println("Testing monitor");
	}

}
