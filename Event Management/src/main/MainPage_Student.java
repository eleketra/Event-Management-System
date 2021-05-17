package main;

import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.*;

import java.awt.Font;
import java.awt.CardLayout;




import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MainPage_Student  {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage_Student window = new MainPage_Student();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage_Student(int uno ) {
		initialize(uno);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(int uno) {
		Slider home;
		Profile1 profPanel;
		Contact reachUs;
		Event_List1 event;
		Registered_Event reg;
		
		Club_list clist;
		frame = new JFrame();
		frame.setBounds(100, 100, 774, 490);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(10, 11, 738, 74);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Event Management System");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(45, 0, 581, 63);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(10, 96, 738, 344);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 255));
		panel_2.setBounds(10, 11, 109, 322);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(10, 11, 89, 29);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(10, 51, 89, 29);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Registered Events");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_2.setToolTipText("Registered Events");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(10, 91, 89, 29);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Upcoming Events");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_3.setToolTipText("Upcoming Events");
		btnNewButton_3.setBounds(10, 131, 89, 28);
		panel_2.add(btnNewButton_3);
		btnNewButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0)
		{
			
		}
		});
		
		JButton btnNewButton_5 = new JButton("Clubs");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5.setBounds(10, 170, 89, 29);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Contact");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_6.setBounds(10, 210, 89, 29);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Logout");
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_7.setBounds(10, 250, 89, 28);
		panel_2.add(btnNewButton_7);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(672, 305, -480, -268);
		panel_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(145, 11, 453, 322);
		panel_1.add(panel_4);
		CardLayout cardLayout = new CardLayout();
		panel_4.setLayout(cardLayout);
		
       home=new Slider();
       panel_4.add(home, "Home");
        
		profPanel=new Profile1(uno);
		panel_4.add(profPanel, "profile");
		
		reg=new Registered_Event(uno);
		JScrollPane myscroll1=new JScrollPane(reg);
		panel_4.add(myscroll1, "regEvents");
		
		
		event=new Event_List1();
		JScrollPane myscroll=new JScrollPane(event);
		panel_4.add(myscroll, "UpEvents");
		
		clist = new Club_list();
		JScrollPane myscroll3=new JScrollPane(clist);
		panel_4.add(myscroll3, "clubs");
		
		reachUs=new Contact();
		panel_4.add(reachUs, "Contact");
		
		
		//end of decks
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(30, 144, 255));
		panel_5.setBounds(613, 191, 115, 129);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("Create Club\r\n");
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_8.setBounds(10, 11, 95, 38);
		panel_5.add(btnNewButton_8);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					btnNewButton_8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new Create_org();
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		JButton btnJoinClub = new JButton("Join Club");
		btnJoinClub.setBounds(10, 80, 89, 38);
		panel_5.add(btnJoinClub);
		
		JButton btnNewButton_9 = new JButton("All Events");
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_9.setBounds(626, 22, 89, 31);
		panel_1.add(btnNewButton_9);
		
		JButton button = new JButton("Notification");
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(608, 149, 120, 31);
		panel_1.add(button);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new NotificationStudent();
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
					btnNewButton_9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new All_Events();
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		// action on cardlayout button
		btnNewButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
			      cardLayout.show(panel_4,"Home");
				}
			
			
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							cardLayout.show(panel_4,"profile");
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
					btnNewButton_5.addActionListener(new ActionListener() {
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
					btnNewButton_7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new Logout_mesage();
						//	frame.setEnabled(false);
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
							cardLayout.show(panel_4,"regEvents");
						
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

