package edu.ycp.cs481.inventory.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;

import edu.ycp.cs481.inventory.controller.InsertController;

public class SearchView extends JPanel {

	/**
	 * Create the panel.
	 */
	public SearchView() {
		setLayout(null);
		
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
		
		
		/*rs.stmt.executeQuery("SELECT ....");
		while(rs.next()){
			JComboBox.addItem(new InsertController(rs.getInt(1), rs.getString(2), trim()));
		}
		rs.close();
		*/
		
		JComboBox CategoryComboBox = new JComboBox();
		CategoryComboBox.setBounds(164, 119, 129, 20);
		add(CategoryComboBox);
		
		JComboBox StyleComboBox = new JComboBox();
		StyleComboBox.setBounds(164, 163, 129, 20);
		add(StyleComboBox);
		
		JComboBox SizeComboBox = new JComboBox();
		SizeComboBox.setBounds(164, 203, 129, 20);
		add(SizeComboBox);
		
		JComboBox GenderComboBox = new JComboBox();
		GenderComboBox.setBounds(164, 243, 129, 20);
		add(GenderComboBox);
		
		JLabel lblNumberOfItem = new JLabel("Number of item: ");
		lblNumberOfItem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumberOfItem.setBounds(33, 277, 143, 29);
		add(lblNumberOfItem);
		
		JComboBox NumInvenComboBox = new JComboBox();
		NumInvenComboBox.setBounds(164, 283, 129, 20);
		add(NumInvenComboBox);

	}
}
