package edu.ycp.cs481.inventory;

import java.sql.Date;

public class DatabaseEntry {
	private int Product_ID, Num_in_inventory, Disabled, In_stock, Barcode;
	private String Category_name, Style_name, Gender_name, Size_name, Picture;
	private Date Date_added, Last_modified;
	
	/*
	 * This object is designed to represent a row in the database
	 */
	
	
	public DatabaseEntry(int pro, String cat, String sty, String gen, String siz, int num, int dis, int in, int bar, Date dat, Date las,  String pic){
		//constructor
		Product_ID = pro;
		Category_name = cat;
		Style_name = sty;
		Gender_name = gen;
		Size_name = siz;
		Num_in_inventory = num;
		Date_added = dat;
		Last_modified = las;
		Disabled = dis;
		In_stock = in;
		Barcode = bar;
		Picture = pic;
	}
	public DatabaseEntry(){
		//alt constructor
	}
	
	/*
	 * set_val functions for use with alt constructor, otherwise not really needed
	 */
	public void set_val(String val, String Field){
		switch (Field){
			
			case "Category_name":
				Category_name = val;
				break;
			case "Style_name":
				Style_name = val;
				break;
			case "Gender_name":
				Gender_name = val;
				break;
			case "Size_name":
				Size_name = val;
				break;
			case "Picture":
				Picture = val;
				break;
			default:
				System.out.println("Invalid field" + Field);
				
				break;
		}
	}
	
	public void set_val(int val, String Field){
		switch (Field){
			case "Product_ID":
				Product_ID = val;
				break;
			case "Num_in_inventory":
				Num_in_inventory = val;
				break;
			case "Disabled":
				Disabled = val;
				break;
			case "In_Stock":
				In_stock = val;
				break;
			case "Barcode":
				Barcode = val;
				break;
			default:
				System.out.println("Invalid field" + Field);
				
				break;
		}
	}
	
	public void set_val(Date val, String Field){
		switch (Field){
		case "Date_added":
			Date_added = val;
			break;
		case "Last_modified":
			Last_modified = val;
			break;
		default:
			System.out.println("Invalid field" + Field);
			
			break;
		}
	}
	
	/*
	 * Bellow are getter methods for the various fields
	 */
	public int get_Product_ID(){
		return Product_ID;
	}
	public String get_Category(){
		return Category_name;
	}
	public String get_Style(){
		return Style_name;
	}
	public String get_Gender(){
		return Gender_name;
	}
	public String get_Size(){
		return Size_name;
	}
	public int get_Num_in_inventory(){
		return Num_in_inventory;
	}
	public Date get_Date_added(){
		return Date_added;
	}
	public Date get_last_Modified(){
		return Last_modified;
	}
	public Boolean get_disabled(){
		Boolean temp;//converting int to boolean
		if(Disabled == 1){
			temp = true;
		}else{
			temp = false;
		}
		return temp;
	}
	public Boolean get_in_stock(){
		Boolean temp;//converting int to boolean
		if(In_stock == 1){
			temp = true;
		}else{
			temp = false;
		}
		return temp;
	}
	public int get_barcode(){
		return Barcode;
	}
	public String get_picture(){
		return Picture;
	}
	public Boolean isEqual(DatabaseEntry other){
		System.out.println("Comparing databaseENtry objects");
		Boolean dis;//converting int to boolean
		if(Disabled == 1){
			dis = true;
		}else{
			dis = false;
		}
		Boolean sto;//converting int to boolean
		if(In_stock == 1){
			sto = true;
		}else{
			sto = false;
		}
		if(other.get_Product_ID() != Product_ID){
			System.out.println("Product_ID !=");
			return false;
		} if(other.get_Category() != Category_name){
			System.out.println("Category !=");
			return false;
		} if(other.get_Style()	!= Style_name){
			System.out.println("Style !=");
			return false;
		} if(other.get_Gender() != Gender_name){
			System.out.println("Gender !=");
			return false;
		} if(other.get_Size() != Size_name){
			System.out.println("Size !=");
			return false;
		} if(other.get_Num_in_inventory() != Num_in_inventory){
			System.out.println("Size !=");
			return false;
		} if(other.get_disabled() != dis){
			System.out.println("Disabled !=");
			return false;
		} if(other.get_in_stock() != sto){
			System.out.println("In stock !=");
			return false;
		}
		System.out.println("all fields =");
		
		return true; 
	}
}
