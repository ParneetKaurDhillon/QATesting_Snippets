import java.sql.*;

/*import java.sql.Connection;

import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException; */

public class dbtesting {
/*
	//Connection con;

//	static final String JDBC_driver = "com.mysql.jdbc.Driver";
//	static final String DB_URL = "jdbc:mysql://localhost/employeecredentials";

	// Database credentials (If Mysql asks for username, paswrd at the beginning

	/*
	 * static final String USER = "Your username"; static final String PASS =
	 * "Your Password";
	 */

/*	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stat = null;
		try {
			//Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Open a Class
			conn = DriverManager.getConnection(DB_URL);
			//Execute a query
			System.out.println("Creating a statement...");
			stat = conn.createStatement();
			String sql;
			sql = "SELECT srno,username,password FROM employeecredentials";
			ResultSet rs = stat.executeQuery(sql);
			while(rs.next()) {
				// Retreive by Columnname
				int s = rs.getInt("srno");
				String uname = rs.getString("username");
				String pwd = rs.getString("password");
				// Display Values
				System.out.println("Serial No. "+ s);
				System.out.println("Username "+ uname);
				System.out.println("Password"+ pwd);
				// Clean Up Environment
				rs.close();
				stat.close();
				conn.close();
			} catch( SQLException se) {
				se.printStackTrace();
			  } 
			  catch(Exception e) {
				e.printStackTrace();
			  } finally {
				  try {
			    		if(stat!=null) {
			    			stat.close();
			    		}
			       }
			       catch(SQLException se1) {
			       }
			       try {
			    		if(conn !=null) {
			    			conn.close();
			    		}
			    	}
			    	catch(SQLException se2) {
			    		se2.printStackTrace();
			    	} // end finally try
				  }//end try
			System.out.println("Goodbye");*/
	} 
