package br.com.luiztaira.designpatterns.builder;

public class DemoBuilder {

    public static void main(String[] args) {

        Laptop laptop = new LaptopBuilder()
                .chooseBrand("DELL")
                .setProcessor("i7")
                .memorySize("8gb")
                .storageSize("1tb")
                .addComponent(new Component("mice", 200.00))
                .addComponent(new Component("keyboard", 100))
                .changePrice(999.00, true)
                .fullLaptop();

        System.out.println(laptop);
    }
}
