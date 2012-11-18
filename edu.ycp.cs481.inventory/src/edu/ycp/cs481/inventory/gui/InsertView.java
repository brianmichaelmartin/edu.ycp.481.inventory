package edu.ycp.cs481.inventory.gui;

import javax.swing.JPanel;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class InsertView extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
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
		
		JLabel lblPicture = new JLabel("Picture: ");
		lblPicture.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPicture.setBounds(47, 221, 81, 21);
		add(lblPicture);
		
		textField = new JTextField();
		textField.setBounds(138, 86, 198, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 122, 198, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(138, 154, 67, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(140, 188, 67, 20);
		add(textField_3);

	}
}
