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

import edu.ycp.cs481.inventory.GetConnection;

public class UpdateView extends JPanel implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;

	String genderValue, sizeValue, StyleName, CategoryName;
	Connection c = GetConnection.get(); //get connection established
	JComboBox genderComboBox = new JComboBox();
	JComboBox sizeComboBox = new JComboBox();
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
		lblSize.setBounds(37, 158, 35, 16);
		add(lblSize);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(37, 202, 64, 16);
		add(lblGender);
		
		textField = new JTextField();
		textField.setBounds(113, 77, 134, 28);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 111, 134, 28);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox sizeComboBox = new JComboBox();
		sizeComboBox.setBounds(113, 154, 52, 27);
		add(sizeComboBox);
		
		JComboBox GenderComboBox = new JComboBox();
		GenderComboBox.setBounds(113, 198, 52, 27);
		add(GenderComboBox);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(254, 197, 117, 29);
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
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
