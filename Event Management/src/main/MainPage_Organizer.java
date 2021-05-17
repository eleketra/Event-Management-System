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

public class MainPage_Organizer {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage_Organizer window = new MainPage_Organizer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public MainPage_Organizer(int uno,String str) {
		initialize(uno,str);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int uno,String str) {
		Slider slider;
		Profile1 profPanel;
		Contact reachUs;
		Upcoming_Events upeve;
		Club_memdetail clubdetails;
	   Event_listforClub eveforClub;
	   Student_Registered_Detail studetails;
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
		
		JLabel lblClubName = new JLabel(str);
		lblClubName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblClubName.setForeground(Color.WHITE);
		lblClubName.setBackground(Color.BLACK);
		lblClubName.setBounds(503, 25, 210, 31);
		panel.add(lblClubName);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(10, 100, 748, 350);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
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
		
		JButton btnNewButton_2 = new JButton("Club Member Detail");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_2.setToolTipText("Club Members detail");
		
		btnNewButton_2.setBounds(10, 91, 89, 29);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Upcoming Events");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_3.setToolTipText("Upcoming Events");
		btnNewButton_3.setBounds(10, 169, 89, 28);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Events\r\n");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		
		btnNewButton_4.setBounds(10, 131, 89, 29);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Contact");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_6.setBounds(10, 248, 89, 29);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Logout");
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_7.setBounds(10, 283, 89, 28);
		panel_2.add(btnNewButton_7);
		
		JButton btnStuPart = new JButton("Student Participation");
		btnStuPart.setToolTipText("Student Participation\r\n");
		btnStuPart.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnStuPart.setBounds(10, 208, 89, 28);
		panel_2.add(btnStuPart);
		
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
		

		profPanel=new Profile1(uno);
		panel_4.add(profPanel, "profile");
		
		clubdetails = new Club_memdetail(str);
		JScrollPane myscroll=new JScrollPane(clubdetails);
		panel_4.add(myscroll, "MemberDetails");
		
		upeve=new Upcoming_Events();
		JScrollPane myscroll1=new JScrollPane(upeve);
		panel_4.add(myscroll1, "UpEvents");
		
		eveforClub =new Event_listforClub(str);
		JScrollPane myscroll2=new JScrollPane(eveforClub);
		panel_4.add(myscroll2, "event");
		
		studetails =new Student_Registered_Detail(str);
		JScrollPane myscroll3=new JScrollPane(studetails);
		panel_4.add(myscroll3, "StudentDetails");
		
		reachUs=new Contact();
		panel_4.add(reachUs, "Contact");
		
		JButton btnNewButton_9 = new JButton("All Events");
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_9.setBounds(626, 22, 89, 31);
		panel_1.add(btnNewButton_9);
		
		
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
		
		JButton btnNewButton_8 = new JButton("Create an "+"\n"+"Event");
		btnNewButton_8.setToolTipText("Create an event\r\nclick here to add a new event");
		btnNewButton_8.setBounds(626, 189, 112, 36);
		panel_1.add(btnNewButton_8);
		
		JButton btnAddMember = new JButton("Add Member");
		btnAddMember.setBounds(626, 245, 112, 36);
		panel_1.add(btnAddMember);
		
		JButton updatebtn = new JButton("Update Event");
		updatebtn.setToolTipText("Create an event\r\nclick here to add a new event");
		updatebtn.setBounds(626, 134, 112, 36);
		panel_1.add(updatebtn);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatebtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new UpdateEvent();
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
					btnAddMember.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							new Add_Member(str);
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
							new Create_event();
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		//action defined of the card decks
		btnNewButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
			      cardLayout.show(panel_4,"home");
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
					btnNewButton_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							cardLayout.show(panel_4,"MemberDetails");
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
					btnNewButton_4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							cardLayout.show(panel_4,"event");
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
					btnStuPart.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							cardLayout.show(panel_4,"StudentDetails");
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
