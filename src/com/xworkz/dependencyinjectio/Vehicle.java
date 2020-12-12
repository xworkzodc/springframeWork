package com.xworkz.dependencyinjectio;

public class Vehicle {

    private String regNo;
	private String owner;
	private Battery battery;
	private Fuel fuel;
	
	public Vehicle(String regNo, String owner, Battery battery) {
		super();
		this.regNo = regNo;
		this.owner = owner;
		this.battery = battery;
	}
	
	public boolean start() {
		System.out.println("invoked start in vehicle ");
		boolean started=false;
		boolean batteryWorking=battery.discharge();
		if(batteryWorking) {
			System.out.println("Battery is working , check d fuel now");
			String burn = fuel.burn();
			if("yes".equals(burn)) {
				System.out.println("fuel is there car started");
				started=true;
			}else {
			System.out.println("fuel is not thr,so car not starting");
	
		}
			
		}
		return started;
	
	}
   

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	
	
	
	
	
}
