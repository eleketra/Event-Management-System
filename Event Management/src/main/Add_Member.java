package main;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JLabel;

public class Add_Member {

	private JFrame frame;
	private JTextField textField,textField_1,textField_2,textField_3;

	
	public Add_Member(String str) {
		initialize(str);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String str) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setBounds(100, 100, 425, 283);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegisterationForm = new JLabel("Membership Form");
		lblRegisterationForm.setForeground(new Color(0, 0, 139));
		lblRegisterationForm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRegisterationForm.setBounds(98, 0, 200, 40);
		frame.getContentPane().add(lblRegisterationForm);
		
		JLabel lblNewLabel = new JLabel("UniversityId :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(38, 51, 95, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username      :");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUsername.setBounds(38, 85, 108, 24);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password       :");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(38, 120, 100, 24);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblContactNo = new JLabel("Contact No.   :");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblContactNo.setBounds(38, 155, 108, 24);
		frame.getContentPane().add(lblContactNo);
		
		textField = new JTextField();
		textField.setBounds(143, 51, 250, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 86, 250, 25);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 121, 250, 25);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 156, 250, 25);
		frame.getContentPane().add(textField_3);
		
		JButton btnCreate = new JButton("ADD");
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setBackground(new Color(0, 0, 0));
		btnCreate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnCreate.setBounds(80, 205, 100, 31);
		frame.getContentPane().add(btnCreate);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(190, 205, 219, 31);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setResizable(false);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{ frame.dispose();
		}
		}
		);
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
			      {
				    Class.forName("com.mysql.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
			       Statement stmt=con.createStatement();
			      
			      
				 PreparedStatement ps = con.prepareStatement("Insert into organizer values(?,?,?,?,?)");
				    ps.setString(6,str);
					ps.setInt(2,Integer.parseInt(textField.getText()));
					ps.setString(3,textField_1.getText());
					ps.setString(4,textField_2.getText());
					ps.setString(5,textField_3.getText());
					
				                ps.executeUpdate();
				                
				                lblNewLabel_1.setText("Added Successfully");
				                
				                con.close();
				                stmt.close();
			}
				catch(Exception e3)
			      {
			       System.out.println("Sql Error"+e3);
			      }
				    textField.setText("");
				    textField_1.setText("");
				    textField_2.setText("");
				    textField_3.setText("");
				
			}
		});
	}
}
