package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search extends main{
	public static ResultSet searchFor(Connection c, String field, String value)
	throws SQLException{
		ResultSet rs = null;
		Statement stmt = null;
		if(field.equals("Gender")){
			switch (value){//convert gender value to coresponding number
			case "M":
				value = "1";
				break;
			case "F":
				value = "2";
				break;
			case "K":
				value = "3";
				break;
			default:
				System.out.println("Invalid gender option");
				break;
			}
			field = "Gender_ID";
		}
		if(field.equals("Size")){
			switch (value){//convert size value to coresponding number
			case "S":
				value = "1";
				break;
			case "M":
				value = "2";
				break;
			case "L":
				value = "3";
				break;
			case "XL":
				value = "4";
				break;
			case "2XL":
				value = "5";
				break;
			case "3XL":
				value = "6";
				break;
			case "4XL":
				value = "7";
				break;
			default:
				System.out.println("Invalid size option");
				break;
			}
			field="Size_ID";
		}
		
	
		String query = 	"SELECT Product_ID, Category_name, Style_name, Gender_name, Size_name, Num_in_inventory, Disabled, In_stock, Date_added, Last_modified FROM inventory, style, size, gender, category " +//create sql search statement
						"WHERE inventory.style_ID = style.style_ID AND inventory.size_ID = size.size_ID AND inventory.gender_ID = gender.gender_ID AND inventory.category_ID = category.category_ID AND inventory." + field + " = " + value;
		
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
			
			
		} catch (SQLException ex) {

			//JDBCTutorialUtilities.printSQLException(e);

			System.out.println("there was an issue searching");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return null;
		} finally{
			if (stmt != null) {
				//stmt.close();
			return rs;
			}
		}
		
		return null;
	}
}
