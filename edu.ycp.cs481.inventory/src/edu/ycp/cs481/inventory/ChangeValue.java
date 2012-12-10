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
	public static boolean change(Connection c, int product_ID, String category, String style, String size, String gender, int num, boolean disabled, boolean in_stock)
	{
		Statement stmt = null;
		//check field for error

		int dis, sto;
		if(disabled){
			dis = 1;
		}else{
			dis = 0;
		}

		if(in_stock){
			sto = 0;
		}else{
			sto = 1;
		}
		String query = 	"UPDATE inventory " +//create sql update statement
						"SET Category_ID = " + ConvertToID.findCatID(c, category) +
						", Style_ID =" + ConvertToID.findStyID(c, style) +
						", Size_ID = " + ConvertToID.findSizID(size) +
						", Gender_ID = " + ConvertToID.findGenID(gender) + 
						", Num_in_inventory = " + num +
						", Disabled = " + dis +
						", In_Stock = " + sto +
						",Last_modified=now() WHERE Product_ID = " + product_ID;

		try {
			//create, execute and close the stmt
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