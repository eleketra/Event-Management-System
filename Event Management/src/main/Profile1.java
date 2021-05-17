package main;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class Profile1 extends JPanel {
       String name,course,branch,club;
       int rollno;
       
	
	public Profile1(int uno){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
				Statement stmt=con.createStatement();
				ResultSet rst=stmt.executeQuery("select * from student");
				Statement stmt2=con.createStatement();
				ResultSet rst2=stmt2.executeQuery("select * from organizer");
				while(rst.next())
					
				{
					
					if(rst.getInt("rollno")==uno)
					  {
						 
					name=rst.getString("Name");
					course=rst.getString("Course");
					branch=rst.getString("Branch");
					rollno=rst.getInt("rollno");
				}
					while(rst2.next())
					{
						if(rst2.getInt("rollno")==uno)
						{
							club=rst2.getString("clubname");
						}
					}
			}
				}
				catch(Exception err)
				{
					System.out.println(err);
				}
		setBackground(Color.orange);
		setBounds(100, 100, 520, 317);
	
		setLayout(null);
	
		JLabel lblName = new JLabel("Name              :");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(59, 77, 131, 18);
		add(lblName);
		
		JLabel lblName1 = new JLabel();
		lblName1.setText(name);
		lblName1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName1.setBounds(200, 79, 131, 19);
		add(lblName1);
		
		
		JLabel lblCourse = new JLabel("Course                :\r\n");
		lblCourse.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCourse.setBounds(59, 106, 132, 18);
		add(lblCourse);
		
		JLabel lblCourse1 = new JLabel();
		lblCourse1.setText(course);
		lblCourse1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCourse1.setBounds(200, 110, 131, 19);
		add(lblCourse1);
		
		
		JLabel lblBranchifapplicable = new JLabel("Branch(ifApplicable)   :");
		lblBranchifapplicable.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBranchifapplicable.setBounds(59, 135, 190, 19);
		add(lblBranchifapplicable);
		
		JLabel branch1 = new JLabel();
		branch1.setText(branch);
		branch1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		branch1.setBounds(220, 137, 131, 19);
		add(branch1);
		
		JLabel lblUniversityId = new JLabel("University Id   :");
		lblUniversityId.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblUniversityId.setBounds(59, 165, 140, 18);
	     add(lblUniversityId);
	     
	     JLabel universityID = new JLabel();
	     universityID.setText(""+rollno);
	     universityID .setFont(new Font("Times New Roman", Font.BOLD, 16));
	     universityID .setBounds(200, 160, 131, 19);
			add(universityID );
		
		JLabel lblClubMember = new JLabel("Club Member      :");
		lblClubMember.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblClubMember.setBounds(59, 199, 184, 18);
	    add(lblClubMember);
	    
	    JLabel clubmem = new JLabel();
	    clubmem.setText(club);
	    clubmem .setFont(new Font("Times New Roman", Font.BOLD, 16));
	    clubmem .setBounds(200, 202, 140, 19);
			add(clubmem );
		
	
		
		JLabel lblNoOfEvents = new JLabel("No. of Events Registered              :\r\n");
		lblNoOfEvents.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNoOfEvents.setBounds(59, 246, 245, 18);
		
		    JLabel lblProfile = new JLabel("Profile");
		    lblProfile.setBounds(0, 0, 121, 24);
		 
		    lblProfile.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		    lblProfile.setVerticalAlignment(SwingConstants.TOP);
	   add(lblNoOfEvents);
	   
	   JLabel lblNewLabel = new JLabel("Profile\r\n");
	   lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 37));
	   lblNewLabel.setBounds(45, 11, 164, 43);
	   add(lblNewLabel);
	    setVisible(true);
	    
	}
	
	
	
}
