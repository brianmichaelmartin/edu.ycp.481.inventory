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
import edu.ycp.cs481.inventory.gui.InsertView;
import edu.ycp.cs481.inventory.gui.SearchView;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;


public class GuiMain extends JFrame{

	private JPanel contentPane;
	private JPanel InsertView = new InsertView();
	private JPanel UpdateView = new UpdateView();
	private JPanel SearchView = new SearchView();
	private CardLayout cardLayout;
	private JPanel operationViewPanel;
	private final JButton btnInsert_1 = new JButton("Insert");
	private final JButton btnUpdate = new JButton("Update");


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
		setBounds(300, 300, 829, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JButton btnInsert = new JButton("Search");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout = (CardLayout) operationViewPanel.getLayout();
				if (cardLayout.equals(InsertView)){
					cardLayout.next(operationViewPanel);
				}else{
					cardLayout.first(operationViewPanel);
					cardLayout.next(operationViewPanel);
				}
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout = (CardLayout) operationViewPanel.getLayout();
				cardLayout.last(operationViewPanel);
			}
		});
		
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(464, 360, 138, 49);
		
		/*cardLayout = (CardLayout) operationViewPanel.getLayout();
		if (cardLayout.equals(SearchView)){
			btnUpdate.setVisible(true);
		}else
			btnUpdate.setVisible(false);*/
		contentPane.add(btnUpdate);
		btnInsert_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout = (CardLayout) operationViewPanel.getLayout();
				cardLayout.first(operationViewPanel);
			}
		});
		btnInsert_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnInsert_1.setBounds(244, 360, 153, 49);
		
		contentPane.add(btnInsert_1);
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnInsert.setBounds(26, 360, 153, 49);
		contentPane.add(btnInsert);
		
		operationViewPanel = new JPanel();
		operationViewPanel.setBounds(27, 6, 779, 342);
		contentPane.add(operationViewPanel);
		operationViewPanel.setLayout(new CardLayout(0, 0));
		operationViewPanel.add(InsertView);
		operationViewPanel.add(SearchView);
		operationViewPanel.add(UpdateView);
	}


}
