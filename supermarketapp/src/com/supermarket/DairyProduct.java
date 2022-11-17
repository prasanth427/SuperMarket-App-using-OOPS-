package com.supermarket;

public class DairyProduct extends GroceryProduct {

	private Fat fat;
	public DairyProduct(String name, double price, double discount, Fat fat) {
		super(name, price, discount);
		// TODO Auto-generated constructor stub
		this.fat=fat;
	}

	
	public String display() {
		return( super.display()+ "\n"+ "fat:"+ fat);
	}
}
