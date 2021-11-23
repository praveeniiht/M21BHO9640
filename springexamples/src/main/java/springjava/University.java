package springjava;

public class University {
	String uname;
	String estd;
	University(){
		uname="IITM";
		estd="1954";
	}
	public void showData() {
		System.out.println("Name: "+uname+" Established year: "+estd);
	}

}
