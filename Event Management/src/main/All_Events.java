package main;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
import java.awt.BorderLayout;
public class All_Events {

	private JFrame frame;
private JTable table;
int colcount;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All_Events window = new All_Events();
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
	public All_Events() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 919, 473);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		panel.setBounds(0, 0, 434, 438);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(433,438));
		
		JLabel lblNewLabel = new JLabel("All Events");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(28, 0, 283, 44);
		panel.add(lblNewLabel);
		
		
		
		table = new JTable();
		table.setRowHeight(30);
	//	table.setpreferedSize();
		
		JScrollPane scrollPane1 = new JScrollPane(table);
		scrollPane1.setBounds(10, 51, 893, 376);
		panel.add(scrollPane1);
		
		
		scrollPane1.setViewportView(table);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{ frame.dispose();
		}
		}
		);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
				Statement stmt=con.createStatement();
				ResultSet rst=stmt.executeQuery("select * from event");
				table.setModel(DbUtils.resultSetToTableModel(rst));
				}
				catch(Exception err)
				{
					System.out.println(err);
				}
	}

}
