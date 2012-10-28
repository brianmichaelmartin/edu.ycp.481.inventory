package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection extends main{

	public static Connection get(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();//load the JDBC driver
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_updated", "root", "mcoombs");//change to your username/password
			return c;
		}catch(SQLException ex){
			 System.out.println("SQLException: " + ex.getMessage());
			 System.out.println("SQLState: " + ex.getSQLState());
			 System.out.println("VendorError: " + ex.getErrorCode());
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		return null;
	}
}
