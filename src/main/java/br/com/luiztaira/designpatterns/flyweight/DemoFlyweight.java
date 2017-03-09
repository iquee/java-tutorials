package br.com.luiztaira.designpatterns.flyweight;

public class DemoFlyweight {

    public static void main(String[] args) {

        Circle circle = (Circle) ShapeFactory.getCircle("blue");
        circle.setRadius(10);
        circle.draw();

        System.out.println("-----");

        Circle circle1 = (Circle) ShapeFactory.getCircle("red");
        circle1.setRadius(20);
        circle1.draw();

        System.out.println("-----");

        Circle circle2 = (Circle) ShapeFactory.getCircle("red");
        circle2.setRadius(30);
        circle2.draw();
    }
}
