package main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainPage_Admin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
		
		

	/**
	 * Create the application.
	 */
	public MainPage_Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Slider slider;
		Club_list clist;
		Contact reachUs;
		Upcoming_Events upeve;
		NotificationsAdmin noti;
		frame = new JFrame();
		frame.setBounds(100, 100, 774, 490);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(10, 11, 748, 78);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Event Management System");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(10, 11, 717, 56);
		panel.add(lblNewLabel);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(10, 100, 748, 350);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 22, 109, 298);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(10, 11, 89, 29);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Clubs");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_2.setToolTipText("Registered Events");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(10, 56, 89, 29);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Upcoming Events");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_3.setToolTipText("Upcoming Events");
		btnNewButton_3.setBounds(10, 136, 89, 28);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Events\r\n");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new All_Events();
			}
		});
		btnNewButton_4.setBounds(10, 96, 89, 29);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Contact");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_6.setBounds(10, 214, 89, 29);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Logout");
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_7.setBounds(10, 254, 89, 28);
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Notifications");
		btnNewButton_8 .setToolTipText("Upcoming Events");
		btnNewButton_8 .setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_8 .setBounds(10, 175, 89, 28);
		panel_2.add(btnNewButton_8 );
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(672, 305, -480, -268);
		panel_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(145, 11, 453, 322);
		panel_1.add(panel_4);
		CardLayout cardLayout = new CardLayout();
		panel_4.setLayout(cardLayout);
		

		
		slider=new Slider();
		panel_4.add(slider, "home");
		
		clist = new Club_list();
		JScrollPane myscroll1=new JScrollPane(clist);
		panel_4.add(myscroll1, "clubs");
	
		
		upeve = new Upcoming_Events();
		JScrollPane myscroll2=new JScrollPane(upeve);
		panel_4.add(myscroll2, "UpEvents");
		
		noti=new NotificationsAdmin();
		panel_4.add(noti, "notification");
		
		reachUs = new Contact();
		panel_4.add(reachUs, "Contact");
		
		JButton btnNewButton_9 = new JButton("All Events");
		btnNewButton_9.setBounds(626, 22, 89, 31);
		panel_1.add(btnNewButton_9);
		
		//action for card decks
		btnNewButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
			      cardLayout.show(panel_4,"home");
				}
			
			
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					btnNewButton_6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							cardLayout.show(panel_4,"Contact");
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					btnNewButton_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							cardLayout.show(panel_4,"clubs");
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					btnNewButton_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							cardLayout.show(panel_4,"UpEvents");
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					btnNewButton_8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							cardLayout.show(panel_4,"notification");
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					btnNewButton_7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new Logout_mesage();
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		//code for exiting
		frame.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{ new Logout_mesage();
		}
		}
		);
		
		frame.setResizable(false);
		frame.setVisible(true);
			
	}
}
