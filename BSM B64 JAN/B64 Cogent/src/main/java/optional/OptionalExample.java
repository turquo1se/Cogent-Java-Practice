package optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();
		
		Optional<String> gender1 = Optional.ofNullable(null);
		
		System.out.println(gender.filter(g -> g.equals("male"))); 
		System.out.println(gender.filter(g -> g.equals("null"))); 
		System.out.println(gender.filter(g -> g.equalsIgnoreCase("male"))); 
		System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); 
		
		//map
		
		System.out.println("Non empty Optional:: " + gender.map(String::toLowerCase));
		System.out.println("empty Optional:: " + emptyGender.map(String::toUpperCase));
		
		
		
		if(emptyGender.isPresent()) {
			System.out.println("value available");
		} else {
			System.out.println("value not available");
		}
		
		gender.ifPresent(g -> System.out.println("in gender, value available"));
	}

}
// In java 8, Optional is class, which will use to remove null pointer exception