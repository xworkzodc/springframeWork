package com.xworkz.setter.init;

public class Monitor {
	
	private int width;//init using const
	private int height; //init using const
	private String modelNo;//init using set
	private String mfgDate; //init using set
	
	public Monitor(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		System.out.println("initializing using constructor");
	}


	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
		System.out.println("setModelNo as "+modelNo);
	}
	
	
	public String getMfgDate() {
		return mfgDate;
	}


	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
		System.out.println("setMfgDate as "+mfgDate);
	}


	@Override
	public String toString() {
	  return "Monitor [width=" + width + ", height=" + height +  "]";
	}

	

}
