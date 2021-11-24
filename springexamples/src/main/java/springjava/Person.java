package springjava;

public class Person {
	String id;
	String name;
	String city;
	Person(){
		id="1001";
		name="Kumar";
		city="Chennai";
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

}
