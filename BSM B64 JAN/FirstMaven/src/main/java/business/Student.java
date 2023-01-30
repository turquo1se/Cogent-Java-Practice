package business;

public class Student {



	private String name;
	private int age;
	private String email;

	
	Student(){
		System.out.println("student default contsructor");
	}
	
	public Student(String name, int age, String email) {
		super();
		System.out.println("parameterized constructor");
		
		this.name = name;
		this.age = age;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
}
