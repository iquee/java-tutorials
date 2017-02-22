package br.com.luiztaira.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class LaptopBuilder {

    private String brand;
    private String processor;
    private String memory;
    private String storage;
    private String gpu;
    private List<Component> components = new ArrayList<Component>();
    private double price;

    public LaptopBuilder chooseBrand(String brand){
        this.brand = brand;
        return this;
    }

    public LaptopBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }

    public LaptopBuilder memorySize(String memory){
        this.memory = memory;
        return this;
    }

    public LaptopBuilder storageSize(String storage){
        this.storage = storage;
        return this;
    }

    public LaptopBuilder changePrice(double price, boolean add){
        if (add){
            this.price += price;
        } else{
            this.price -= price;
        }
        return this;
    }

    public LaptopBuilder addComponent(Component component){
        this.price += component.getPrice();
        this.components.add(component);
        return this;
    }

    public Laptop fullLaptop(){
        return new Laptop(
                brand,
                processor,
                memory,
                storage,
                gpu,
                components,
                price
        );
    }
}
