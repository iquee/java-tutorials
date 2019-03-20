package br.com.luiztaira.java8.defaultmethod;

import java.math.BigDecimal;

public class Product {
	
	Long id;
	BigDecimal value;
	
	public Product(Long id, BigDecimal value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	

}
