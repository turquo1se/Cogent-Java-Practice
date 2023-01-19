package com.cogent.basics;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		
		Employee e = new Employee();
		e.setId(101);
		e.setName("Allen");
		e.setAddress("NY");
		e.setMobileNo(34567890);
		
		Address a = new Address();
		Department d = new Department();
		
		
		Employee e1 = new Employee();
		e1.setId(102);
		e1.setName("Allenn");
		e1.setAddress("NYy");
		e1.setMobileNo(345678901);
		
		System.out.println(e.getId() + "," + e.getName() + "," + e.getAddress() + "," + e.getMobileNo());
		System.out.println(d.getId() + "," + d.getName() + "," + d.getAddress() + "," + d.getMobileNo());
		e.attendOffice();
		e1.logOff();
		
		
	}
	static {
		System.out.println("SIB");
	}
	static void test() {
		System.out.println("static test method");
	}

}
