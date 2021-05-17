package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.*;

import net.proteanit.sql.DbUtils;
public class Event_List1 extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel main;
	
	//label_3,label_6,label_9,label_12;
	JLabel label_1,label_2/*label_5,label_7,label_8,Jlabel_10,label_11,label_13,label_14*/;
	String evename,clubname,venue,date2,duration,description;
	Date date1;

	public Event_List1()
	{  // LocalDate date=LocalDate.now();
		//code for database retrieve
		
		
		
		
		
		//end of database code
		setBackground(new Color(204, 0, 204));
	    setBounds(100, 100, 300, 359);
	   // setLayout(null);
		
	
	  JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(0, 0, 450, 370);
		add(scrollPane);
		
		
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setBackground(new Color(204, 0, 204));
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(540,610));
		
		
		JLabel lblNewLabel = new JLabel("Get yourself registerd and explore the talent inside....hurry up");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(11, 0, 507, 50);
		panel.add(lblNewLabel);
		
		
		
		/*JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(153, 0, 153));
		panel_2.setBounds(11, 152, 514, 103);
		panel.add(panel_2);
		
		JButton label_3 = new JButton("Register");
		label_3.setBounds(380, 8, 126, 28);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_4.setBounds(8, 11, 198, 28);
		panel_2.add(label_4);
		
		JTextArea label_5 = new JTextArea("New label");
		label_5.setBounds(8, 38, 498, 62);
		panel_2.add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(153, 0, 153));
		panel_3.setBounds(11, 262, 514, 103);
		panel.add(panel_3);
		
		JButton label_6 = new JButton("Register");
		label_6.setBounds(3380, 8, 126, 31);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_7.setBounds(8, 11, 198, 28);
		panel_3.add(label_7);
		
		JTextArea label_8 = new JTextArea("New label");
		label_8.setBounds(8, 38, 498, 62);
		panel_3.add(label_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(153, 0, 153));
		panel_4.setBounds(11, 372, 514, 103);
		panel.add(panel_4);
		
		JButton label_9 = new JButton("Register");
		label_9.setBounds(380, 8, 126, 31);
		panel_4.add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_10.setBounds(8, 11, 198, 28);
		panel_4.add(label_10);
		
		JTextArea label_11 = new JTextArea("New label");
		label_11.setBounds(8, 38, 498, 62);
		panel_4.add(label_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(153, 0, 153));
		panel_5.setBounds(11, 482, 514, 103);
		panel.add(panel_5);
		
		JButton label_12 = new JButton("Register");
		label_12.setBounds(380, 8, 126, 31);
		panel_5.add(label_12);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_13.setBounds(8, 11, 198, 28);
		panel_5.add(label_13);
		
		JTextArea label_14 = new JTextArea("New label");
		label_14.setBounds(8, 38, 498, 62);
		panel_5.add(label_14);*/
	 setVisible(true);
		

		
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					label_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new Register_Event(evename);
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					label_6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new Register_Event(evename);
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					label_9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new Register_Event(evename);
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					label_12.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new Register_Event(evename);
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	 LocalDate localdate=LocalDate.now();
		try{
			String str=localdate+"";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
				Statement stmt=con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from event");
		        int y=44;
			while (rs.next()) {
				int i=rs.getString("date_of_event").compareTo(str);
				if(i>0)
				{
				    evename = rs.getString("Eventname");
		            clubname = rs.getString("clubname");
		             date2=rs.getString("date_of_event");
		             venue=rs.getString("venue");
		             duration=rs.getString("duration");
		             description=rs.getString("description");
		             JPanel panel_1 = new JPanel();
		 			panel_1.setLayout(null);
		 			panel_1.setBackground(new Color(153, 0, 153));
		 			panel_1.setBounds(11, y, 514, 103);
		 			
		 			
		 			JButton button = new JButton("Register");
		 			button.setBounds(380, 8, 126, 31);
		 			panel_1.add(button);
		 			EventQueue.invokeLater(new Runnable() {
		 				public void run() {
		 					try {
		 						button.addActionListener(new ActionListener() {
		 							public void actionPerformed(ActionEvent arg0) {
		 								new Register_Event(evename);
		 							}
		 						});
		 						
		 					} catch (Exception e) {
		 						e.printStackTrace();
		 					}
		 				}
		 			});
		 			
		 			JLabel label_1 = new JLabel("New label");
		 			label_1.setForeground(Color.WHITE);
		 			label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		 			label_1.setBounds(8, 11, 198, 28);
		 			panel_1.add(label_1);
		 			
		 			JTextArea label_2 = new JTextArea("New label");
		 			label_2.setBounds(8, 38, 346, 95);
		 			panel_1.add(label_2);
		 			
		           
		             label_1.setText(evename);
		             label_2.setText("Clubname:"+clubname+","+"Date:"+date2+"\n"+"Venue:"+
		               venue+","+"Duration:"+duration+","+"\n"+description);
		             panel.add(panel_1);
		             remove(panel);
		             y=y+110;
				}
                    }
		}
				catch(Exception err)
				{
					System.out.println(err);
				}
		
	}
	//@Override
	/*public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == label)
		{
			new Register_Event();
		}
		if(e.getSource() == label_3)
		{
			new Register_Event();
		}
		if(e.getSource() == label_6)
		{
			new Register_Event();
		}
		if(e.getSource() == label_9)
		{
			new Register_Event();
		}
		if(e.getSource() == label_12)
		{
			new Register_Event();
		}
		
	}*/
}
	


