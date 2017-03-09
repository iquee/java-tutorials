package br.com.luiztaira.designpatterns.factory;

public class DemoFactory {

    public static void main(String[] args) {
        Document document = new PDF();
        document.createDocument();

        Document document1 = new PPT();
        document1.createDocument();
    }

}
