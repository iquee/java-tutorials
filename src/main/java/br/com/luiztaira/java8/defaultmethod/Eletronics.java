package br.com.luiztaira.java8.defaultmethod;

import java.math.BigDecimal;

public abstract class Eletronics extends Product implements CalculateOrderValue{	
	
	public Eletronics(Long id, BigDecimal value) {
		super(id, value);
	}

	@Override
	public BigDecimal calculateShipping(int postalCode) {
		return new BigDecimal("10.00");
	}
	
	@Override
	public BigDecimal getProductValue(Product product) {		
		BigDecimal accessories = new BigDecimal("150.12"); 
		return product.getValue().add(accessories);
	}
}
