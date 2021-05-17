package main;
import javax.swing.*;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class login implements ActionListener{

	private static final Connection NULL = null;
	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	JLabel lblUsername,lblPassword;
	int uno;
	Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		login window =new login();
		window.frame.setVisible(true);
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new login();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/}
	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 16));
		frame.setBounds(100, 100, 450, 300);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLoginInTo = new JLabel("Login In to Get Your Event Managed Easily");
		lblLoginInTo.setForeground(new Color(0, 0, 255));
		lblLoginInTo.setBackground(new Color(0, 0, 255));
		lblLoginInTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblLoginInTo.setBounds(48, 22, 353, 29);
		frame.getContentPane().add(lblLoginInTo);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblUsername.setBackground(Color.WHITE);
		lblUsername.setBounds(83, 84, 98, 29);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(186, 88, 191, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setBounds(83, 132, 56, 23);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(186, 133, 191, 23);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLogin.setBounds(174, 180, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBackground(UIManager.getColor("Button.focus"));
		btnAdmin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAdmin.setBounds(24, 227, 89, 23);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnOrganizer = new JButton("Organizer");
		btnOrganizer.setBackground(UIManager.getColor("Button.focus"));
		btnOrganizer.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnOrganizer.setBounds(293, 227, 120, 23);
		frame.setResizable(false);
		frame.getContentPane().add(btnOrganizer);
		btnLogin.addActionListener(this);
		btnAdmin.addActionListener(this);
		btnOrganizer.addActionListener(this);
		frame.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="LOGIN")
		{
			if(!textField.getText().equals(null))
			{
			try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
			Statement stmt=con.createStatement();
			ResultSet rst=stmt.executeQuery("select * from student");
			while(rst.next())
				
			{
				
				if(rst.getInt("rollno")==Integer.parseInt(textField.getText()))
				  {
					 
				uno=rst.getInt("rollno");
			    new MainPage_Student(uno);
			    frame.dispose();
			}
		}
			}
			
			
			catch(Exception err)
			{
				System.out.println(err);
			}
		}
		}
			
		if(e.getActionCommand()=="Admin")
		{
			
			frame.dispose();
			new LoginAdmin();
						
					
		}
		if(e.getActionCommand()=="Organizer")
		{
			frame.dispose();
						
			new LoginOrganizer();
			
		}
		
	}
}
