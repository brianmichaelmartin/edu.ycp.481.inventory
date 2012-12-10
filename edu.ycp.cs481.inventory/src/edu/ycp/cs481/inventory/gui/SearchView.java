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
import edu.ycp.cs481.inventory.Search;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class SearchView extends JPanel implements ActionListener {

	String genderValue, sizeValue, categoryValue, styleValue, disabledValue, stockValue;
	boolean disabled, stock;
	Connection c = GetConnection.get(); //get connection established
	
	JComboBox CategoryComboBox = new JComboBox();
	JComboBox StyleComboBox = new JComboBox();
	JComboBox SizeComboBox = new JComboBox();
	JComboBox GenderComboBox = new JComboBox();
	JComboBox InStockComboBox = new JComboBox();
	JComboBox DisabledComboBox = new JComboBox();
	private JTable table;
	/**
	 * Create the panel.
	 */
	
	public void actionPerformed(ActionEvent e){
		switch (e.getActionCommand()){
			case "CategoryComboBox":
				categoryValue = (String)CategoryComboBox.getSelectedItem();
				System.out.println("category = " + categoryValue);
				break;
			case "StyleComboBox":
				styleValue = (String)StyleComboBox.getSelectedItem();
				System.out.println("style = " + styleValue);
				break;
			case "SizeComboBox":
				sizeValue = (String)SizeComboBox.getSelectedItem();
				System.out.println("Size = " + sizeValue);
				break;
			case "GenderComboBox":
				genderValue = (String)GenderComboBox.getSelectedItem();
				System.out.println("gender = " + genderValue);
				break;
			case "InStockComboBox":
				if("Yes".equals((String)DisabledComboBox.getSelectedItem())){
					disabled = true;
				}
				else{
					disabled = false;
				}
				break;
			case "DisabledComboBox":
				if("Yes".equals((String)InStockComboBox.getSelectedItem())){
					stock = true;
				}
				else{
					stock = false;
				}
				break;
			default:
				break;
		}
			
	}
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
		lblCategory.setBounds(30, 79, 105, 29);
		add(lblCategory);
		
		JLabel lblStyle = new JLabel("Style: ");
		lblStyle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStyle.setBounds(30, 110, 105, 29);
		add(lblStyle);
		
		JLabel lblSize = new JLabel("Size: ");
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSize.setBounds(30, 139, 105, 29);
		add(lblSize);
		
		JLabel lblGender = new JLabel("Gender: ");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(30, 171, 105, 29);
		add(lblGender);
	
		JLabel lblInStockOnly = new JLabel("In Stock Only:");
		lblInStockOnly.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInStockOnly.setBounds(27, 245, 129, 29);
		add(lblInStockOnly);

		JLabel lblDisabled = new JLabel("Disabled:");
		lblDisabled.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDisabled.setBounds(30, 211, 77, 29);
		add(lblDisabled);
		
		//Category combobox
		
		CategoryComboBox.setBounds(164, 85, 129, 20);
		add(CategoryComboBox);

		CategoryComboBox.addItem("any");
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
		CategoryComboBox.setActionCommand("CategoryComboBox");
		CategoryComboBox.addActionListener(this);
		
		//Style Combobox
		
		StyleComboBox.setBounds(164, 116, 129, 20);
		add(StyleComboBox);
		StyleComboBox.addItem("any");
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
		StyleComboBox.setActionCommand("StyleComboBox");
		StyleComboBox.addActionListener(this);
		
		
		//Size combo box
		
		SizeComboBox.setBounds(164, 145, 129, 20);
		add(SizeComboBox);
		
		SizeComboBox.addItem("any");
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
		SizeComboBox.setActionCommand("SizeComboBox");
		SizeComboBox.addActionListener(this);
		
		
		//Gender ComboBox
		
		GenderComboBox.setBounds(164, 177, 129, 20);
		add(GenderComboBox);
		
		GenderComboBox.addItem("any");
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
		GenderComboBox.setActionCommand("GenderComboBox");
		GenderComboBox.addActionListener(this);

		//Disabled ComboBox
		DisabledComboBox.setBounds(164, 210, 129, 20);
		add(DisabledComboBox);
		DisabledComboBox.addItem("Yes");
		DisabledComboBox.addItem("No");
		if("Yes".equals((String)DisabledComboBox.getSelectedItem())){
			disabled = true;
		}
		else{
			disabled = false;
		}
		DisabledComboBox.setActionCommand("DisabledComboBox");
		DisabledComboBox.addActionListener(this);
		
				
		//InStock ComboBox
		InStockComboBox.setBounds(164, 241, 129, 20);
		add(InStockComboBox);
		InStockComboBox.addItem("No");
		InStockComboBox.addItem("Yes");
		if("Yes".equals((String)InStockComboBox.getSelectedItem())){
			stock = true;
		}
		else{
			stock = false;
		}
		InStockComboBox.setActionCommand("InStockComboBox");
		InStockComboBox.addActionListener(this);
		
		
		
		JButton btnClickToSearch = new JButton("Search\n");
		btnClickToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search.searchFor(c,categoryValue, styleValue, sizeValue, genderValue, disabled, stock);
			
			}
		});
		btnClickToSearch.setBounds(66, 286, 135, 23);
		add(btnClickToSearch);
		
		table = new JTable();
		table.setBounds(326, 268, 345, -188);
		add(table);
		
	}
	class MyTableModel extends AbstractTableModel{
		private String[] columnNames = {"Product ID",
										"Style",
										"Category",
										"Gender",
										"Size",
										"Number in Inventory",
										"Disabled",
										"In Stock",
										"Date Added",
										"Last Modified"};
		private Object[][] data;
		@Override
		public int getColumnCount() {
			return columnNames.length;
		}

		@Override
		public int getRowCount() {
			return columnNames.length;
		}

		@Override
		public Object getValueAt(int row, int col){
			return data[row][col];
		}
	}
	
}
