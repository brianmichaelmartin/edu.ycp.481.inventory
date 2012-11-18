package edu.ycp.cs481.inventory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert{
	/*Product_ID will be set to the first availible product_ID
	 * 
	 * 
	 */
	
	public static boolean insert(Connection c, String category, String style, String size, String gender, int numInInventory, String Picture)/*Takes values that need to be inserted and inserts them into the table, returns true on success*/
	{
		Statement stmt = null;
		int temp, Product_ID, Category_ID, Style_ID, Gender_ID, Size_ID;
		String query = null, Barcode = null;
		
		//find first availible product id
		Product_ID = ConvertToID.findProID(c);
		
		//find the style_ID associated with the requested style
		Style_ID = ConvertToID.findStyID(c, style);
		if (Style_ID == 0){
			
			//add new entry
		}
		//find the Category_ID associated with the requested category
		Category_ID = ConvertToID.findCatID(c, category);
		
		//find the Gender_ID associated with the requested gender
		Gender_ID = ConvertToID.findGenID(gender);
		
		//find the Size_ID associated with the requested size
		Size_ID = ConvertToID.findSizID(size);
		
		//TODO:Generate a barcode
		
		temp = 1234;
		Barcode = Integer.toString(temp);
		
		query = "INSERT INTO inventory (Product_ID, Category_ID, Style_ID, Gender_ID, Size_ID, Num_in_inventory, Disabled, In_stock, Barcode, Date_added, Last_modified, Picture) "+
						"VALUES ('" + Product_ID + "', '" + Category_ID + "', '" + Style_ID +"', '" + Gender_ID + "', '" + Size_ID + "', '" + numInInventory + "', '0', '0', '" + Barcode + "', now(), now(), " + Picture + ")";
		
		
		try {
			stmt = c.createStatement();
			stmt.executeUpdate(query);
			stmt.close();
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			System.out.println("there was an issue inserting");
			return false;
		}
		
		return true;
	}
}
