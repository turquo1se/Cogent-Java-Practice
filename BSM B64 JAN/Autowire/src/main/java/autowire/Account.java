package autowire;

import org.springframework.stereotype.Component;

@Component
public class Account {
	private int acctnum;
	private String accttype;
	private String acctbranchname;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAcctnum() {
		return acctnum;
	}
	public void setAcctnum(int acctnum) {
		this.acctnum = acctnum;
	}
	public String getAccttype() {
		return accttype;
	}
	public void setAccttype(String accttype) {
		this.accttype = accttype;
	}
	public String getAcctbranchname() {
		return acctbranchname;
	}
	public void setAcctbranchname(String acctbranchname) {
		this.acctbranchname = acctbranchname;
	}
	@Override
	public String toString() {
		return "Account [acctnum=" + acctnum + ", accttype=" + accttype + ", acctbranchname=" + acctbranchname + "]";
	}
	

}
