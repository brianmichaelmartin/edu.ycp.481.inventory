package edu.ycp.cs481.inventory;
import java.sql.*;
import java.util.Properties;


public class DBtask {
	Connection c = null;
	public DBtask()
	{
		
	}
	public boolean getConnection()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();//load the JDBC driver
			
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_updated", "root", "mcoombs");
			
		}catch(SQLException ex){
			 System.out.println("SQLException: " + ex.getMessage());
			 System.out.println("SQLState: " + ex.getSQLState());
			 System.out.println("VendorError: " + ex.getErrorCode());
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return true;
	}
	public boolean insert(String category, String style, String size, String gender, int numInInventory) throws SQLException/*Takes values that need to be inserted and inserts them into the table, returns true on success*/
	{
		ResultSet rs = null;
		Statement stmt = null;
		String query = "INSERT INTO shirts(category, style, gender, size, numInInventory)"+
						"VALUES ("+category + "," + style + "," + size + "," + gender+ "," + numInInventory+")";
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("there was an issue searching");
			return false;
		}
		
		return true;
	}
	public boolean remove(/*row to remove*/)/*Takes a value for a row number to remove and removes that row, returns true if operation completed succesfully*/
	{
		//TODO
		return/*success/fail*/ true;
	}
	public ResultSet search(String field, String value)/*takes a value, and a field to search for that value in and returns all results*/
	throws SQLException{
		ResultSet rs = null;
		Statement stmt = null;
		String query = 	"SELECT * FROM shirts, style, size, gender, category" +//create sql search statement
						"WHERE shirts.style = style.style_id" +
						"AND" +
						"shirts.size = size.size_id" +
						"AND" +
						"shirts.gender" +
						"AND" +
						"shirts.category = category.category_id" +
						"AND" +
						"WHERE " + field + value;

		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
			
			
		} catch (SQLException e) {
			System.out.println("there was an issue searching");
		} finally{
			if (stmt != null) {
				stmt.close();
			return rs;
			}
		}
		return null;
		
	}
}
