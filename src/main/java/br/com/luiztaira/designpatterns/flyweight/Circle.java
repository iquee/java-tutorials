package br.com.luiztaira.designpatterns.flyweight;

public class Circle implements Shape {
    private String color;
    private int radius;

    public Circle(String color) {
        this.color = color;
        System.out.println("Circle created....");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + "| radius : " + radius);
    }
}
