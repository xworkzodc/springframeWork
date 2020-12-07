package com.xworkz.init.resourceSpring;

import java.io.Serializable;
import java.sql.Date;

public class RocketDTO implements Serializable {
	
	private int id;
	private String country;
	private String launchDate;
	private double cost;
		
	public RocketDTO() {
		System.out.println("created" + this.getClass().getSimpleName()); 
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}
	public double getCost() {
		return cost;
	}
	@Override
	public String toString() {
		return "RocketDTO [id=" + id + ", country=" + country + ", launchDate=" + launchDate + ", cost=" + cost + "]";
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
	

}
