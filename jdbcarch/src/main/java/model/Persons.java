package model;

public class Persons {
	
	@Override
	public String toString() {
		return "Persons [pid=" + pid + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	private int pid;
	private String name;
	private String city;
	private String state;
	
	Persons(){
		
	}
	public Persons(int pid, String name, String city, String state) {
		super();
		this.pid = pid;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
