package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Join_Complete extends JFrame {
	public Join_Complete() {
		this.setBackground(Color.white);
		
		setLayout(null);
		
		ImageIcon mainImage = new ImageIcon("Image/mainTitle.jpg");
		Image img = mainImage.getImage();
		Image changeImg = img.getScaledInstance(120, 230, Image.SCALE_SMOOTH);
		ImageIcon main = new ImageIcon(changeImg);
		
		JLabel join = new JLabel(main);
		join.setLocation(85, 100);
		join.setSize(120, 230);
		add(join);
		
		JLabel lb = new JLabel("OO님");
		lb.setLocation(120, 350);
		lb.setSize(70, 20);
		lb.setFont(new Font("굵음", Font.BOLD, 20));
		add(lb);
		JLabel lb2 = new JLabel("회원 가입이 완료되었습니다.");
		lb2.setLocation(20, 370);
		lb2.setSize(400, 20);
		lb2.setFont(new Font("굵음", Font.BOLD, 20));
		add(lb2);
		
		JButton bt = new JButton("로그인");
		bt.setBackground(Color.red);
		bt.setLocation(100, 420);
		bt.setSize(80, 20);
		add(bt);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Join_Complete();
	}
}
