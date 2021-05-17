package main;
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;



public class LoginAdmin implements ActionListener {
    
	public JFrame frame1;
	private JTextField textField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	String pass="1234";
	JButton btnBack;
	//private JButton btnNewButton;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public LoginAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(Color.ORANGE);
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblWelcomeAdminLogin = new JLabel("Welcome Admin Login Page");
		lblWelcomeAdminLogin.setForeground(Color.BLUE);
		lblWelcomeAdminLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblWelcomeAdminLogin.setBounds(105, 11, 270, 49);
		frame1.getContentPane().add(lblWelcomeAdminLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblUsername.setBounds(71, 72, 108, 40);
		frame1.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(168, 78, 227, 33);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblPassword.setBounds(71, 122, 81, 50);
		frame1.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 133, 227, 33);
		frame1.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogin.setBounds(147, 183, 117, 40);
		frame1.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		//btnBack.setIcon(new ImageIcon("C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\back.png"));
	
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(10, 11, 72, 25);
		
		frame1.getContentPane().add(btnBack);
		frame1.setVisible(true);
		frame1.setResizable(false);
		btnLogin.addActionListener(this);
		btnBack.addActionListener(this);
		}
	//	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="LOGIN")
		{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
					Statement stmt=con.createStatement();
					ResultSet rst=stmt.executeQuery("select * from Admin");
					while(rst.next())
						
					{
						
						if(rst.getString("admname").equals((textField.getText())))
						  {
							System.out.println("hello");
							 
				          new MainPage_Admin();
					      frame1.dispose();
					}
				}
					}
					catch(Exception err)
					{
						System.out.println(err);
					}
		}
		if(e.getActionCommand()=="Back")
		{
			
			frame1.dispose();
			new login();
			//Response.sendRedirect("Event Management\\src\\main\\login.java");
						
					
		}
	}
}
