package br.com.luiztaira.java8.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollection8 {
	
	
	public static void main(String[] args) {
		// sorting using Collections API
		List<String> names = Arrays.asList("joao", "ze", "ana");		
		Collections.sort(names);		
		System.out.println("Sorting using API Collections.sort(): " + names);
		System.out.println("");
		
		names.sort(Comparator.naturalOrder());		
		System.out.println("Sorting using Natural Order of Comparator" + names);
		System.out.println("");
		
		names.sort(Comparator.reverseOrder());		
		System.out.println("Sorting DESC using Natural Reverse Order of Comparator" + names);
		System.out.println("");
		
		// sorting using Comparable, by id
		User user1 = new User(20L, "joao");
		User user2 = new User(1L, "ze");
		User user3 = new User(55L, "ana");
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);		
		Collections.sort(users);
		
		System.out.println("Sorting by ID using Collections.sort() and Comparable: " + users);
		System.out.println("");
		
		users.sort(Comparator.comparing(us -> us.getName()));
		System.out.println("Sorting by NAME using lambda: " + users);
		System.out.println("");
		
		// sorting using Comparator
		List<String> newNames = Arrays.asList("carlos", "alana", "zuleika");
		newNames.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});				
		System.out.println("Sorting using Comparator: " + newNames);
		System.out.println("");
				
		// sorting using Method Reference
		List<Person> people = new ArrayList<Person>();		
		Person p1 = new Person();
		p1.setName("Zed");
		p1.setBirthday(LocalDate.now().toString());
		people.add(p1);
		
		Person p2 = new Person();
		p2.setName("Ane");
		p2.setBirthday(LocalDate.now().plusDays(1).toString());
		people.add(p2);
		
		Person p3 = new Person();
		p3.setName("Bolt");
		p3.setBirthday(LocalDate.now().minusDays(1).toString());		
		people.add(p3);
		
		PersonComparator comparator = new PersonComparator();
		people.sort(comparator::compareByName);		
		System.out.println("Ordering by name using PersonComparator: " + people);
		System.out.println("");		
		
		people.sort(comparator::compareByBirthday);
		System.out.println("Ordering by birthday using PersonComparator: " + people);
		System.out.println("");
	}
	
	static class User implements Comparable<User>{
		Long id;
		String name;
		
		User(Long id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}	

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + "]";
		}

		@Override
		public int compareTo(User user) {
			return (int) (this.getId() - user.getId());
		}	
	}
	
	static class Person{
		String name;
		String birthday;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", birthday=" + birthday + "]";
		}		
	}
	
	// anonymous class to create a comparator
	static class PersonComparator{
	    public int compareByName(Person a, Person b) {
	        return a.getName().compareTo(b.getName());
	    }

	    public int compareByBirthday(Person a, Person b) {
	        return a.getBirthday().compareTo(b.getBirthday());
	    }
	}
}
