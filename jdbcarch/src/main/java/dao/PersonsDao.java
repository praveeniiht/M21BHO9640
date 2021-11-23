package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Persons;
public class PersonsDao {
	
	static Connection connection;
	static Statement statement;
	static ResultSet resultSet;
	static PreparedStatement pst;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getDataConnection() {
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String uid = "root";
		String pwd = "root";
		try {
			connection = DriverManager.getConnection(url, uid, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static List<Persons> getPersonsData(){
		
		List<Persons> persons = new ArrayList();
		try {
			connection = getDataConnection();
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "select * from persons";

		try {
			resultSet = statement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
		
			while (resultSet.next())
			
			persons.add(new Persons(resultSet.getInt(4),resultSet.getString(1),resultSet.getString(2),resultSet.getString(3)));
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return persons;
		
	}
	
	public static String insertPersonData(Persons person) {
		int k =0;
		try {
			connection = getDataConnection();
			pst = connection.prepareStatement("insert into persons values(?,?,?,?)");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			connection = getDataConnection();
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pst.setInt(4, person.getPid());
			pst.setString(1, person.getName());
			pst.setString(2, person.getCity());
			pst.setString(3, person.getState());
			k = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(k!=0)
			return "Record inserted...";
		else
			return "Record not inserted...";
	}
	

}
