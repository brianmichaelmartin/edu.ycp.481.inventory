package edu.ycp.cs481.inventory.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import edu.ycp.cs481.inventory.Insert;
import edu.ycp.cs481.inventory.controller.InsertController;
import edu.ycp.cs481.inventory.gui.InsertView;

public class GuiMain extends JFrame {

	private JPanel contentPane;
	private JPanel InsertView;
	private Insert Insert;
	private JComboBox ViewComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain frame = new GuiMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/*ViewComboBox = new JComboBox();
		ViewComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewChanged();
			}}*/
	}
	
	public void createViews() {
		this.Insert = new Insert();
		this.InsertView = new InsertView();
		//InsertView.setModel(Insert);
		//InsertController InsertController = new InsertController();
		//InsertView.setController(InsertController);
		//InsertController.setModel(Insert);
		//ViewContainerPanel.add(InsertView, SourceType.JOURNAL.toString());

}
	
	protected void ViewChanged() {
		/*sourceType = (SourceType) sourceTypeComboBox.getSelectedItem();
		CardLayout cardLayout = (CardLayout) sourceViewContainerPanel.getLayout();
		cardLayout.show(sourceViewContainerPanel, sourceType.toString());
		if ((SourceType) sourceTypeComboBox.getSelectedItem() == SourceType.BOOK){
			citeController.setSource(book);
	
		*/

	}
}
