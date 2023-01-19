package inheritance;

public class A {
	
	private int aid;
	private String aName;
	
	A(int x) {
		System.out.println("A constructor" + x);
	}
	
	public int getaId() {
		return aid;
	}
	public void setaId(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	

}
