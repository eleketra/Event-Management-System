package main;


import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class NotificationsAdmin extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  static int indicator=0;
	JButton okbtn,cancelbtn;
JTextArea textArea;
String clubname = null,type=null,description=null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public NotificationsAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		setBackground(new Color(175, 238, 238));
         setBounds(100, 100, 408, 292);
	     setLayout(null);
		
		JButton okbtn = new JButton("Accept");
		okbtn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		okbtn.setForeground(new Color(0, 0, 0));
		okbtn.setBounds(70, 245, 89, 30);
		add(okbtn);
		
		JButton cancelbtn = new JButton("Decline");
		cancelbtn.setForeground(Color.BLACK);
		cancelbtn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		cancelbtn.setBounds(234, 245, 89, 30);
		add(cancelbtn);
		
		 textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textArea.setBounds(22, 11, 362, 223);
		add(textArea);
		
		okbtn.setEnabled(false);
		cancelbtn.setEnabled(false);
		okbtn.addActionListener(this);
		cancelbtn.addActionListener(this);
		System.out.println("hrllo");
		setVisible(true);
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
		    Statement stmt=con.createStatement();
			ResultSet rst=stmt.executeQuery("select * from temp_club");
			int c=1;
			if(rst.first()==false)
				{
				
					c=0;
				}
			
			if(c!=0)
			{
				
			textArea.append("**UniversityId**    :"+rst.getInt("rollno")+"\n"+"**Student Name**     :"+rst.getString("studentName")
							+"\n"+"**Course**    :"+rst.getString("course")+"\n"+"**Clubname**     :"+rst.getString("clubname")+"\n"+"**About Club**      :"+rst.getString("description")+"\n");
			okbtn.setEnabled(true);
			cancelbtn.setEnabled(true);
			//System.out.println("hrllo");
			}
				
				}
				catch(Exception err)
				{
					System.out.println(err);
				}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getActionCommand()=="Accept")
	{
		//System.out.println("ok");
		indicator=1;
		try{
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
			//for deleting value in result table
			Statement stmt1=con.createStatement();
			String sql="DELETE FROM result";
			stmt1.executeUpdate(sql);
			//end
			   Statement stmt=con.createStatement();
				ResultSet rst=stmt.executeQuery("select clubname,clubtype,description from temp_club");
		     	while(rst.next())
				{
		     	 clubname=rst.getString("clubname")	;
		     	 type=rst.getString("clubtype");
		     	 description=rst.getString("description");
		     	}
		     	
		     //	System.out.println("ok");
		     	PreparedStatement ps = con.prepareStatement("Insert into clubs(clubname,type,description) values(?,?,?)");
		     	
		     	ps.setString(1,clubname);
		     	ps.setString(2,type);
		     	ps.setString(3, description);
		     	//System.out.println("ok"+indicator);
		     	ps.executeUpdate();
		     	
                PreparedStatement ps1 = con.prepareStatement("Insert into result values(?)");
		     	
		     	ps1.setInt(1,indicator);
		     	ps1.executeUpdate();
		     	con.close();
		     	okbtn.setEnabled(false);
				cancelbtn.setEnabled(false);
				}
				catch(Exception err)
				{
					System.out.println(err);
				}
		
	}
	if(e.getActionCommand()=="Decline")
	{
		indicator=0;
	}
	try{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
		Statement stmt=con.createStatement();
		String sql="DELETE FROM temp_club";
		stmt.executeUpdate(sql);
		PreparedStatement ps1 = con.prepareStatement("Insert into result values(?)");
     	
     	ps1.setInt(1,indicator);
		con.close();
	     	
			}
			catch(Exception err)
			{
				System.out.println("Error"+err);
			}
	
	textArea.setText("");
	}
	
	
}
