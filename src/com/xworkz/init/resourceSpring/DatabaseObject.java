package com.xworkz.init.resourceSpring;

public class DatabaseObject {
	
	private String userName;
	private String password;
	private String url;
	private String driverClass;
	
	public DatabaseObject() {
		System.out.println(this.getClass().getSimpleName() +"created");
	}
	
	public DatabaseObject(String url,String driverClass) {
		super();
		this.url=url;
     	this.driverClass=driverClass;	
     	System.out.println("created url and driverclass " +this.getClass().getSimpleName());
	}
	private void initResource() {
       System.out.println("this method is used  init resource like connection,file or any other resources");
       if(!userName.isEmpty()&& !password.isEmpty() && !url.isEmpty() && !driverClass.isEmpty())
       {
    	  System.out.println("write code to cnnect to db");
       }
	}
	
	public void save() {
		System.out.println("save the data");
	}
	public void delete() {
		System.out.println("delete the data");
	}
	
    public void closeResources() {
    	System.out.println("close all d resources");
    }


	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("invoked set userName: "+ userName);
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("invoked set password : " + password);
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	

}
