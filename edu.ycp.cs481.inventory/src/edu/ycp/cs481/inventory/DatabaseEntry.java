package edu.ycp.cs481.inventory;

public class DatabaseEntry {
	String Product_ID, Category_name, Style_name, Gender_name, Size_name, Num_in_inventory, Date_added, Last_modified;
	boolean Disabled, In_stock;
	
	public DatabaseEntry(){
		
		
		
		
		
	}
	public DatabaseEntry(String pro, String cat, String sty, String gen, String siz, String num, String dat, String las, boolean dis, boolean in){
		Product_ID = pro;
		Category_name = cat;
		Style_name = sty;
		Gender_name = gen;
		Size_name = siz;
		Num_in_inventory = num;
		Date_added = dat;
		Last_modified = las;
	}
	public void set_val(String val, String Field){
		
	}
	public void set_val(Boolean val, String Field){
		
	}
	
	
}
