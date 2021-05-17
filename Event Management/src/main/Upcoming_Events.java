package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Upcoming_Events extends JPanel{


	private JTable table;
	JTextArea textArea;
	String str=null;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Upcoming_Events window = new Upcoming_Events();
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
	public Upcoming_Events() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBackground(new Color(255, 228, 225));
	    setBounds(100, 100, 450, 328);
		//setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(0, 0, 434, 438);
		add(panel);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(433,438));
		
		JLabel lblNewLabel = new JLabel("Upcoming Events");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(30, 11, 283, 44);
		panel.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 51, 710, 450);
		panel.add(scrollPane);
		
		
		textArea = new JTextArea();
		textArea.setBounds(9, 48, 414, 700);
		textArea.setPreferredSize(new Dimension(700,1000));
		scrollPane.setViewportView(textArea);
		textArea.setText("EventName"+"\t"+"   CLubname"+"\t\t"+"Date"+"\t"+"Duration"+"\t"+"Venue "+"\n\n");
		LocalDate localdate=LocalDate.now();
		
		try{
			
		  String str=localdate+"";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
			Statement stmt1=con.createStatement();
			ResultSet rst=stmt1.executeQuery("select * from event");
			while(rst.next())
			{
				int i=rst.getString("date_of_event").compareTo(str);
				if(i>0){
					
					textArea.append(rst.getString("Eventname")+"\t"+rst.getString("clubname")+"\tr"+rst.getString("date_of_event")
								+"\t"+rst.getString("duration")+"\t"+rst.getString("Venue")+"\t"+rst.getString("description")+"\n");
				}
					
			}
				
				}
				catch(Exception err)
				{
					System.out.println(err);
				}

	}

}
