package main;


import javax.swing.JFrame;

import java.awt.Color;

import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

import java.sql.*;

public class Create_org {

	private JFrame frmCreateAnOrganisation;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Create_org() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreateAnOrganisation = new JFrame();
		frmCreateAnOrganisation.setTitle("Create An Club\r\n");
		frmCreateAnOrganisation.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\download (1).jfif"));
		frmCreateAnOrganisation.getContentPane().setBackground(new Color(102, 204, 204));
		frmCreateAnOrganisation.setBounds(100, 100, 617, 492);
		frmCreateAnOrganisation.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmCreateAnOrganisation.getContentPane().setLayout(null);
		
		JLabel lblRequestForm = new JLabel("Request form");
		lblRequestForm.setBackground(new Color(102, 102, 255));
		lblRequestForm.setForeground(Color.WHITE);
		lblRequestForm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblRequestForm.setBounds(193, 0, 211, 50);
		frmCreateAnOrganisation.getContentPane().add(lblRequestForm);
		
		JLabel lblUniversityRollno = new JLabel("University RollNo.    :");
		lblUniversityRollno.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUniversityRollno.setBounds(190, 46, 170, 26);
		frmCreateAnOrganisation.getContentPane().add(lblUniversityRollno);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField.setBounds(363, 47, 200, 22);
		frmCreateAnOrganisation.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name                         :");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(193, 83, 170, 24);
		frmCreateAnOrganisation.getContentPane().add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(363, 80, 200, 23);
		frmCreateAnOrganisation.getContentPane().add(textField_1);
		
		JLabel lblBranch = new JLabel("Branch                      :");
		lblBranch.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBranch.setBounds(193, 154, 170, 26);
		frmCreateAnOrganisation.getContentPane().add(lblBranch);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(363, 154, 200, 26);
		frmCreateAnOrganisation.getContentPane().add(textField_2);
		
		JLabel lblOrganisationName = new JLabel("Club Name                :");
		lblOrganisationName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblOrganisationName.setBounds(193, 196, 170, 26);
		frmCreateAnOrganisation.getContentPane().add(lblOrganisationName);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(363, 197, 200, 26);
		frmCreateAnOrganisation.getContentPane().add(textField_3);
		
		JLabel lblClubName = new JLabel("Club Type                  :");
		lblClubName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblClubName.setBounds(193, 233, 170, 26);
		frmCreateAnOrganisation.getContentPane().add(lblClubName);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(363, 234, 200, 26);
		frmCreateAnOrganisation.getContentPane().add(textField_4);
		
		JLabel lblClubDescription = new JLabel("Club Description        :");
		lblClubDescription.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblClubDescription.setBounds(29, 323, 151, 26);
		frmCreateAnOrganisation.getContentPane().add(lblClubDescription);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ankita Kushwaha\\Downloads\\apply.png"));
		lblNewLabel.setBounds(10, 61, 170, 225);
		frmCreateAnOrganisation.getContentPane().add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(193, 292, 380, 104);
		frmCreateAnOrganisation.getContentPane().add(textArea);
		
		JButton btnSend = new JButton("Send");
		btnSend.setForeground(Color.WHITE);
		btnSend.setBackground(new Color(102, 0, 255));
		btnSend.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnSend.setBounds(135, 414, 170, 38);
		frmCreateAnOrganisation.getContentPane().add(btnSend);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(350, 423, 200, 29);
		frmCreateAnOrganisation.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCourse = new JLabel("Course                       :");
		lblCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCourse.setBounds(190, 118, 170, 24);
		frmCreateAnOrganisation.getContentPane().add(lblCourse);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(363, 115, 200, 23);
		frmCreateAnOrganisation.getContentPane().add(textField_5);
		frmCreateAnOrganisation.setResizable(false);
		frmCreateAnOrganisation.setVisible(true);
		btnSend.setEnabled(true);
		frmCreateAnOrganisation.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{ frmCreateAnOrganisation.dispose();
		}
		}
		);
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
			      {
				    Class.forName("com.mysql.jdbc.Driver");
				    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
			        Statement stmt=con.createStatement();
			      
			      
				    PreparedStatement ps = con.prepareStatement("Insert into temp_club values(?,?,?,?,?,?,?)");
				    ps.setInt(1,Integer.parseInt(textField.getText()));
					ps.setString(2,textField_1.getText());
					ps.setString(4,textField_2.getText());
					ps.setString(5,textField_3.getText());
					ps.setString(6,textField_4.getText());
					ps.setString(3,textField_5.getText());
					ps.setString(7,textArea.getText());
					
				                ps.executeUpdate();
				                lblNewLabel_1.setText("Request Sent");
				                
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
		        textField_4.setText("");
		        textField_5.setText("");
		        textArea.setText("");
		        btnSend.setEnabled(false);

			}
			
			});
		
	}
}
