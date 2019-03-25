package br.com.luiztaira.java8.defaultmethod;

import java.math.BigDecimal;

public class DemoDefaultMethods {

	public static void main(String[] args) {
		Eletronics camera = new Eletronics(1L, new BigDecimal("1000.00")) {};
		BigDecimal eSubTotal = camera.calculateShipping(0000).add(camera.getProductValue(camera));
		BigDecimal eTotal = camera.calculateTax(eSubTotal);
		System.out.println("TOTAL value: " + eTotal);
		System.out.println("");
		
		// Book has a distinct tax from product. Here, we can override DefaultMethod
		Book book = new Book(2L, new BigDecimal("50.00")) {
			@Override
			public BigDecimal calculateTax(BigDecimal value) {
				return value.multiply(new BigDecimal("1.1"));
			}
		};
		BigDecimal bSubTotal = book.getProductValue(book).add(book.calculateShipping(0000));
		BigDecimal bTotal = book.calculateTax(bSubTotal);		
		System.out.println("TOTAL value: " + bTotal);
		System.out.println("");
	}

}
