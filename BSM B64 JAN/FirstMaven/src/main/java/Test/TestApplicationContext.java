package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Account;
import business.Address;
import business.Employee;

public class TestApplicationContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println("Employee details: ");
		System.out.println(emp.toString());
		Account ac = emp.getAcc();
		System.out.println("Account details: ");
		System.out.println(ac.toString());
		Address address = emp.getAddress();
		System.out.println("Address details: ");
		System.out.println(address.toString());

	}

}
