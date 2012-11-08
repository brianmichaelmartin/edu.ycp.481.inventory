package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConvertToID {
	public static int findProID(Connection c){
		String query = "SELECT Product_ID from inventory";
		ResultSet rs = null;
		Statement stmt = null;
		int result;
		
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
			rs.last();
			result = rs.getInt("Product_ID")+1;
		} catch (SQLException ex) {
			System.out.println("there was an issue finding an availible product_ID");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return 0;
		}
		return result;
	}
	
	public static int findID(Connection c, String table) throws SQLException{
		String query = "SELECT " + table + "_ID from " + table;
		ResultSet rs = null;
		Statement stmt = null;
		int result;
		stmt = c.createStatement();
		try {
			rs = stmt.executeQuery(query);
		} catch (SQLException ex) {
			System.out.println("there was an issue finding an availible product_ID");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return 0;
		}
		
		
		rs.last();
		result = rs.getInt(table+"_ID")+1;
		return result;
	}
	
	public static int findCatID(Connection c, String cat) throws SQLException{//This function finds the category ID for a category
		String query = "SELECT * FROM category";
		ResultSet rs = null;
		Statement stmt = null;
		stmt = c.createStatement();
		//convert category to lower case
		String category = cat.toLowerCase();
		try {
			rs = stmt.executeQuery(query);
		} catch (SQLException ex) {
			System.out.println("there was an issue crossreferencing category");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return 0;
		}
		while (rs.next()){//loop through result set
			//check to see if current Category_name is equal to the category we are attempting to find
			if(((rs.getString("Category_name")).toLowerCase()).equals(category)){
				//if it is, then return
				return rs.getInt("Category_ID");
			}
		}
		//if category is not found then return
		System.out.println("the specified category was not found");
		return 0;
	}
	
	public static int findStyID(Connection c, String sty) throws SQLException{//This function finds the style ID for a style
		String query = "SELECT * FROM style";
		ResultSet rs = null;
		Statement stmt = null;
		stmt = c.createStatement();
		//convert style to lower case
		String style = sty.toLowerCase();
		try {
			rs = stmt.executeQuery(query);
		} catch (SQLException ex) {
			System.out.println("there was an issue crossreferencing style");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return 0;
		}
		while (rs.next()){
			if(((rs.getString("Style_name")).toLowerCase()).equals(style)){
				return rs.getInt("Style_ID");
			}
		}
		
		System.out.println("the specified style was not found");
		return 0;
	}
	
	public static int findGenID(String gen) throws SQLException{//This function finds the gender ID for a gender
		int result;
		String gender = gen.toLowerCase();
		switch (gender){//convert gender value to coresponding number
			case "m":
				result = 1;
				break;
			case "f":
				result = 2;
				break;
			case "k":
				result = 3;
				break;
			default:
				System.out.println("Invalid gender option");
				return 0;
		}
		return result;
	}
	
	public static int findSizID(String siz) throws SQLException{
		int result = 0;
		switch (siz){//convert size value to coresponding number
			case "S":
				result = 1;
				break;
			case "M":
				result = 2;
				break;
			case "L":
				result = 3;
				break;
			case "XL":
				result = 4;
				break;
			case "2XL":
				result = 5;
				break;
			case "3XL":
				result = 6;
				break;
			case "4XL":
				result = 7;
				break;
			default:
				System.out.println("Invalid size option");
				break;
			}
		return result;
	}
	
}
