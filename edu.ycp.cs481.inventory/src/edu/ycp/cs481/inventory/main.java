package edu.ycp.cs481.inventory;

import java.io.* ;
import java.sql.*;
import java.util.*;
import edu.ycp.cs481.inventory.*;




public class main {
/*	public static void main(String[] args) throws SQLException{
		Connection c = GetConnection.get();
		//Insert.insert(c, "Polo Bowling Shirts", "Swing kids Retro Shirt", "L", "M", 7);
		ResultSet rs = Search.searchFor(c, "Size", "L");
		System.out.println("");
		while (rs.next()){
			String Category_name = rs.getString("Category_name");
			String Style_name = rs.getString("Style_name");
			String Gender_name = rs.getString("Gender_name");
			String Size_name = rs.getString("Size_name");
			System.out.println("Category_name =\t" + Category_name +"\nStyle_name =\t" + Style_name + "\nGender_name =\t" + Gender_name + "\nSize_name =\t"+Size_name);
		}
		//Delete.deleterow(c, "Product_ID", "4");
		//ChangeValue.change(c, "Num_in_inventory", "5", "Product_ID", "4");
		
	}
}*/

	public static void main(String[] args){
		Connection c = GetConnection.get();
		int choice = -1;
		String result;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		//while(choice < 0){
		System.out.print("Please enter 1 to search, or 2 to add a new item, 3 to update, or 4 to delete: ");
		try {
			choice = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: Please enter 1 or 2");
			e.printStackTrace();
		}
		//}
		if (choice == 1){
			System.out.println("Would you like to search by: \n1.Category\n2.Size\n3.Gender\n4.Style?");
			try {
				int searchChoice = Integer.parseInt(br.readLine());
				if (searchChoice == 1){
					System.out.print("Please enter the category you'd like to search for: ");
					String cat = br.readLine();
					result = Search.searchFor(c, "Category_ID", cat);
					System.out.println(result);
				}else if (searchChoice == 2){
					System.out.print("Please enter the size you'd like to search for: ");
					String siz = br.readLine();
					result = Search.searchFor(c, "Size", siz);
					System.out.println(result);
					
				}else if (searchChoice == 3){
					System.out.print("Please enter the Gender you'd like to search for: ");
					String gen = br.readLine();
					result = Search.searchFor(c, "Gender", gen);
					System.out.println(result);
					
				}else if (searchChoice == 4){
					System.out.print("Please enter the Style you'd like to search for: ");
					String sty = br.readLine();
					result = Search.searchFor(c, "Style_ID", sty);
					System.out.println(result);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (choice == 2){
			try{
				System.out.println("Please enter the information for the new item.");
				System.out.println("Category: ");
				String cat = br.readLine();
				System.out.println("\nStyle: ");
				String sty = br.readLine();
				System.out.print("\nSize: ");
				String siz = br.readLine();
				System.out.println("\nGender: ");
				String gen = br.readLine();
				System.out.println("\nNumber of items: ");
				int num = Integer.parseInt(br.readLine());
				Insert.insert(c, cat, sty, siz, gen, num);
			} catch (IOException e){
				e.printStackTrace();
			}
		}else if (choice == 3){
			System.out.println("Please enter the information to be updated.");
			try{
			System.out.println("Field to change: ");
			String field = br.readLine();
			System.out.println("\nNew val: ");
			String val = br.readLine();
			System.out.print("\nWhere: ");
			String where = br.readLine();
			System.out.println("\nIs: ");
			String thing = br.readLine();
			ChangeValue.change(c, field, val, where, thing);
			}catch (IOException e){
				e.printStackTrace();
			}
		}else if (choice ==4){
			
			try{
			System.out.println("Product_ID to delete: ");
			String ID = br.readLine();
			
			Delete.deleterow(c, "Product_ID", ID);
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}
