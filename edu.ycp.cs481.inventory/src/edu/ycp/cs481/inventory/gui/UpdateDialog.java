package edu.ycp.cs481.inventory.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import edu.ycp.cs481.inventory.gui.UpdateView;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JPanel upView;
	/**
	 * Launch the application.
	 */
	public static void main(ArrayList<Object> results) {
		try {
			UpdateDialog dialog = new UpdateDialog(results);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UpdateDialog(ArrayList<Object> results) {
		upView = new UpdateView(results, this);
		upView.setBounds(193, 5, 100, 96);
		
		setBounds(100, 100, 300, 320);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(6, 6, 486, 327);
			contentPanel.add(panel);
			//panel.setLayout(null);
			panel.setLayout(new CardLayout(0, 0));
			panel.add(upView);
		}
	}

}
