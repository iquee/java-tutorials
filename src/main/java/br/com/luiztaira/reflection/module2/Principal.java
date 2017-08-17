package br.com.luiztaira.reflection.module2;

import java.util.List;
import java.util.Map;

public class Principal {

    public static void main(String[] args) throws Exception {
        Mapping mapping = new Mapping();
        mapping.load("/classes.properties");
        System.out.println(mapping.getImpl(List.class));
        System.out.println(mapping.getImpl(Map.class));
    }
}
