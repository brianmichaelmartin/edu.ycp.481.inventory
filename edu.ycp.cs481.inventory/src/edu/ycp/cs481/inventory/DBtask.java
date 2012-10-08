package edu.ycp.cs481.inventory;
import java.sql.*;


public class DBtask {
	Connection c;
	public DBtask(Connection connection)
	{
		c = connection;
	}
	public boolean insert(/*values to insert*/)/*Takes values that need to be inserted and inserts them into the table, returns true on success*/
	{
		
		
		return/*success/fail*/ true;
	}
	public boolean remove(/*row to remove*/)/*Takes a value for a row number to remove and removes that row, returns true if operation completed succesfully*/
	{
		
		return/*success/fail*/ true;
	}
	public ResultSet search(String value, String field)/*takes a value, and a field to search for that value in and returns all results*/
	throws SQLException{
		
		Statement stmt = null;
		String query = 	"SELECT * FROM shirts, style, size, gender, category" +//create sql search statement
						"where shirts.style = style.style_id" +
						"AND" +
						"shirts.size = size.size_id" +
						"AND" +
						"shirts.gender" +
						"AND" +
						"shirts.category = category.category_id" +
						"AND" +
						"where " + field + value;
		ResultSet rs;
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
			
			
		} catch (SQLException e) {
			JDBCTutorialUtilities.printSQLException(e);
		} finally{
			if (stmt != null) {
				stmt.close();
			return rs;
			}
		}
		
	}
}
