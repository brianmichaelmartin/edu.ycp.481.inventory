package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ChangeValue {
	public boolean change(Connection c, String field, String newVal, String searchField, String searchVal)
	throws SQLException
	{
		ResultSet rs = null;
		Statement stmt = null;
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
