package main;


import java.awt.event.*;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Font;

import javax.swing.JEditorPane;
import javax.swing.JTextField;

import java.awt.Choice;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
public class Create_event implements ActionListener {

	private JFrame frmAddAnEvent;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	
   private JButton  btnNewButton;
  private JTextField textField_4;
Choice choice;
  /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_event window = new Create_event();
					window.frmAddAnEvent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Create_event() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddAnEvent = new JFrame();
		frmAddAnEvent.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\download (1).jfif"));
		frmAddAnEvent.setTitle("Add an Event");
		frmAddAnEvent.getContentPane().setBackground(new Color(112, 128, 144));
		frmAddAnEvent.getContentPane().setForeground(new Color(112, 128, 144));
		frmAddAnEvent.setBounds(100, 100, 513, 378);
		frmAddAnEvent.getContentPane().setLayout(null);
		frmAddAnEvent.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setForeground(Color.WHITE);
		lblDescription.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDescription.setBounds(66, 61, 103, 24);
		frmAddAnEvent.getContentPane().add(lblDescription);
		
		JLabel lblClubName = new JLabel("Club Name");
		lblClubName.setForeground(Color.WHITE);
		lblClubName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblClubName.setBounds(66, 92, 103, 24);
		frmAddAnEvent.getContentPane().add(lblClubName);
		
		JLabel lbleventName = new JLabel("Event Name");
		lbleventName.setForeground(Color.WHITE);
		lbleventName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbleventName.setBounds(66, 123, 103, 24);
		frmAddAnEvent.getContentPane().add(lbleventName);
		
		JLabel lblVenue = new JLabel("Venue");
		lblVenue.setForeground(Color.WHITE);
		lblVenue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblVenue.setBounds(66, 158, 103, 24);
		frmAddAnEvent.getContentPane().add(lblVenue);
		
		JLabel lblDate = new JLabel("Date(yyyy/mm//dd)");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDate.setBounds(66, 189, 137, 24);
		frmAddAnEvent.getContentPane().add(lblDate);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setForeground(Color.WHITE);
		lblDuration.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDuration.setBounds(66, 225, 103, 24);
		frmAddAnEvent.getContentPane().add(lblDuration);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTime.setBounds(66, 260, 103, 24);
		frmAddAnEvent.getContentPane().add(lblTime);
		
	/*	JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(213, 33, 246, 20);
		frmAddAnEvent.getContentPane().add(editorPane);*/
		
		textField = new JTextField();
		textField.setBounds(213, 64, 246, 20);
		frmAddAnEvent.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 95, 246, 20);
		frmAddAnEvent.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 126, 246, 20);
		frmAddAnEvent.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(213, 157, 246, 20);
		frmAddAnEvent.getContentPane().add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(213, 263, 246, 20);
		frmAddAnEvent.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		 choice = new Choice();
		choice.setFont(new Font("Dialog", Font.PLAIN, 12));
		choice.setBounds(213, 225, 246, 22);
		frmAddAnEvent.getContentPane().add(choice);
		choice.add("1-Day");
		choice.add("2-Day");
		choice.add("3-Day");
		choice.add("4-Day");
		
		btnNewButton = new JButton("Create");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(178, 299, 133, 24);
		frmAddAnEvent.getContentPane().add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(213, 192, 246, 20);
		frmAddAnEvent.getContentPane().add(textField_4);
		frmAddAnEvent.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{ frmAddAnEvent.dispose();
		}
		}
		);
		
		btnNewButton.addActionListener(this);
		frmAddAnEvent.setResizable(false);
		frmAddAnEvent.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//date=""+dateChooser.getDate();
		//SimpleDateFormat date_format=new SimpleDateFormat("yyyy/MM/dd");
		//date_format.format(dateChooser.getDate());
		try
	      {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management","ankita","ankita");
	        Statement stmt=con.createStatement();
	          PreparedStatement ps = con.prepareStatement("Insert into event values(?,?,?,?,?,?,?)");
		    ps.setString(1,textField_2.getText());
			ps.setString(2,textField_1.getText());
			ps.setString(3,textField_4.getText());
		     ps.setString(4,choice.getSelectedItem());
		     ps.setString(5,textField_5.getText());
			ps.setString(6,textField_3.getText());
			ps.setString(7,textField.getText());
			
			
		                ps.executeUpdate();
		             //   lblNewLabel_1.setText("Request Sent");
		                
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
        textField_5.setText("");
        textField_4.setText("");
        
	}
}
