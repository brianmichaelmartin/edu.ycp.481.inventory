package edu.ycp.cs481.inventory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Search_old extends main{
	int numInInventory;
	String category, style, gender, size;
	static DBtask db = new DBtask();//create new database access object

	public static void searchByCategory(String value) throws SQLException{
		ResultSet rs = db.search("category", value);
		while(rs.next()){
			int product_id = rs.getInt("product_id");
			String style = rs.getString("STYLE_style_type");
			String category = rs.getString("CATEGORY_category_type");
			String gender = rs.getString("GENDER_gender_type");
			String size = rs.getString("SIZE_size_type");
			System.out.println(	"Product ID" + product_id +"\t" +
					"Style" + style + "\t" +
					"category" + category + "\t" +
					"gender" + gender +"\t" +
					"size" + size);
		}
	}

	public static void searchBySize(String value) throws SQLException{
		ResultSet rs = db.search("size", value);
		while(rs.next()){
			int product_id = rs.getInt("product_id");
			String style = rs.getString("STYLE_style_type");
			String category = rs.getString("CATEGORY_category_type");
			String gender = rs.getString("GENDER_gender_type");
			String size = rs.getString("SIZE_size_type");
			System.out.println(	"Product ID" + product_id +"\t" +
					"Style" + style + "\t" +
					"category" + category + "\t" +
					"gender" + gender +"\t" +
					"size" + size);
		}
	}
	public static void searchByGender(String value) throws SQLException{
		ResultSet rs = db.search("gender", value);
		while(rs.next()){
			int product_id = rs.getInt("product_id");
			String style = rs.getString("STYLE_style_type");
			String category = rs.getString("CATEGORY_category_type");
			String gender = rs.getString("GENDER_gender_type");
			String size = rs.getString("SIZE_size_type");
			System.out.println(	"Product ID" + product_id +"\t" +
					"Style" + style + "\t" +
					"category" + category + "\t" +
					"gender" + gender +"\t" +
					"size" + size);
		}
	}
	public static void searchByStyle(String value) throws SQLException{
		ResultSet rs = db.search("style", value);
		while(rs.next()){
			int product_id = rs.getInt("product_id");
			String style = rs.getString("STYLE_style_type");
			String category = rs.getString("CATEGORY_category_type");
			String gender = rs.getString("GENDER_gender_type");
			String size = rs.getString("SIZE_size_type");
			System.out.println(	"Product ID" + product_id +"\t" +
					"Style" + style + "\t" +
					"category" + category + "\t" +
					"gender" + gender +"\t" +
					"size" + size);
		}
	}
	
}
