package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExpandTable {
	public static int Style(Connection c, String name){
		Statement stmt = null;
		int ID;
		
		ID = ConvertToID.findID(c, "Style");
		
		String query = "INSERT INTO Style (Style_ID, Style_name)" +
				"VALUES ('" + ID + "', '" + name + "')";
		try {
			stmt = c.createStatement();
			stmt.executeUpdate(query);
			stmt.close();
		} catch (SQLException ex) {
			System.out.println("there was an issue adding a new style to the style table");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return 0;
		}
		return ID;
	}
	
	
	public static int Category(Connection c, String name){
		Statement stmt = null;
		int ID;
		
		ID = ConvertToID.findID(c, "Category");
		
		String query = "INSERT INTO Category (Category_ID, Category_name)" +
				"VALUES ('" + ID + "', '" + name + "')";
		try {
			stmt = c.createStatement();
			stmt.executeUpdate(query);
			stmt.close();
		} catch (SQLException ex) {
			System.out.println("there was an issue adding a new category to the category table");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return 0;
		}
		return ID;
	}
}
