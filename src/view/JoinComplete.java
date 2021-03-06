package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JoinComplete extends JPanel {
	public JoinComplete() {
		
		// 패널 생성
		setBackground(Color.white);
		setLayout(null);
		
		ImageIcon mainImage = new ImageIcon("Image/main.PNG");
		Image img = mainImage.getImage();
		Image changeImg = img.getScaledInstance(120, 230, Image.SCALE_SMOOTH);
		ImageIcon main = new ImageIcon(changeImg);
		
		JLabel join = new JLabel(main);
		join.setLocation(80, 50);
		join.setSize(120, 230);
		add(join);
		
		// 안내메시지
		JLabel lb = new JLabel("OO님");
		lb.setLocation(120, 280);
		lb.setSize(65, 20);
		lb.setFont(new Font("굵음", Font.BOLD, 20));
		add(lb);
		JLabel lb2 = new JLabel("회원 가입이 완료되었습니다");
		lb2.setLocation(15, 300);
		lb2.setSize(400, 20);
		lb2.setFont(new Font("굵음", Font.BOLD, 20));
		add(lb2);
		JLabel lb3 = new JLabel("공차 페이 등록하시고 적립혜택 받아보세요");
		lb3.setLocation(20, 350);
		lb3.setSize(400, 15);
		add(lb3);
		
		// 로그인 버튼 => 메인 메뉴
		JButton bt = new JButton("로그인");
		bt.setBackground(new Color(184, 27, 46));
		bt.setLocation(100, 400);
		bt.setSize(80, 20);
		add(bt);
		
		this.setVisible(true);
	}

}
