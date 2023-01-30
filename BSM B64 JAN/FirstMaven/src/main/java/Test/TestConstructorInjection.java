package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Student;

public class TestConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring1.xml");
		
		Student s = (Student)ap.getBean("obj"); //return an object of student
		System.out.println(s.toString());

	}

}
