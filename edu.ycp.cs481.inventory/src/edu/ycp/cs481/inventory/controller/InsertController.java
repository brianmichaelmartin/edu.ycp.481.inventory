package edu.ycp.cs481.inventory.controller;


import edu.ycp.cs481.inventory.Insert;


public class InsertController {
	
	private Insert model;
	

		public void setModel(Insert model) {
			this.model = model;
		}
	
	private int value;
	private String label;
	
	public InsertController(int id, String label){
		this.value = id;
		this.label = label;
	}
	
	public int getValue(){
		return value;
	}
	
	public String toString(){
		return label;
	}
	
	
	

	
	
	
	/*

		public void setCategory(String text){
			model.setcategory(text);
		
		}
		public void setStyle(String text){
			model.setstyle(text);
		}
		public void setGender(String text){
			model.setgender(text);

		}
		public void setSize(String text){
			model.setsize(text);
		}
*/
		
		
		
	
	

}
