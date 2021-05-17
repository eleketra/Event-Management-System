package main;

import java.awt.Dimension;


import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Registered_Event extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;

	String evename;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registered_Event window = new Registered_Event();
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
	public Registered_Event(int uno) {
		initialize(uno);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int uno) {
		
		setBackground(new Color(255, 222, 173));
	    setBounds(100, 100, 450, 328);
		//setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		panel.setBounds(0, 0, 434, 438);
		add(panel);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(433,438));
		
		JLabel lblNewLabel = new JLabel("Registered Events");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(30, 11, 283, 44);
		panel.add(lblNewLabel);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 51, 710, 450);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setBounds(9, 48, 414, 700);
		textArea.setPreferredSize(new Dimension(700,800));
		scrollPane.setViewportView(textArea);
		textArea.setText("EVENT NAME"+"\t\t"+"   DATE"+"\t"+"DURATION"+"\t"+"VENUE"+"\t"+"\n\n");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
				Statement stmt=con.createStatement();
				Statement stmt1=con.createStatement();
				ResultSet rst=stmt.executeQuery("select * from event");
				ResultSet rst1=stmt1.executeQuery("select * from registeration");
				
				while(rst1.next())
				{
					if(Integer.parseInt(rst1.getString("rollno"))==uno)
						
					{
						evename=rst1.getString("eventname");
						while(rst.next())
						{
						if(evename.equals(rst.getString("Eventname")))
						{
							textArea.append(rst.getString("Eventname")+"\t"+rst.getDate("date_of_event")
									+"\t"+rst.getString("duration")+"\t"+rst.getString("Venue")+"\t"+"\n");
						}
						}
						
					}
				}
				
				}
				catch(Exception err)
				{
					System.out.println(err);
				}
		
	}
}
