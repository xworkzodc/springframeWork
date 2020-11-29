package com.xworkz.spring;

public class Season {
	
	private String name;
	private int period;
	private float temp;
	
	public Season() {
		System.out.println(this.getClass().getSimpleName() + "Created");
	}

	public Season(String name, int period, float temp) {
		super();
		this.name = name;
		this.period = period;
		this.temp = temp;
		System.out.println(this.getClass().getSimpleName() + "Created with two arguments");
	}
	
	public Season(String name, int period) {
		this.name = name;
		this.period=period;
		System.out.println(this.getClass().getSimpleName() + "Created with two arg with two arg ");
	}
	
	public Season(String name, float temp) {
		this.name=name;
		this.temp=temp;
		System.out.println(this.getClass().getSimpleName() + " created with two arg with diff parameters");
	}

	@Override
	public String toString() {
		return "Season [name=" + name + ", period=" + period + ", temp=" + temp + "]";
	}
	
	

}
