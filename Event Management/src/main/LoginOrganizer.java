package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class LoginOrganizer implements ActionListener{

	public JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;
	int uno;
	String str;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginOrganizer window = new LoginOrganizer();
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
	public LoginOrganizer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeOrganizerLogin = new JLabel("Welcome, Organizer's Login Page");
		lblWelcomeOrganizerLogin.setForeground(Color.BLUE);
		lblWelcomeOrganizerLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblWelcomeOrganizerLogin.setBounds(88, 21, 273, 50);
		frame.getContentPane().add(lblWelcomeOrganizerLogin);
		
		JLabel lblUseraname = new JLabel("Username");
		lblUseraname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblUseraname.setBounds(61, 76, 89, 39);
		frame.getContentPane().add(lblUseraname);
		
		textField = new JTextField();
		textField.setBounds(160, 82, 210, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblPassword.setBounds(61, 131, 89, 39);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(160, 137, 208, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnLogin.setBounds(159, 188, 113, 30);
		frame.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
	//	btnBack.setIcon(new ImageIcon("C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\back.png"));
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(10, 11, 68, 25);
		frame.getContentPane().add(btnBack);
	    btnBack.addActionListener(this);
	    btnLogin.addActionListener(this);
		frame.setVisible(true);
		frame.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="LOGIN")
		{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
					Statement stmt=con.createStatement();
					ResultSet rst=stmt.executeQuery("select * from organizer");
					while(rst.next())
						
					{
						
						if(rst.getInt("rollno")==Integer.parseInt(textField.getText()))
						  {
							 
						uno=rst.getInt("rollno");
						str=rst.getString("clubname");
					    new MainPage_Organizer(uno,str);
					    frame.dispose();
					}
						else
						{
							System.out.println("error");
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
			
			frame.dispose();
			new login();
						
					
		}
		
	}
}
