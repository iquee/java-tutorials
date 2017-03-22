package br.com.luiztaira.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListComparable {

    public static void main(String[] args) {

        User user1 = new User("Bill", 1);
        User user2 = new User("Bob", 42);
        User user3 = new User("Alfred", 8);

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Collections.sort(users);

        System.out.println(users);
    }
}
