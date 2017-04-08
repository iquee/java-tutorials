package br.com.luiztaira.collections.comparable;

public class User implements Comparable<User>{

    private String name;
    private int code;

    public User(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    @Override
    public int compareTo(User otherUser) {
        // here is using the #String.compareTo
        return this.getName().compareTo(otherUser.getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
