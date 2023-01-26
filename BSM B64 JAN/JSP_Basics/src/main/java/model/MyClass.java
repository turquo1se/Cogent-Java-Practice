package model;

public class MyClass {

	private Integer id;
	private String name;
	
	public MyClass() {
		super();
	}	
	
	public MyClass(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getData() {
		return "how are you";	
	}

}
