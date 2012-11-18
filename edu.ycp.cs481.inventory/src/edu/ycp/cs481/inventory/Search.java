package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * as of right now search only return Product_ID, Category_name, Style_name, gender_name, and size_name, in a pretty bad format...
 * i realized i should be closing the sql statement which also closes the result set so i cant return that right now. im going to work on
 * finding a better format to return data from search...
 * 
 */


public class Search{
	public static String searchFor(Connection c, String field, String value){
		
		ResultSet rs = null;
		Statement stmt = null;
		String result = "";
		int val = 0;
		switch(field){
			case "Gender":
				field = "Gender_ID";
				//find the Gender_ID associated with the requested gender
				val = ConvertToID.findGenID(value);
				break;
			case "Size":
				field="Size_ID";
				//find the Size_ID associated with the requested size
				val = ConvertToID.findSizID(value);
				break;
			case "Style":
				field = "Style_ID";
				//find the style_ID associated with the requested style
				val = ConvertToID.findSizID(value);
				break;
			case "Category":
				field = "Category_ID";
				//find the Category_ID associated with the requested category
				val = ConvertToID.findSizID(value);
				break;
			default:
				System.out.println("Unknown Field to search for");
				return null;
		}
		
		
	
		String query = 	"SELECT Product_ID, Category_name, Style_name, Gender_name, Size_name, Num_in_inventory, Disabled, In_stock, Date_added, Last_modified FROM inventory, style, size, gender, category " +//create sql search statement
						"WHERE inventory.style_ID = style.style_ID AND inventory.size_ID = size.size_ID AND inventory.gender_ID = gender.gender_ID AND inventory.category_ID = category.category_ID AND inventory." + field + " = " + val;
		
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()){
				int product_id = rs.getInt("Product_ID");
				String Category_name = rs.getString("Category_name");
				String Style_name = rs.getString("Style_name");
				String Gender_name = rs.getString("Gender_name");
				String Size_name = rs.getString("Size_name");
				result = result.concat("Product_ID =\t" + product_id + "\nCategory_name =\t" + Category_name +"\nStyle_name =\t" + Style_name + "\nGender_name =\t" + Gender_name + "\nSize_name =\t"+Size_name + "\n\n");
			}
			stmt.close();
		} catch (SQLException ex) {
			System.out.println("there was an issue searching");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return null;
		}
		
		return result;
	}
}
