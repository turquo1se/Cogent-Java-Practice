package day6;

import java.util.Objects;

public class Employee {
	
	

	private int Id;
	private String Name;
	private int Age;
	private String Dept;
	private double Salary;
	
	public Employee(int id, String name, int age, String dept, double salary) {
		super();
		this.Id = id;
		this.Name = name;
		this.Age = age;
		this.Dept = dept;
		this.Salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Age: " + Age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Age, Dept, Id, Name, Salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Age == other.Age && Objects.equals(Dept, other.Dept) && Id == other.Id
				&& Objects.equals(Name, other.Name)
				&& Double.doubleToLongBits(Salary) == Double.doubleToLongBits(other.Salary);
	}
	
	

}
