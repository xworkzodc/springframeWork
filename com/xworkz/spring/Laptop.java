package com.xworkz.spring;

public class Laptop {
	private String brand;
	private float price;
	private int ram;
	private String color;
	
	
	
	public Laptop() {
		System.out.println(this.getClass().getSimpleName()  + "created");

	}
	
	public Laptop(String brand, float price,int ram, String color) {
		this.brand= brand;
		this.price= price;
		this.ram= ram;
		this.color= color;
		System.out.println(this.getClass().getSimpleName() + "created" + "with four arguments");
		
	}
	
	public Laptop(String brand,float price) {
		this.brand=brand;
		this.price= price;
		System.out.println(this.getClass().getSimpleName() + "created with two arg");
	}
	
	public Laptop(String brand, int ram) {
		this.brand=brand;
		this.ram=ram;
		System.out.println(this.getClass().getSimpleName() + "created with two arg wid concept of method overloading");
	}
	public void disply() {
		System.out.println("Display method invoked");
	}

}
