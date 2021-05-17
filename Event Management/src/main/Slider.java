package main;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class Slider  extends JPanel{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel pic;
	 Timer tm;
	 int x=0;
	 String [] list={"C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\img1.jpg",
			 "C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\img2.jpg",
			"C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\img3.jpg",
			"C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\img4.jpg",
			"C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\img5.jpg",
			"C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\img6.jpg",
			"C:\\Users\\Ankita Kushwaha\\Desktop\\project\\Event Management\\images\\img7.jpg"
			 
	 };
	 
	public Slider(){
		//super("Java slider");
		pic= new JLabel();
		pic.setBounds(10,10,430,300);
	//	SetImageSize(6);
		tm=new Timer(1500,new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				SetImageSize(x);
				x++;
				if(x>=list.length)
				{
					x=0;
				}
			}
			
		});
		add(pic);
		tm.start();
		setLayout(null);
		setSize(400,400);
		setBackground(Color.cyan);
		//setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void SetImageSize(int i)
	{
		ImageIcon icon =new ImageIcon(list[i]);
		Image img=icon.getImage();
		Image newImg= img.getScaledInstance(pic.getWidth(),pic.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newIcon= new ImageIcon(newImg);
		pic.setIcon(newIcon);
	}

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new Slider();
	}*/

}
