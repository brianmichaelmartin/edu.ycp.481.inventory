package edu.ycp.cs481.inventory.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;


import edu.ycp.cs481.inventory.*;
import edu.ycp.cs481.inventory.controller.InsertController;
import edu.ycp.cs481.inventory.gui.InsertView;
import edu.ycp.cs481.inventory.Insert;


public class InsertView extends JPanel {

	/*private Insert model;
	private InsertController controller;
	
	
	public void setModel(Insert model) {
		this.model = model;
		
		model.addObserver(this);
	}
	
	public void setController(InsertController controller) {
		this.controller = controller;
	}
	
	*/
	/**
	 * Create the panel.
	 */
	public InsertView() {
		
		/*public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					Insert model = new Insert();
					
					InsertView view = new InsertView();
					view.setModel(model);
					
					InsertController controller = new InsertController();
					controller.setModel(model);
					
					view.setController(controller);
					
					JFrame frame = new JFrame();
					frame.setContentPane(view);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.pack();
					frame.setVisible(true);
					
				}
			});
		}*/

	}

}
