package com.supermarket;

public class Beverage extends GroceryProduct {
  private SugarLevel sugar;
	public Beverage(String name, double price, double discount, SugarLevel sugar) {
		super(name, price, discount);
		// TODO Auto-generated constructor stub
		this.sugar=sugar;
	}
  
	public String display() {
		return super.display()+"\n"+ "SugarLevel:" + sugar;
	}
}
