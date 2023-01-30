package autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // same like <bean> component will create an instance
public class Employee {
	
	private int eid;
	private String ename;
	private String eemail;
	@Autowired // refence bean
	private Account acc;
	// private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", acc=" + acc + " address="  +"]";
	}
	
	

}
