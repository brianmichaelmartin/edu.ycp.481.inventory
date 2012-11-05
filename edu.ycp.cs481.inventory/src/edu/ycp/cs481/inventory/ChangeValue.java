package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*This class should probably only really be used to update Num_in_inventory
 * Disabled and In_stock. possibly also picture and barcode
 * using it with category, style, gender or size can still work but may not be very user friendly
 * that said, there really shouldnt be a need to update any of those fields at any point
 */
public class ChangeValue {
	public boolean change(Connection c, String field, String newVal, String searchField, String searchVal)
	throws SQLException
	{
		@SuppressWarnings("unused")
		ResultSet rs = null;
		Statement stmt = null;
		//check field for error
		
		
		String query = 	"UPDATE inventory " +//create sql update statement
						"SET " + field + "=" + newVal + ", Last_modified=now() " +
						"WHERE " + searchField + "=" + searchVal;
		
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
			
			
		} catch (SQLException e) {

			//JDBCTutorialUtilities.printSQLException(e);

			System.out.println("there was an issue updating the table");
			return false;
		} finally{
			if (stmt != null) {
				stmt.close();
			return true;
			}
		}
		
		return true;
		
	}
	
	
}
