package br.com.luiztaira.designpatterns.factory;

/**
 * The design pattern factory provides one of the best way to create an object
 * In this pattern, we create an object without expose the creation login to the client and the object created refers to the interface
 */
public interface Document {
    public void createDocument();
}
