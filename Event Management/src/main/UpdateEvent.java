package main;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateEvent implements ActionListener {

	private JFrame frmUpdateAnEvent,frameaskevent;
	private JTextField textField,textEvent;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	 private JTextField textField_4;
   private JButton  updatebtn;
  Choice choice;
 
  String str;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public UpdateEvent() {
		frameaskevent = new JFrame();
		frameaskevent.setBounds(100, 100, 395, 187);
		frameaskevent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameaskevent.getContentPane().setLayout(null);
		
		JLabel lblEnterTheEvent = new JLabel("Enter the event name");
		lblEnterTheEvent.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblEnterTheEvent.setBounds(106, 11, 143, 33);
		frameaskevent.getContentPane().add(lblEnterTheEvent);
		
		textEvent = new JTextField();
		textEvent.setBounds(45, 50, 280, 33);
		frameaskevent.getContentPane().add(textEvent);
		textEvent.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnOk.setBounds(133, 103, 89, 34);
		frameaskevent.getContentPane().add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 str=textEvent.getText();
				frameaskevent.dispose();
				initialize(str);
				
			}
		});
		frameaskevent.setVisible(true);
		frameaskevent.setResizable(false);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String str) {
		frmUpdateAnEvent = new JFrame();
		frmUpdateAnEvent.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ankita Kushwaha\\Downloads\\download (1).jfif"));
		frmUpdateAnEvent.setTitle("Update an Event");
		frmUpdateAnEvent.getContentPane().setBackground(new Color(112, 128, 144));
		frmUpdateAnEvent.getContentPane().setForeground(new Color(112, 128, 144));
		frmUpdateAnEvent.setBounds(100, 100, 513, 378);
		frmUpdateAnEvent.getContentPane().setLayout(null);
		frmUpdateAnEvent.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setForeground(Color.WHITE);
		lblDescription.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDescription.setBounds(66, 61, 103, 24);
		frmUpdateAnEvent.getContentPane().add(lblDescription);
		
		JLabel lblClubName = new JLabel("Club Name");
		lblClubName.setForeground(Color.WHITE);
		lblClubName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblClubName.setBounds(66, 92, 103, 24);
		frmUpdateAnEvent.getContentPane().add(lblClubName);
		
		JLabel lbleventName = new JLabel("Event Name");
		lbleventName.setForeground(Color.WHITE);
		lbleventName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbleventName.setBounds(66, 123, 103, 24);
		frmUpdateAnEvent.getContentPane().add(lbleventName);
		
		JLabel lblVenue = new JLabel("Venue");
		lblVenue.setForeground(Color.WHITE);
		lblVenue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblVenue.setBounds(66, 158, 103, 24);
		frmUpdateAnEvent.getContentPane().add(lblVenue);
		
		JLabel lblDate = new JLabel("Date(yyyy/mm//dd)");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDate.setBounds(66, 189, 137, 24);
		frmUpdateAnEvent.getContentPane().add(lblDate, BorderLayout.SOUTH);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setForeground(Color.WHITE);
		lblDuration.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDuration.setBounds(66, 225, 103, 24);
		frmUpdateAnEvent.getContentPane().add(lblDuration);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTime.setBounds(66, 260, 103, 24);
		frmUpdateAnEvent.getContentPane().add(lblTime);
	
		
		textField = new JTextField();
		textField.setBounds(213, 64, 246, 20);
		frmUpdateAnEvent.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 95, 246, 20);
		frmUpdateAnEvent.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 126, 246, 20);
		frmUpdateAnEvent.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(213, 157, 246, 20);
		frmUpdateAnEvent.getContentPane().add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(213, 263, 246, 20);
		frmUpdateAnEvent.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		 choice = new Choice();
		choice.setFont(new Font("Dialog", Font.PLAIN, 12));
		choice.setBounds(213, 225, 246, 22);
		frmUpdateAnEvent.getContentPane().add(choice);
		choice.add("1-Day");
		choice.add("2-Day");
		choice.add("3-Day");
		choice.add("4-Day");
		
		updatebtn = new JButton("Update");
		updatebtn.setBackground(Color.BLACK);
		updatebtn.setForeground(Color.WHITE);
		updatebtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		updatebtn.setBounds(178, 299, 133, 24);
		frmUpdateAnEvent.getContentPane().add(updatebtn);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(213, 192, 246, 20);
		frmUpdateAnEvent.getContentPane().add(textField_4);
		frmUpdateAnEvent.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{ frmUpdateAnEvent.dispose();
		}
		}
		);

		updatebtn.addActionListener(this);
		frmUpdateAnEvent.setResizable(false);
		frmUpdateAnEvent.setVisible(true);
		try
	      {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
	        Statement stmt=con.createStatement();
	        ResultSet rst=stmt.executeQuery("select * from event");
	        while(rst.next())
	        {
	        	if(rst.getString("Eventname").equals(str))
	        	{
	        		textField.setText(rst.getString("Description"));
	        		textField_1.setText(rst.getString("Eventname"));
	        		textField_2.setText(rst.getString("clubname"));
	        		textField_3.setText(rst.getString("venue"));
	        		textField_4.setText(rst.getString("date_of_event"));
	        		textField_5.setText(rst.getString("time"));
	        		//choice.set(rst.getString("Description"));
	        	}
	        }
		            
		                
		                con.close();
		                stmt.close();
	}
		catch(Exception e3)
	      {
	       System.out.println("Sql Error"+e3);
	      }
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try
	      {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
	        
	        String sql = "Update event " +
			        "SET Eventname = '"+textField_1.getText()+"'," +
					"clubname = '"+textField_2.getText()+"',"+
			        "date_of_event = '"+textField_4.getText()+"'," +
					"duration = '"+choice.getSelectedItem()+"'," +
					"time = '"+textField_5.getText()+"'," +
					"venue = '"+textField_3.getText()+"'," +
					"description = '"+textField.getText()+"'" +
					"Where Eventname = '"+textField_1.getText()+"'";

	
	
	Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	st.executeUpdate(sql);
	
	JOptionPane.showMessageDialog(null, "Event Update Succesfully.",
                "Record Updated",JOptionPane.INFORMATION_MESSAGE);

	         /* PreparedStatement ps = con.prepareStatement("update event SET(?,?,?,?,?,?,?) where Eventname='textField_1.getText()'");
		    ps.setString(1,textField_2.getText());
			ps.setString(2,textField_1.getText());
			ps.setString(3,textField_4.getText());
		     ps.setString(4,choice.getSelectedItem());
		     ps.setString(5,textField_5.getText());
			ps.setString(6,textField_3.getText());
			ps.setString(7,textField.getText());
			
			
		                ps.executeUpdate();*/
		             //   lblNewLabel_1.setText("Request Sent");
		                //JOptionPane.showMessageDialog(null,"Upadted Event successfully");
		                con.close();
		                st.close();
	}
		catch(Exception e3)
	      {
	       System.out.println("Sql Error"+e3);
	      }
		textField.setText("");
      textField_1.setText("");
      textField_2.setText("");
      textField_3.setText("");
      textField_5.setText("");
      textField_4.setText("");
      
	}
		
	}


