package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	/*I suggest passing Product_ID as the field and the product_ID of the row you want to delete
	 * 
	 * 
	 */
	public static boolean deleterow(Connection c, String field, String val){
		Statement stmt = null;
		
		String query = "DELETE FROM inventory WHERE " + field + " = " + val;
		
		try {
			stmt = c.createStatement();
			stmt.executeUpdate(query);
			
			
		} catch (SQLException ex) {
			System.out.println("there was an issue deleting");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
		}
		return true;
	}
}
