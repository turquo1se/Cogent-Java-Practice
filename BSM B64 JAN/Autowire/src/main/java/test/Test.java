package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowire.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		Employee empbean =(Employee) context.getBean(Employee.class); // pass class file 
		empbean.setEid(101);
		empbean.setEemail("abc@gmail.com");
		empbean.setEname("abc");
		
		System.out.println("Employee details: ");
		System.out.println(empbean.toString());
		
		empbean.getAcc().setAcctnum(1000);
		empbean.getAcc().setAccttype("saving");
		empbean.getAcc().setAcctbranchname("MA");
		
		System.out.println("Account details: ");
		System.out.println(empbean.getAcc().toString());

	}

}
