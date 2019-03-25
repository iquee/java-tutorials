package br.com.luiztaira.java8.defaultmethod;

import java.math.BigDecimal;

public class Book extends Product implements CalculateOrderValue{

	public Book(Long id, BigDecimal value) {
		super(id, value);
	}	

	@Override
	public BigDecimal getProductValue(Product product) {
		BigDecimal customCover = new BigDecimal("5.00"); 
		return product.getValue().add(customCover);
	}

	@Override
	public BigDecimal calculateShipping(int postalCode) {
		return new BigDecimal("5.00");
	}

}
