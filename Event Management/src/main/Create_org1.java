package main;
import javax.swing.JFrame;

import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Create_org1 {

	private JFrame frmClubRegiteration;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_org1 window = new Create_org1();
					window.frmClubRegiteration.setVisible(true);
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
	public Create_org1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClubRegiteration = new JFrame();
		frmClubRegiteration.getContentPane().setBackground(new Color(0, 255, 153));
		frmClubRegiteration.setTitle("Club Regiteration");
		frmClubRegiteration.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ankita Kushwaha\\Downloads\\download (1).jfif"));
		frmClubRegiteration.setBounds(100, 100, 435, 353);
		frmClubRegiteration.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmClubRegiteration.getContentPane().setLayout(null);
		
		JLabel lblRegisterationForm = new JLabel("Registeration Form");
		lblRegisterationForm.setForeground(new Color(51, 153, 51));
		lblRegisterationForm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRegisterationForm.setBounds(101, 12, 200, 50);
		frmClubRegiteration.getContentPane().add(lblRegisterationForm);
		
		JLabel lblNewLabel = new JLabel("UserId           :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(38, 73, 95, 24);
		frmClubRegiteration.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username      :");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUsername.setBounds(38, 108, 108, 24);
		frmClubRegiteration.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password       :");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(38, 143, 100, 24);
		frmClubRegiteration.getContentPane().add(lblPassword);
		
		JLabel lblContactNo = new JLabel("Contact No.   :");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblContactNo.setBounds(38, 183, 108, 24);
		frmClubRegiteration.getContentPane().add(lblContactNo);
		
		JLabel lblClubName = new JLabel("Club Name    :");
		lblClubName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblClubName.setBounds(38, 218, 108, 24);
		frmClubRegiteration.getContentPane().add(lblClubName);
		
		textField = new JTextField();
		textField.setBounds(155, 72, 250, 25);
		frmClubRegiteration.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(156, 109, 250, 25);
		frmClubRegiteration.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(155, 144, 250, 25);
		frmClubRegiteration.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(156, 184, 250, 25);
		frmClubRegiteration.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(156, 219, 250, 25);
		frmClubRegiteration.getContentPane().add(textField_4);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setBackground(new Color(0, 153, 102));
		btnCreate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnCreate.setBounds(134, 266, 139, 47);
		frmClubRegiteration.getContentPane().add(btnCreate);
		frmClubRegiteration.setResizable(false);
		frmClubRegiteration.setVisible(true);

		frmClubRegiteration.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{ frmClubRegiteration.dispose();
		}
		}
		);
	}
}
