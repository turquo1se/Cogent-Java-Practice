package batch64dynamic.model;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private String address;
	private String mobile;
	
	public Employee() {
		super();
	};
	public Employee(int id, String name, float salary, String address, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.mobile = mobile;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", mobile="
				+ mobile + "]";
	}
	
	

}
