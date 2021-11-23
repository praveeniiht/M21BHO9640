package test;

public class Department {
	String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dname=" + dname + "]";
	}
	

}
