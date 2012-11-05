package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert extends main{
	public static boolean insert(Connection c, String category, String style, String size, String gender, int numInInventory) throws SQLException/*Takes values that need to be inserted and inserts them into the table, returns true on success*/
	{
		ResultSet rs = null;
		Statement stmt = null;
		int temp;
		String query = null, Size_ID = null, Gender_ID = null, Barcode = null, number = null, Style_ID = null, Category_ID = null, tempString = null;
		
		//find the style_ID associated with the requested style
		query = "SELECT * FROM style";
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("there was an issue crossreferencing style");
			return false;
		}
		while (rs.next()){
			tempString = rs.getString("Style_name");
			if(tempString == style){
				temp = rs.getInt("Style_ID");
				Style_ID = Integer.toString(temp);
				break;
			}
		}
		if(Style_ID == null){
			System.out.println("the specified style was not found");
			return false;
		}
		
		//find the Category_ID associated with the requested category
		query = "SELECT * FROM category";
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("there was an issue crossreferencing category");
			return false;
		}
		while (rs.next()){
			tempString = rs.getString("Category_name");
			if(tempString == style){
				temp = rs.getInt("Category_ID");
				Category_ID = Integer.toString(temp);
				break;
			}
		}
		if(Category_ID == null){
			System.out.println("the specified category was not found");
			return false;
		}
		
		switch (gender){//convert gender value to coresponding number
			case "M":
				Gender_ID = "1";
				break;
			case "F":
				Gender_ID = "2";
				break;
			case "K":
				Gender_ID = "3";
				break;
			default:
				System.out.println("Invalid gender option");
				break;
		}
		switch (size){//convert size value to coresponding number
			case "S":
				Size_ID = "1";
				break;
			case "M":
				Size_ID = "2";
				break;
			case "L":
				Size_ID = "3";
				break;
			case "XL":
				Size_ID = "4";
				break;
			case "2XL":
				Size_ID = "5";
				break;
			case "3XL":
				Size_ID = "6";
				break;
			case "4XL":
				Size_ID = "7";
				break;
			default:
				System.out.println("Invalid size option");
				break;
		}
		//convert NumInInventory into a string
		number = Integer.toString(numInInventory);
		//TODO:Generate a barcode
		
		temp = 1234;
		Barcode = Integer.toString(temp);
		
		query = "INSERT INTO inventory (Product_ID, Category_ID, Style_ID, Gender_ID, Size_ID, Num_in_inventory, Disabled, In_stock, Barcode, Date_added, Last_modified) "+
						"VALUES ('2', '" + Category_ID + "', '" + Style_ID +"', '" + Gender_ID + "', '" + Size_ID + "', '" + number + "', '0', '0', '" + Barcode + "', now(), now())";
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("there was an issue inserting");
			return false;
		}
		
		return true;
	}
}
