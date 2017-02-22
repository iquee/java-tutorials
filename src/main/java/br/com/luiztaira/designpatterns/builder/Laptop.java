package br.com.luiztaira.designpatterns.builder;

import java.util.List;

public class Laptop {

    private String brand;
    private String processor;
    private String memory;
    private String storage;
    private String gpu;
    private List<Component> components;
    private double price;

    public Laptop(String brand, String processor, String memory, String storage,
                  String gpu, List<Component> components, double price) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.gpu = gpu;
        this.components = components;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                ", components=" + components +
                ", price=" + price +
                '}';
    }
}
