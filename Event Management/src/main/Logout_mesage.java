package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logout_mesage {

	private JFrame frmExiting;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logout_mesage window = new Logout_mesage();
					window.frmExiting.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Logout_mesage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExiting = new JFrame();
		frmExiting.getContentPane().setBackground(new Color(102, 204, 255));
		frmExiting.getContentPane().setLayout(null);
		frmExiting.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JLabel lblAreYouSure = new JLabel("Are You sure you want to exit?");
		lblAreYouSure.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblAreYouSure.setBounds(39, 11, 245, 38);
		frmExiting.getContentPane().add(lblAreYouSure);
		
		JButton btnYes = new JButton("YES");
		btnYes.setForeground(Color.WHITE);
		btnYes.setBackground(new Color(0, 0, 0));
		btnYes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		
		btnYes.setBounds(60, 60, 97, 38);
		frmExiting.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("NO");
		btnNo.setForeground(Color.WHITE);
		btnNo.setBackground(new Color(0, 0, 0));
		btnNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmExiting.dispose();
				
			}
		});
		btnNo.setBounds(189, 60, 97, 38);
		frmExiting.getContentPane().add(btnNo);
		frmExiting.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ankita Kushwaha\\Downloads\\download (1).jfif"));
		frmExiting.setTitle("Exiting");
		frmExiting.setBounds(100, 100, 372, 162);
		frmExiting.setVisible(true);
		frmExiting.setResizable(false);
		
	}
	
}
