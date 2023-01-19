package object;

public class P{
	
	
	public int x;
	
	P(int x) {
		this.x = x;
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P p1 = new P(10);
		P p2 = new P(10);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);

	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "P " + x;
	}
	
	


}
// Object class -- predefined class, it is parent of all classes by default
// it is available in java.lang package

// 1. getClass()
// 2. hashCode()
// 3. equals()
// 4. notify()
// 5. notifyAll()
// 6. wait()
// 7. wait(long)
// 8. wait(long, int)
// 9. finalize()
// 10. clone()
// 11. toString()

