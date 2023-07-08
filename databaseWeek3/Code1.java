package databaseWeek3;

import java.sql.*;


public class Code1 {
	public static void main(String[] args) {
		try {
//			Load the server
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Create the connection object
			String connectionURL="jdbc:mysql://localhost:3306/mart";
			
			Connection conn=DriverManager.getConnection(connectionURL,"root","12345Aa@");
		
			String insertQuery="insert customers values(4,'Sushmita','Das','Howrah Station Road','Kolkata')";
			Statement smt= conn.createStatement();
			smt.execute(insertQuery);
			System.out.println("Record Inserted Successfully");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
