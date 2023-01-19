package collectionExample;


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int arr[] = { 1, 2, 3 };
		
		for (int y:arr) { // enhance for loop
			System.out.println(y);
		}
	}
}

// Collection
// 1) Collections are not fixed in size (array is fixed)
// 2) With respect to memory collections are good (arrays are not)
// 3) With respect to performance collections are not good (array are good)
// 4) Collections can hold heterogeneous data elements (array can only hold same data type element)
// 5) Every collection class has built by using some data structure (no underlying data structure for array)
// 6) Collections can hold only objectives but not primitives (array can hold both)

// Array -- data structure, collection of same type of elements with fixed size, predefined class

