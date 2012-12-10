package edu.ycp.cs481.inventory.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import edu.ycp.cs481.inventory.ChangeValue;
import edu.ycp.cs481.inventory.Delete;
import edu.ycp.cs481.inventory.GetConnection;
import edu.ycp.cs481.inventory.Insert;

public class UpdateView extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	String genderValue, sizeValue, StyleName, CategoryName;
	Connection c = GetConnection.get(); //get connection established
	JComboBox<String> genderComboBox = new JComboBox<String>();
	JComboBox<Object> sizeComboBox = new JComboBox<Object>();
	/**
	 * Create the panel.
	 */
	public UpdateView() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		lblNewLabel.setBounds(37, 6, 102, 52);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Category:\n");
		lblNewLabel_1.setBounds(37, 83, 64, 16);
		add(lblNewLabel_1);
		
		JLabel lblStyle = new JLabel("Style:");
		lblStyle.setBounds(37, 117, 61, 16);
		add(lblStyle);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(37, 145, 35, 16);
		add(lblSize);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(37, 190, 64, 16);
		add(lblGender);
		
		textField = new JTextField();
		textField.setBounds(113, 77, 134, 28);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 111, 134, 28);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox<String> sizeComboBox = new JComboBox<String>();
		sizeComboBox.setBounds(113, 147, 64, 27);
		add(sizeComboBox);
		
		JComboBox<String> genderComboBox = new JComboBox<String>();
		genderComboBox.setBounds(113, 186, 96, 27);
		add(genderComboBox);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((CategoryName != null) && (StyleName != null)){
					ChangeValue.change(c, CategoryName, StyleName, sizeValue, genderValue);
				}else{
					System.out.println("Style or category empty");
				}
			}
		});
		btnUpdate.setBounds(60, 237, 117, 29);
		add(btnUpdate);

	

	try {
		Statement stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT Size_name FROM Size");
		while (rs.next()){

			sizeComboBox.addItem(rs.getString("Size_name"));
			sizeValue = (String) sizeComboBox.getSelectedItem();

		}
		rs.close();
		stmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	sizeComboBox.setActionCommand("sizeComboBox");
	sizeComboBox.addActionListener((ActionListener) this);
	
	add(genderComboBox);

	try {
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("SELECT Gender_name FROM Gender");
		while   (rs.next()){
			genderComboBox.addItem(rs.getString("Gender_name"));
			genderValue = (String) genderComboBox.getSelectedItem();
		}
		rs.close();
		st.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	genderComboBox.setActionCommand("genderComboBox");
	genderComboBox.addActionListener(this);
	
	JButton btnDeleteEntry = new JButton("Delete Entry");
	btnDeleteEntry.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Delete.deleterow(c, productID, val)
		}
	});
	btnDeleteEntry.setBounds(217, 237, 117, 29);
	add(btnDeleteEntry);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "genderComboBox":
			genderValue = (String)genderComboBox.getSelectedItem();
			System.out.println("gender = "+ genderValue);
			break;
		case "sizeCombo":
			sizeValue = (String)sizeComboBox.getSelectedItem();
			System.out.println("Size = " + sizeValue);
			break;
		default:
			break;
	}
	}
}
