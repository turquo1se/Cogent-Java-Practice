package inheritance;

public class C extends A{
	
	private int cid;
	private String cName;
	
	C() {
		super(100);
		System.out.println("C constructor");
	}
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	

}
