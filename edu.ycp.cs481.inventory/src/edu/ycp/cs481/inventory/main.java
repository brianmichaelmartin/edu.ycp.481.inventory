package edu.ycp.cs481.inventory;

import java.io.* ;
import java.sql.*;
import java.util.*;
import edu.ycp.cs481.inventory.*;




public class main {

/*
	public static void newEntry(String category, String style, String size, String gender, int numInInventory){

		try {
			if (task.insert(category, style, size, gender, numInInventory)){
				System.out.println("Insertion Successful!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Insertian Failed!");
		}
	}
	
	public static void searchByCategory(String category){
		try {
			ResultSet rs = task.search("Category", category);
			String cat = rs.getString("Category");
			String Style = rs.getString("Style");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void searchBySize(String size){
		
	}
	public static void searchByGender(String gender){
		
	}
	public static void searchByStyle(String style){
		
	}

	public static void main(String[] args) throws SQLException{

		int choice = -1;
		DBtask db = new DBtask();//create new database access object
		db.getConnection();//establish a connection
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		//while(choice < 0){
		System.out.print("Please enter 1 to search, or 2 to add a new item: ");
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
					Search.searchByCategory(cat);
				}else if (searchChoice == 2){
					System.out.print("Please enter the size you'd like to search for: ");
					String siz = br.readLine();
					Search.searchBySize(siz);
				}else if (searchChoice == 3){
					System.out.print("Please enter the Gender you'd like to search for: ");
					String gen = br.readLine();
					Search.searchByGender(gen);
				}else if (searchChoice == 4){
					System.out.print("Please enter the Style you'd like to search for: ");
					String sty = br.readLine();
					Search.searchByStyle(sty);
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
				Insert.newEntry(cat, sty, siz, gen, num);
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}*/
}
