package edu.ycp.cs481.inventory;

import java.sql.*;


public class GetConnection{

	public static Connection get(){
		Connection c = null;
		try{
			System.out.println("test");
			Class.forName("com.mysql.jdbc.Driver");//.newInstance();//load the JDBC driver
			System.out.println("Joining databse");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_database", "root", "jem9wit");//change to your username/password
			System.out.println("Database joined");
			return c;
		}catch(SQLException ex){
			 System.out.println("SQLException: " + ex.getMessage());
			 System.out.println("SQLState: " + ex.getSQLState());
			 System.out.println("VendorError: " + ex.getErrorCode());
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		return c;
	}
}
