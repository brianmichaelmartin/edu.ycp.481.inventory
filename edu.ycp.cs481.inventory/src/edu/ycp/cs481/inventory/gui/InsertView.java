package edu.ycp.cs481.inventory.gui;

import javax.swing.JPanel;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import java.awt.CardLayout;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JTextField;
import javax.swing.JComboBox;

import edu.ycp.cs481.inventory.GetConnection;
import edu.ycp.cs481.inventory.Insert;

import javax.swing.JButton;


public class InsertView extends JPanel implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	String genderValue, sizeValue, StyleName, CategoryName;
	int num;
	Connection c = GetConnection.get(); //get connection established
	JComboBox genderCombo = new JComboBox();
	JComboBox sizeCombo = new JComboBox();
	private JTextField textField_num;

	public void actionPerformed(ActionEvent e){
		switch (e.getActionCommand()){
			case "genderCombo":
				genderValue = (String)genderCombo.getSelectedItem();
				break;
			case "sizeCombo":
				sizeValue = (String)sizeCombo.getSelectedItem();
				break;
			default:
				break;
		}
			
	}
	/**
	 * Create the panel.
	 */
	@SuppressWarnings("unchecked")
	public InsertView() {
		setLayout(null);


		JLabel lblInsertAnItem = new JLabel("Insert an Item:");
		lblInsertAnItem.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblInsertAnItem.setBounds(47, 18, 161, 56);
		add(lblInsertAnItem);

		JLabel lblCategory = new JLabel("Category:");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCategory.setBounds(47, 86, 81, 21);
		add(lblCategory);

		JLabel lblGender = new JLabel("Gender: ");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGender.setBounds(47, 188, 81, 21);
		add(lblGender);

		JLabel lblStyle = new JLabel("Style: ");
		lblStyle.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStyle.setBounds(47, 122, 81, 21);
		add(lblStyle);

		JLabel lblSize = new JLabel("Size:");
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSize.setBounds(47, 155, 81, 21);
		add(lblSize);
		

		JLabel lblNumInInventory = new JLabel("Number In Inventory:");
		lblNumInInventory.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumInInventory.setBounds(47, 220, 161, 34);
		add(lblNumInInventory);

		//GENERATE SIZE FROM SQL IN COMBOBOX
		sizeCombo.setBounds(148, 156, 60, 20);
		add(sizeCombo);



		try {
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT Size_name FROM Size");
			while (rs.next()){

				sizeCombo.addItem(rs.getString("Size_name"));
				sizeValue = (String) sizeCombo.getSelectedItem();

			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sizeCombo.setActionCommand("sizeCombo");
		sizeCombo.addActionListener(this);



		//GENDER COMBO, AUTOMATICALLY GENERATES gender ( VIA SQL)

		genderCombo.setBounds(148, 189, 88, 20);
		add(genderCombo);

		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT Gender_name FROM Gender");
			while   (rs.next()){
				genderCombo.addItem(rs.getString("Gender_name"));
				genderValue = (String) genderCombo.getSelectedItem();
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		genderCombo.setActionCommand("genderCombo");
		genderCombo.addActionListener(this);
		
		//CATEGORY TEXT FIELD
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter(){
			@Override
			public void focusLost(FocusEvent e){
				handleCategoryChange();
			}
		});
		textField.setBounds(138, 86, 198, 20);
		add(textField);
		textField.setColumns(10);


		//STYLE TEXT FIELD
		textField_1 = new JTextField();
		textField_1.addFocusListener(new FocusAdapter(){
			@Override
			public void focusLost(FocusEvent e){
				handleStyleChange();
			}
		});

		textField_1.setBounds(138, 122, 198, 20);
		add(textField_1);
		textField_1.setColumns(10);

		
		//BUTTON TO INSERT!!!!!!!!!!!!
		JButton btnClickToInsert = new JButton("Click to Insert!");
		btnClickToInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((CategoryName != null) && (StyleName != null)){
					Insert.insert(c, CategoryName, StyleName, sizeValue, genderValue,  num, "");
				}else{
					System.out.println("Style or category empty");
				}
				
			
			}
		});
		btnClickToInsert.setBounds(47, 265, 120, 23);
		add(btnClickToInsert);
		
		
		textField_num = new JTextField();
		textField_num.addFocusListener(new FocusAdapter(){
			@Override
			public void focusLost(FocusEvent e){
				handleNumChange();
			}
		});
		textField_num.setBounds(207, 228, 129, 20);
		add(textField_num);
		textField_num.setColumns(10);

	}

	//HANDLE CATEGORY INPUT -- convert to String
	protected void handleCategoryChange() {
		CategoryName = textField.getText(); //store value in String CatgoryName 


	}

	//HANDLE STYLE INPUT -- converts to String
	protected void handleStyleChange(){
		StyleName = textField_1.getText(); //stores input in String StyleName

	}
	protected void handleNumChange(){
		num = Integer.parseInt(textField_num.getText()); //

	}
}
