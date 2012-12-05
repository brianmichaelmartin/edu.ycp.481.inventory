package edu.ycp.cs481.inventory.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;

import edu.ycp.cs481.inventory.GetConnection;
import edu.ycp.cs481.inventory.Insert;
import edu.ycp.cs481.inventory.Search_old;
import edu.ycp.cs481.inventory.controller.InsertController;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JButton;

public class SearchView extends JPanel {

	String genderValue, sizeValue, categoryValue, styleValue;
	Connection c = GetConnection.get(); //get connection established

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("unchecked")
	public SearchView() {
		setLayout(null);
		//Statement stmt = null;
		//ResultSet rs = null;
		

		
		
		JLabel lblFindAnItem = new JLabel("Search for an Item:");
		lblFindAnItem.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblFindAnItem.setBounds(20, 29, 244, 29);
		add(lblFindAnItem);
		
		JLabel lblCategory = new JLabel("Category: ");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCategory.setBounds(33, 113, 105, 29);
		add(lblCategory);
		
		JLabel lblStyle = new JLabel("Style: ");
		lblStyle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStyle.setBounds(33, 157, 105, 29);
		add(lblStyle);
		
		JLabel lblSize = new JLabel("Size: ");
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSize.setBounds(33, 197, 105, 29);
		add(lblSize);
		
		JLabel lblGender = new JLabel("Gender: ");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(33, 237, 105, 29);
		add(lblGender);
	

			
		
		
		JComboBox CategoryComboBox = new JComboBox();
		CategoryComboBox.setBounds(164, 119, 129, 20);
		add(CategoryComboBox);


		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT Category_name FROM Category");
			while   (rs.next()){
				CategoryComboBox.addItem(rs.getString("Category_name"));
				categoryValue = (String) CategoryComboBox.getSelectedItem();

			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		JComboBox StyleComboBox = new JComboBox();
		StyleComboBox.setBounds(164, 163, 129, 20);
		add(StyleComboBox);
		
		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT Style_name FROM Style");
			while   (rs.next()){
				StyleComboBox.addItem(rs.getString("Style_name"));
				styleValue = (String) StyleComboBox.getSelectedItem();

			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		JComboBox SizeComboBox = new JComboBox();
		SizeComboBox.setBounds(164, 203, 129, 20);
		add(SizeComboBox);
		
		
		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT Size_name FROM Size");
			while   (rs.next()){
				SizeComboBox.addItem(rs.getString("Size_name"));
				sizeValue = (String) SizeComboBox.getSelectedItem();
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JComboBox GenderComboBox = new JComboBox();
		GenderComboBox.setBounds(164, 243, 129, 20);
		add(GenderComboBox);
		
		
		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT Gender_Name FROM gender");
			while   (rs.next()){
				GenderComboBox.addItem(rs.getString("Gender_name"));
				genderValue = (String) GenderComboBox.getSelectedItem();
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JLabel lblNumberOfItem = new JLabel("Number of item: ");
		lblNumberOfItem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumberOfItem.setBounds(33, 277, 143, 29);
		add(lblNumberOfItem);
		
		JComboBox NumInvenComboBox = new JComboBox();
		NumInvenComboBox.setBounds(164, 283, 129, 20);
		add(NumInvenComboBox);
		
		JList list = new JList();
		list.setBounds(328, 59, 169, 241);
		add(list);
		
		JButton btnClickToSearch = new JButton("Click to Search!");
		btnClickToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Search.searchFor(c,);
			
			}
		});
		btnClickToSearch.setBounds(118, 335, 120, 23);
		add(btnClickToSearch);

	}
}
