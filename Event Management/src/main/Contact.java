package main;
import java.awt.*;
import javax.swing.*;
public class Contact extends JPanel {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public	Contact(){
	
	setBackground(Color.pink);
    setBounds(100, 100, 506, 359);
    setLayout(null);
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ankita Kushwaha\\Downloads\\contact-icon.png"));
	lblNewLabel.setBounds(164, 11, 138, 135);
     add(lblNewLabel);
	
	JPanel panel = new JPanel();
	panel.setBounds(10, 157, 430, 152);
	add(panel);
	panel.setLayout(null);
	
	JLabel lblNewLabel_1 = new JLabel("Phone Number        :");
	lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
	lblNewLabel_1.setBounds(51, 27, 143, 26);
	panel.add(lblNewLabel_1);
	
	JLabel label = new JLabel("***** *****\r\n");
	label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
	label.setBounds(216, 27, 143, 26);
	panel.add(label);
	
	JLabel lblEmail = new JLabel("Email                   :");
	lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
	lblEmail.setBounds(51, 64, 143, 26);
	panel.add(lblEmail);
	
	JLabel lblAbcgmailcom = new JLabel("abc@gmail.com\r\n");
	lblAbcgmailcom.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
	lblAbcgmailcom.setBounds(216, 64, 143, 26);
	panel.add(lblAbcgmailcom);
	
	JLabel lblAddress = new JLabel("Address             :");
	lblAddress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
	lblAddress.setBounds(51, 101, 143, 26);
	panel.add(lblAddress);
	
	JLabel lblClementTowndehradun = new JLabel("Clement Town,dehradun\r\n");
	lblClementTowndehradun.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
	lblClementTowndehradun.setBounds(216, 101, 194, 26);
	panel.add(lblClementTowndehradun);
	add(panel);
	setVisible(true);
    
 }
 

}
