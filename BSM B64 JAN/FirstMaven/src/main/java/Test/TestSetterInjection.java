package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Student;

public class TestSetterInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  ApplicationContext ap = new
		  ClassPathXmlApplicationContext("resources/spring.xml");
		  
		  Student s = (Student)ap.getBean("t"); //fetch the student object, student object is created by spring
		  System.out.println(s.toString());
		  
		 
	}

}
