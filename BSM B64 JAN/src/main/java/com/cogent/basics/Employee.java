package com.cogent.basics;

public class Employee {
	private int id;
	private String name;
	private String address;
	private long mobileNo;
	
	Employee() { //constructor
		this.id = 101;
		this.name = "Allen";
		this.address = "NY";
		this.mobileNo = 1234567;
	}
	
	void attendOffice() {
		System.out.println("Employee attend office");
	}
	
	void logOff() {
		System.out.println("Employee log off");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
