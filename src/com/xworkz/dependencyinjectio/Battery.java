package com.xworkz.dependencyinjectio;

public class Battery {

	private double capacity;
	private int power;
	
	public boolean charge() {
		boolean charging=false;
		if(power>10) {
		System.out.println("Battery is charging");
		charging=true;
		}else {
			System.out.println("Battery is not charging");
		}
		return charging;
	}
	
	/*public boolean discharge () {
	    boolean working= false;
	    if(capacity>0) {
			working=true;
		System.out.println("Battery is discharging");
	    }  else {
	    	System.out.println("Battery is not discharging");
	    }
	    return working;
	}*/
	
	public boolean discharge() {
		boolean working = false;
		if (capacity > 0) {
			working = true;
			System.out.println(this.getClass().getSimpleName() + " discharges....");
		} else {
			System.out.println(this.getClass().getSimpleName() + " does not discharge....");
		}
		return working;
	}

	
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	
}
