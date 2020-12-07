package com.xworkz.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Animals {
	
	private ArrayList<String> domesticAnimals;
    private 	TreeSet<String>   wildAnimals;
	
	public ArrayList<String> getDomesticAnimals() {
		return domesticAnimals;
	}
	public void setDomesticAnimals(ArrayList<String> domesticAnimals) {
		this.domesticAnimals = domesticAnimals;
	}
	public TreeSet<String> getWildAnimals() {
		return wildAnimals;
	}
	public void setWildAnimals(TreeSet<String> wildAnimals) {
		this.wildAnimals = wildAnimals;
	}
	

}
