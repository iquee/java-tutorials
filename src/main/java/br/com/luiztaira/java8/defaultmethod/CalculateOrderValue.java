package br.com.luiztaira.java8.defaultmethod;

import java.math.BigDecimal;

/**
 * Interface with DefaultMethod to calculate tax for type of Products.
 * Some products has a distinct tax, and can override the calculateTax
 * 
 * @author taira
 */
public interface CalculateOrderValue {
	
	default BigDecimal calculateTax(BigDecimal value){		
		BigDecimal tax = new BigDecimal("1.4");
		return tax.multiply(value);
	}
	
	public BigDecimal getProductValue(Product product);
	
	public BigDecimal calculateShipping(int postalCode);

}
