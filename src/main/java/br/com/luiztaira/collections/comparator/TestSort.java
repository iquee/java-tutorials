package br.com.luiztaira.collections.comparator;

import java.util.Set;
import java.util.TreeSet;

public class TestSort {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ana", 30);
        Employee e2 = new Employee("Maria", 43);
        Employee e3 = new Employee("John", 20);

        Set<Employee> employees = new TreeSet<Employee>(new SortByAge());
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println(employees);

    }
}
