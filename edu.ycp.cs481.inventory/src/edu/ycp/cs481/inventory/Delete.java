package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete {
	public boolean deleterow(Connection c, String field, String val){
		@SuppressWarnings("unused")
		ResultSet rs = null;
		Statement stmt = null;
		
		String query = "DELETE FROM inventory WHERE " + field + " = " + val;
		
		return true;
	}
}
