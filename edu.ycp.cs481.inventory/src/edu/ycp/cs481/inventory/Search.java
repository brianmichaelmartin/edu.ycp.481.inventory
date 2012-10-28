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
		String query = 	"SELECT Category_name, Style_name, Gender_name, Size_name FROM inventory, style, size, gender, category" +//create sql search statement
						"WHERE inventory.style = style.style_id" +
						"AND" +
						"inventory.size = size.size_id" +
						"AND" +
						"inventory.gender" +
						"AND" +
						"inventory.category = category.category_id" +
						"AND" +
						"where " + field + value;
		
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
			
			
		} catch (SQLException e) {

			//JDBCTutorialUtilities.printSQLException(e);

			System.out.println("there was an issue searching");
			return null;
		} finally{
			if (stmt != null) {
				stmt.close();
			return rs;
			}
		}
		
		return null;
	}
}
