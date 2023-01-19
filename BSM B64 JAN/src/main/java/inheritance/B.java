package inheritance;

public class B extends A{
	private int bid;
	private String bName;
	
	B() {
		super(100);
		System.out.println("B constructor");
	}
	
	
	public int getbId() {
		return bid;
	}
	public void setbId(int bid) {
		this.bid = bid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	

}
