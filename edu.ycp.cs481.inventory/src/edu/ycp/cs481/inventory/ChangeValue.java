package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/*This class should probably only really be used to update Num_in_inventory
 * Disabled and In_stock. possibly also picture and barcode
 * using it with category, style, gender or size can still work but may not be very user friendly
 * that said, there really shouldnt be a need to update any of those fields at any point
 */
public class ChangeValue {
	public static boolean change(Connection c, String field, String newVal, String searchField, String searchVal)
	{
		Statement stmt = null;
		//check field for error
		
		
		String query = 	"UPDATE inventory " +//create sql update statement
						"SET " + field + "=" + newVal + ", Last_modified=now() " +
						"WHERE " + searchField + "=" + searchVal;
		
		try {
			stmt = c.createStatement();
			stmt.executeUpdate(query);
			stmt.close();
		} catch (SQLException ex) {
			System.out.println("there was an issue updating the table");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
		}
		
		return true;
		
	}
	
	
}
