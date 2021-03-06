package br.com.luiztaira.java8.optional;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
	
	public static void main(String[] args) {
		
		String name = null;		
		
		String lastName = "Silva";
		Optional<String> optional1 = Optional.of(lastName); // if lastName is not null, it's ok to use .of 
		Optional<String> optional2 = Optional.empty();		
		Optional<String> optional3 = Optional.ofNullable(name);
		System.out.println(optional1);
		System.out.println(optional2);
		System.out.println(optional3);
		
		System.out.println("");
		
		// printing 
		System.out.println(optional1.get());
		if(optional2.isPresent())
			System.out.println(optional2.get());
		else
			System.out.println(optional2.orElse("Nothing to print"));		
		System.out.println(optional3.isPresent() ? optional3.get() : "Optional3 is null");
		
		System.out.println("");
		
		String justNull = null;
		String user = Optional.ofNullable(justNull).orElseGet(() -> "john");
		System.out.println(user);
		
		//user = Optional.ofNullable(justNull).orElseThrow(IllegalArgumentException::new);
		//System.out.println(user);		
		
		// using filter
		Optional<Integer> yearOptional = Optional.of(LocalDate.now().getYear());
	    boolean is2018 = yearOptional.filter(y -> y == 2018).isPresent();
	    System.out.println("Is 2016: " + is2018);
	    
	    System.out.println("");
	    
	    // map: transforms values only when they are unwrapped
	    List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
	    Optional<List<String>> listOptional = Optional.of(companyNames);
	    int size = listOptional.map(List::size).orElse(0);
	    System.out.println(size);
	    
	    // flatMap: takes a wrapped value and unwraps it before transforming it
	    Truck truck = new Truck(10);
	    Optional<Truck> optTruck = Optional.of(truck);
	    Integer engine = optTruck.flatMap(Truck::getEngine).orElse(0);
	    System.out.println(engine);
	    
	    
	    // check if list is not null
	    List<String> list = null;
	    Optional<List<String>> optional = Optional.ofNullable(list);
	    optional.isPresent();
	    
	}
	
	static class Truck{
		Integer engine;
		
		public Truck(Integer engine){
			this.engine = engine;
		}
		Optional<Integer> getEngine(){
			return Optional.ofNullable(this.engine);
		}
	}
}


