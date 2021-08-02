package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mypage extends JFrame{
	public Mypage() {
		setLayout(null);		
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		JLabel lbmain = new JLabel(mainImage);
		lbmain.setLocation(5, 5);
		lbmain.setSize(40, 60);b
		add(lbmain);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mypage();
	}
}
