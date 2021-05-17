package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import net.proteanit.sql.DbUtils;

public class Club_list extends JPanel {

	private JFrame frame;
     private JTable table;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Club_list window = new Club_list();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Club_list() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBackground(new Color(255, 222, 173));
	    setBounds(100, 100, 450, 328);
		//setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		panel.setBounds(0, 0, 434, 438);
		add(panel);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(700,850));
		
		JLabel lblNewLabel = new JLabel("All Club Detail");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(30, 11, 283, 44);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 51, 710, 450);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBounds(9, 48, 414, 600);
		scrollPane.setViewportView(table);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
				Statement stmt=con.createStatement();
				ResultSet rst=stmt.executeQuery("select * from clubs");
				table.setModel(DbUtils.resultSetToTableModel(rst));
				}
				catch(Exception err)
				{
					System.out.println(err);
				}
	}

}
