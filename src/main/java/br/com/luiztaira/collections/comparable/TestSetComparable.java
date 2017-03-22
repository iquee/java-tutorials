package br.com.luiztaira.collections.comparable;

import java.util.*;

public class TestSetComparable {

    public static void main(String[] args) {
        User user1 = new User("Bill", 1);
        User user2 = new User("Bob", 42);
        User user3 = new User("Alfred", 8);

        Set<User> users = new TreeSet<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        // we don't need to use Collections.sort. TreeSet must have object that implements comparable

        System.out.println(users);

    }
}
