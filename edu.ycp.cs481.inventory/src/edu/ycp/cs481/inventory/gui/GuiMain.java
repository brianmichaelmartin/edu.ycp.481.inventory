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
import edu.ycp.cs481.inventory.gui.SearchView;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;


public class GuiMain extends JFrame {

	private JPanel contentPane;
	private JPanel InsertView;
	private JPanel SearchView;


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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectOneOf = new JLabel("Select one of the following options:  ");
		lblSelectOneOf.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblSelectOneOf.setBounds(30, 70, 442, 25);
		contentPane.add(lblSelectOneOf);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.next(InsertView);
				//cardLayout.
			
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnInsert.setBounds(54, 201, 153, 49);
		contentPane.add(btnInsert);
	
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.next(SearchView);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSearch.setBounds(383, 201, 153, 49);
		contentPane.add(btnSearch);
		
		JLabel lblInsertAnItem = new JLabel("Insert an Item");
		lblInsertAnItem.setBounds(91, 271, 116, 14);
		contentPane.add(lblInsertAnItem);
		
		JLabel lblSearchForAn = new JLabel("Search for\r\n an Item");
		lblSearchForAn.setBounds(422, 271, 116, 14);
		contentPane.add(lblSearchForAn);
		
	}
	
	
	//protected void ViewChanged() {
		/*sourceType = (SourceType) sourceTypeComboBox.getSelectedItem();
		CardLayout cardLayout = (CardLayout) sourceViewContainerPanel.getLayout();
		cardLayout.show(sourceViewContainerPanel, sourceType.toString());
		if ((SourceType) sourceTypeComboBox.getSelectedItem() == SourceType.BOOK){
			citeController.setSource(book);
	
		*/

	//}
}
