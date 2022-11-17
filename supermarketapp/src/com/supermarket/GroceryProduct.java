package com.supermarket;

import java.util.ArrayList;

public class GroceryProduct {
  private String name;
  private  double price;
  private double discount;
  
  public GroceryProduct(String name,double price, double discount) {
	  this.name=name;
	  this.price=price;
	  this.discount=discount;
	  
  }
  
  
  public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public double getDiscount() {
	return discount;
}


public void setDiscount(double discount) {
	this.discount = discount;
}


public double getAddition() {
	  return (price*discount/100);
  }
  
  public  String  display() {
	  return  "name:"+ name +"\n" + "price:"+  price+"\n" +"discount:"+  discount;
  }
  
  public static void  main(String[] args) {
	  
	 ArrayList<GroceryProduct> cart=new ArrayList<GroceryProduct>();
	 GroceryProduct   Bread=new GroceryProduct("Bread",2.5,10);
	 cart.add(Bread);
	 
	System.out.println(Bread.display()+ "\n");
	
	//Beverage coke=new Beverage("coke",3.5,20,SugarLevel.ADDED_SUGAR);
	// cart.add(coke);
	 
	 //System.out.println(coke.display()+ "\n");
	 
	 
	 DairyProduct Milk=new DairyProduct("Milk",1.5,5,Fat.LOW);
	 cart.add(Milk);
	 
	 System.out.println(Milk.display()+ "\n");
	 
	 double total=0; 
	 
	 for(int i=0; i<cart.size();i++) {
		 
		 total += cart.get(i).getPrice();
		 
		 
	 }
	 System.out.println("the Total Price :"+ total);
	 
	 
	 GroceryProduct P=new Beverage("coke",3.5,20,SugarLevel.ADDED_SUGAR);
	 System.out.println(P.display()+ "\n");
	 
  }
}
