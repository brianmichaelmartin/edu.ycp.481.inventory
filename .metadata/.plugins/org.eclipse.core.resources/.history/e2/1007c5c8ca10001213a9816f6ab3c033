package edu.ycp.cs481.inventory;

import java.io.* ;
import java.sql.*;
import java.util.*;



public class main {

	int numInInventory;
	String category, style, gender, size;
	

	

	public static void newEntry(String category, String style, String size, String gender, int numInInventory){
	
	}
	public static void searchByCategory(String category){
	
	}

	public static void searchBySize(String size){
	
	}
	public static void searchByGender(String gender){
	
	}
	public static void searchByStyle(String style){
		
	}

	public static void main(String[] args){
		int choice = -1;
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
					searchByCategory(cat);
				}else if (searchChoice == 2){
					System.out.print("Please enter the size you'd like to search for: ");
					String siz = br.readLine();
					searchBySize(siz);
				}else if (searchChoice == 3){
					System.out.print("Please enter the Gender you'd like to search for: ");
					String gen = br.readLine();
					searchByGender(gen);
				}else if (searchChoice == 4){
					System.out.print("Please enter the Style you'd like to search for: ");
					String gen = br.readLine();
					searchByStyle(gen);
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
				String gend = br.readLine();
				
				System.out.println("\nNumber of items: ");
				int num = Integer.parseInt(br.readLine());
				
				newEntry(cat, sty, siz, gend, num);
				
				
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}

