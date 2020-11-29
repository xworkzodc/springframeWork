package com.xworkz.springinit;

public class Hotel {
	private String name;//init using const
	private boolean type;//init using set
	private String location;
	
	public Hotel() {
		System.out.println(this.getClass().getSimpleName() + "created ");
	}
	
	public Hotel(String name) {
		this.name=name;
		//System.out.println("initializing using constructor");
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
		System.out.println("setType "+type);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
		System.out.println("setLocation "+location);
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", type=" + type + ", location=" + location + "]";
	}


	

	
	
	 

}
