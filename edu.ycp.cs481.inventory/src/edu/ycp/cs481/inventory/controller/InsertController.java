package edu.ycp.cs481.inventory.controller;


import edu.ycp.cs481.inventory.Insert;


public class InsertController {
	
	private Insert model;

		public void setModel(Insert model) {
			this.model = model;
		}


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

	
	

}
