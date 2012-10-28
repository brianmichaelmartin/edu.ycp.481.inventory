package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert extends main{
	public static boolean insert(Connection c, String category, String style, String size, String gender, int numInInventory) throws SQLException/*Takes values that need to be inserted and inserts them into the table, returns true on success*/
	{
		ResultSet rs = null;
		Statement stmt = null;
		String query = "INSERT INTO shirts(category, style, gender, size, numInInventory)"+
						"VALUES ("+category + "," + style + "," + size + "," + gender+ "," + numInInventory+")";
		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("there was an issue inserting");
			return false;
		}
		
		return true;
	}
}
