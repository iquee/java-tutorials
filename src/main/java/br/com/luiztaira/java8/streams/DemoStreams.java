package br.com.luiztaira.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreams {
	
	public static void main(String[] args) {
		// creating Stream
		System.out.println("Creating Stream");
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		Consumer<String> consumer = s1 -> System.out.println(s1);		
		stream.forEach(s -> consumer.accept(s));
		
		System.out.println("");
		
		stream = Stream.of("x", "y", "z");
		stream.forEach(System.out::println);
		
		System.out.println("");
		
		List<String> list = Arrays.asList("ops", "go", "ok", "ops", "");
		list.stream().forEach(System.out::println);
		
		System.out.println("");
		
		System.out.println("Parallel Stream");
		list.parallelStream().forEach(System.out::println);
		
		System.out.println("");
		
		System.out.println("Distinct count");
		System.out.println(list.stream().distinct().count());
		
		System.out.println("");
		
		System.out.println("Contains word: ya?");
		boolean isExist = list.stream().anyMatch(item -> item.contains("ya"));
		System.out.println(isExist);
		
		System.out.println("");
		
		System.out.println("Filtering: ops in" + list.toString()); 
		Stream<String> st = list.stream().filter(element -> element.contains("ops"));
		st.forEach(System.out::println);
		
		System.out.println("");
		
		System.out.println("Map: using Function to change type");
		List<String> numbers = Arrays.asList("1","2","3","4","5");
		Function<String, Integer> transformInNumber = s -> Integer.parseInt(s); 
		Stream<Integer> numbersSt = numbers.stream().map(sss -> transformInNumber.apply(sss));
		numbersSt.forEach(System.out::println);
		
		System.out.println("");
		
		System.out.println("Matching");
		boolean isValid1 = numbers.stream().anyMatch(element -> element.contains("1"));  // true
		boolean isValid2 = numbers.stream().allMatch(element -> element.contains("4"));  // false
		boolean isValid3 = numbers.stream().noneMatch(element -> element.contains("3")); // false
		
		System.out.println(isValid1);
		System.out.println(isValid2);
		System.out.println(isValid3);
		
		System.out.println("");
		
		System.out.println("Reduce");
		List<Integer> nums = Arrays.asList(10,25,63,2,4,8,9);
		Integer reduce = nums.stream().reduce(10, (from, until) -> from + until);
		System.out.println(reduce);
		
		System.out.println("");
		System.out.println("Collecting");
		List<String> result = list.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
		result.forEach(System.out::println);
		
	}

}
