package com.xworkz.setter.init;

public class Mobile {
	
	private String brand; //init using const
	private double price; //init using const
	private boolean lteSupported;// init using set 
	
	public Mobile(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
		System.out.println(this.getClass().getSimpleName() + "Created");
	}

	public void setLteSupported(boolean lteSupported) {
		this.lteSupported = lteSupported;
	}
	public boolean isLteSupported() {
		return lteSupported;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + "]";
	}
	
	

}
