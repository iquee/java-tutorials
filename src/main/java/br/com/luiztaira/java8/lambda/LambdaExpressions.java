package br.com.luiztaira.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda expressions are used mainly to define inline implementation of a functional interface
 *
 * Lambda expression eliminates the need of anonymous class and gives a very simple yet powerful functional programming
 *
 */
public class LambdaExpressions {

	public static void main(String[] args) {
		
		List<String> names = null;
		
		names = Arrays.asList("carlos", "alana", "zuleika");
		// create comparator using lambda
		Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
		names.sort(comparator);
		System.out.println(names);
		System.out.println("-----");
				
		names = Arrays.asList("ivy", "troy", "mark", "ander");
		// passing comparator directly as argument using lambda
		names.sort((string1, string2) -> string1.compareTo(string2));
		System.out.println(names);
		System.out.println("------");
		
		// creating a single Thread, with one instructions, using lambda and call start
		new Thread(() -> System.out.println("new Thread 1")).start();
		
		// creating a single Thread, with many instructions, using lambda
		new Thread(() -> {
			System.out.println("new Thread 2");
			System.out.println("sleeping...");
			System.out.println("GO!");
			System.out.println("------");
			
		}).start();
		
		// using lambda expressions with method reference 
		Runnable r = () -> {System.out.println("Running another Thread implements Runnable");};
		r.run();
		System.out.println("------");		
		
		// Ordering using Method Reference
		Comparator<String> comparator1 = String::compareTo;		
		names = Arrays.asList("david", "alba", "zack", "lian");
		names.sort(comparator1);		
		System.out.println(names);
		System.out.println("------");
		
		// Comparing and ordering objects
		Developer d1 = new Developer("Lou", 34);
		Developer d2 = new Developer("May", 24);
		Developer d3 = new Developer("Alba", 24);
		Developer d4 = null;
		List<Developer> devs = new ArrayList<>();
		devs.add(d1);
		devs.add(d2);
		devs.add(d3);
		devs.add(d4);
		
		// 3 ways to order de Age using lambda and method reference
		devs.sort(Comparator.nullsLast(Comparator.comparing(dev -> dev.getAge())));
		devs.sort(Comparator.nullsLast(Comparator.comparingInt(Developer::getAge).thenComparing(Developer::getName))); // comparingInt because Autoboxing
		devs.sort(Comparator.nullsLast((Developer o1, Developer o2) -> o1.getAge() - o2.getAge()));		
		System.out.println("Sorting by age");
		devs.forEach((developer) -> System.out.println(developer));
		System.out.println("");
		
		// reversing order
		devs.sort(Comparator.nullsLast(Comparator.comparing(Developer::getAge).reversed()));		
		
		// 3 ways to order by Name using lambda and method reference
		devs.sort(Comparator.nullsFirst(Comparator.comparing(dev -> dev.getName())));
		devs.sort(Comparator.nullsFirst(Comparator.comparing(Developer::getName)));		
		devs.sort(Comparator.nullsFirst((o1, o2) -> o1.getName().compareTo(o2.getName())));
		System.out.println("Sorting by name");
		devs.forEach((developer)-> System.out.println(developer));
		System.out.println("");

		// using Lambda to define implementation of FunctionInterfaces
		Greeting g = msg -> {
			return "Hello. Welcome to " + msg;
		};
		System.out.println(g.greetingMessage("Pool Party. Enjoy"));
		System.out.println(g.greetingMessage("Rock Party. Lets rock"));

		// implementing interfaces using lambda
		Operations addition = (int a, int b) -> a + b;
		int resultAddition = addition.doOperation(10, 20);
		System.out.println(resultAddition);

		Operations multiply = (int x, int y) -> x * y;
		int resultMultiply = multiply.doOperation(20, 2);
		System.out.println(resultMultiply);
	}

	static class Developer {
		private String name;
		private int age;

		public Developer(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Developer [name=" + name + ", age=" + age + "]";
		}
	}

}
