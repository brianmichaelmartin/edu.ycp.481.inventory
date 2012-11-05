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
