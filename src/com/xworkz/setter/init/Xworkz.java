package com.xworkz.setter.init;

public class Xworkz {
	private String name;
	private String courseAvailable;
	
	public Xworkz(String name, String courseAvailable) {
		super();
		this.name = name;
		this.courseAvailable = courseAvailable;
		System.out.println("Initializing using constructor");
	}

	@Override
	public String toString() {
		return "Xworkz [name=" + name + ", courseAvailable=" + courseAvailable + "]";
	}
	

}
