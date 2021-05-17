package main;



import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Register_Event  {

	public JFrame frmRegisterTheEvent;
	private JTextField textField;
	private JLabel lblName,lblNewLabel_1;
	private JLabel lblCourse;
	private JLabel lblContactNo;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public Register_Event(String str) {
		initialize(str);
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(String str) {
		frmRegisterTheEvent = new JFrame();
		frmRegisterTheEvent.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ankita Kushwaha\\Downloads\\download (1).jfif"));
		frmRegisterTheEvent.setTitle("Register the event");
		frmRegisterTheEvent.getContentPane().setBackground(new Color(255, 255, 102));
		frmRegisterTheEvent.setBounds(100, 100, 374, 304);
		frmRegisterTheEvent.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmRegisterTheEvent.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(str);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(45, 11, 249, 14);
		frmRegisterTheEvent.getContentPane().add(lblNewLabel);
		
		JLabel lblUniversityId = new JLabel("University Id");
		lblUniversityId.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUniversityId.setBounds(30, 43, 99, 33);
		frmRegisterTheEvent.getContentPane().add(lblUniversityId);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(139, 46, 200, 26);
		frmRegisterTheEvent.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(30, 80, 99, 33);
		frmRegisterTheEvent.getContentPane().add(lblName);
		
		lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCourse.setBounds(30, 120, 99, 33);
		frmRegisterTheEvent.getContentPane().add(lblCourse);
		
		lblContactNo = new JLabel("Contact No.");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblContactNo.setBounds(30, 164, 99, 33);
		frmRegisterTheEvent.getContentPane().add(lblContactNo);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(139, 83, 200, 26);
		frmRegisterTheEvent.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(139, 123, 200, 26);
		frmRegisterTheEvent.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(139, 167, 200, 26);
		frmRegisterTheEvent.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(110, 204, 106, 26);
		frmRegisterTheEvent.setVisible(true);
		frmRegisterTheEvent.setResizable(false);
		frmRegisterTheEvent.getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblNewLabel_1.setBounds(82, 241, 180, 23);
		frmRegisterTheEvent.getContentPane().add(lblNewLabel_1);
		frmRegisterTheEvent.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{ frmRegisterTheEvent.dispose();
		}
		}
		);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
			      {
				    Class.forName("com.mysql.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
			       Statement stmt=con.createStatement();
			      
			      
				 PreparedStatement ps = con.prepareStatement("Insert into registeration values(?,?,?,?,?)");
				    ps.setString(1,str);
					ps.setInt(2,Integer.parseInt(textField.getText()));
					ps.setString(3,textField_1.getText());
					ps.setString(4,textField_2.getText());
					ps.setString(5,textField_3.getText());
					
				                ps.executeUpdate();
				                
				                lblNewLabel_1.setText("Registerd Successfully");
				                
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
