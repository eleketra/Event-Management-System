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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Student_Registered_Detail extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame; JTextArea textArea;
	String evename;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Registered_Detail window = new Student_Registered_Detail();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public Student_Registered_Detail(String str) {
		initialize(str);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String str) {
		setBackground(new Color(255, 222, 173));
	    setBounds(100, 100, 450, 328);
		//setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		panel.setBounds(0, 0, 434, 438);
		add(panel);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(700,550));
		
		JLabel lblNewLabel = new JLabel("Registered Student Details");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(125, 11, 283, 44);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 51, 710, 450);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setBounds(9, 48, 414, 700);
		textArea.setPreferredSize(new Dimension(700,700));
		scrollPane.setViewportView(textArea);
		textArea.setText("UNIVERSITY ROLLNO"+"\t"+"   NAME"+"\t\t"+"COURSE"+"\t"+"CONTACT "+"\n\n");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
			Statement stmt1=con.createStatement();
			ResultSet rst1=stmt1.executeQuery("select * from event");
			while(rst1.next())
			{
				if(rst1.getString("clubname").equals(str))
					evename=rst1.getString("Eventname");
			}
				Statement stmt=con.createStatement();
				ResultSet rst=stmt.executeQuery("select * from registeration");
				while(rst.next())
				{
					if(rst.getString("eventname").equals(evename))
					{
						textArea.append(rst.getInt("rollno")+"\t\t"+rst.getString("studentName")
								+"\t\t"+rst.getString("course")+"\t"+rst.getString("contact")+"\n");
					}
				}
				
				}
				catch(Exception err)
				{
					System.out.println(err);
				}

	}

}
