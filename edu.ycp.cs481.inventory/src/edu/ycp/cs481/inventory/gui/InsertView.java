package edu.ycp.cs481.inventory.gui;

import javax.swing.JPanel;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import edu.ycp.cs481.inventory.GetConnection;
import edu.ycp.cs481.inventory.genderType;
import edu.ycp.cs481.inventory.sizeType;
import edu.ycp.cs481.inventory.controller.InsertController;


public class InsertView extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox<sizeType> sizeTypeComboBox;
	private JComboBox<genderType> genderTypeComboBox;



	/**
	 * Create the panel.
	 */
	public InsertView() {
		setLayout(null);

		GetConnection.get(); //get connection established

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





		//SIZE COMBO, AUTOMATICALLY GENERATES SIZES (NOT VIA SQL)
		JComboBox<sizeType> comboBox = new JComboBox<sizeType>();
		comboBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sizeTypeChange();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel<sizeType>(sizeType.values()));
		comboBox.setBounds(148, 156, 60, 20);
		add(comboBox);

		//GENDER COMBO, AUTOMATICALLY GENERATES SIZES (NOT VIA SQL)
		JComboBox<genderType> comboBox_1 = new JComboBox<genderType>();
		comboBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				genderTypeChange();
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel<genderType>(genderType.values()));
		comboBox_1.setBounds(148, 189, 60, 20);
		add(comboBox_1);


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

	}

	//HANDLE CATEGORY INPUT -- convert to String
	protected void handleCategoryChange() {
		String CategoryName = textField.getText(); //store value in String CatgoryName 
		System.out.println("catrgory name string ===  " + CategoryName);

	}

	//HANDLE STYLE INPUT -- converts to String
	protected void handleStyleChange(){
		String StyleName = textField_1.getText(); //stores input in String StyleName
		System.out.println("style name ==== " + StyleName);
	}

	// SIZE TYPE SELECTED
	protected void sizeTypeChange(){
		String SelectedSizeType;
		if((sizeType) sizeTypeComboBox.getSelectedItem() == sizeType.S){
			SelectedSizeType = "S";
		}
		else if((sizeType) sizeTypeComboBox.getSelectedItem() == sizeType.M){
			SelectedSizeType = "M";
		}
		else if((sizeType) sizeTypeComboBox.getSelectedItem() == sizeType.L){
			SelectedSizeType = "L";
		}
		else if((sizeType) sizeTypeComboBox.getSelectedItem() == sizeType.XL){
			SelectedSizeType = "XL";
		}
		else if((sizeType) sizeTypeComboBox.getSelectedItem() == sizeType.XXL){
			SelectedSizeType = "2XL";
		}
		else if((sizeType) sizeTypeComboBox.getSelectedItem() == sizeType.XXXL){
			SelectedSizeType = "3XL";
		}
		else {
			SelectedSizeType = "4XL";
		}
		System.out.println("Size  string ===  " + SelectedSizeType);



	}
	
	// GENDER TYPE SELECTED
	protected void genderTypeChange(){
		String SelectedGenderType;
		if((genderType) genderTypeComboBox.getSelectedItem() == genderType.F){
			SelectedGenderType = "S";
		}
		else if((genderType) genderTypeComboBox.getSelectedItem() == genderType.M){
			SelectedGenderType = "M";
		}
		else {
			SelectedGenderType = "L";
		}
		System.out.println("Gender  string ===  " + SelectedGenderType);

		
	}



}
