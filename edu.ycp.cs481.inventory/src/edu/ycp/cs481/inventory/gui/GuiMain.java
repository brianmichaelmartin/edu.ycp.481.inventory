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
	private JPanel InsertView = new InsertView();
	private JPanel SearchView = new SearchView();
	private CardLayout cardLayout;
	private JPanel operationViewPanel;


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
		
		JButton btnInsert = new JButton("Switch Views");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 cardLayout = (CardLayout) operationViewPanel.getLayout();
				cardLayout.next(operationViewPanel);
				
			
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnInsert.setBounds(26, 360, 153, 49);
		contentPane.add(btnInsert);
		
		operationViewPanel = new JPanel();
		operationViewPanel.setBounds(27, 6, 631, 342);
		contentPane.add(operationViewPanel);
		operationViewPanel.setLayout(new CardLayout(0, 0));
		operationViewPanel.add(InsertView);
		operationViewPanel.add(SearchView);
	}
}
