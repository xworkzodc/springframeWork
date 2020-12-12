package com.xworkz.dependencyinjectio;

public class Fuel {

	private String type;
	private double price;
	private double quantity;
	
	public String burn() {
		String burning="no";
		if (quantity > 0) {
			System.out.println("The fuel is burning");
			burning = "yes";
		} else
			System.out.println("The fuel is Empty");
		return burning;

	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	
}
