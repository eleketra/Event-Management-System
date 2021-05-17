package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NotificationStudent  {

	private JFrame frmNotification;
int indicator=2;
	/**
	 * Launch the application.
	 */
	
	public NotificationStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNotification = new JFrame();
		frmNotification.getContentPane().setBackground(new Color(175, 238, 238));
		frmNotification.setTitle("Notification");
		frmNotification.setBounds(100, 100, 450, 186);
		frmNotification.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmNotification.getContentPane().setLayout(null);
		
		JLabel result = new JLabel("");
		result.setForeground(Color.black);
		result.setFont(new Font("Times New Roman", Font.BOLD, 12));
		result.setBounds(10, 25, 414, 37);
		
		frmNotification.getContentPane().add(result);
		
		
		JButton btnNewButton = new JButton("Register Now");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(105, 92, 130, 30);
		btnNewButton.setEnabled(false);
		frmNotification.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
		      frmNotification.dispose();
		      try{
		  		
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
					//for deleting value in result table
					Statement stmt1=con.createStatement();
					String sql="DELETE FROM result";
					stmt1.executeUpdate(sql);
				     	
		                PreparedStatement ps1 = con.prepareStatement("Insert into result values(?)");
				     	
				     	ps1.setInt(1,0);
				     	ps1.executeUpdate();
				     	con.close();
						}
						catch(Exception err)
						{
							System.out.println(err);
						}
		      result.setText("No new notification");
		      new Create_org1();
		      
			}
			});
		//fetching indiactor value from result table
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
			 Statement stmt=con.createStatement();
				ResultSet rst=stmt.executeQuery("select * from result");
		     	if(!rst.next())
				{
		     		
		     	
		     	 indicator=rst.getInt("check")	;
		     		
		     	
		     	}
		     	System.out.println(indicator+"");
		     	con.close();
		}
		
		catch(Exception err)
		{
			System.out.println(err);
		}
		     	
		if(indicator==1)
		{
			
			result.setText("Your request accepted..Please Register");
			btnNewButton.setEnabled(true);
			
			
		}
		if(indicator==0){
			result.setText("Your request declined..Please try again");
			}
		if(indicator==2)
		{
			result.setText("No new Notification");
		}
		frmNotification.setVisible(true);
		frmNotification.setResizable(false);
		frmNotification.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{ frmNotification.dispose();
		}
		}
		);
	}

}
