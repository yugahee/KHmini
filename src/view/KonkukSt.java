package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class KonkukSt extends JPanel{
	
	KonkukSt(){
		setBackground(Color.WHITE);
		
		setLayout(null);
		
		JLabel lk1 = new JLabel("건대점");
		lk1.setLocation(30, 22);
		lk1.setSize(100, 20);
		lk1.setFont(new Font("굴림", Font.BOLD, 20));
		add(lk1);
		
		ImageIcon icon1 = new ImageIcon("image/store/konkukSt.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(230, 120, Image.SCALE_SMOOTH);
		ImageIcon konkunSt = new ImageIcon(changeImg1);

		JLabel ik1 = new JLabel(konkunSt);
		ik1.setLocation(27, 50);
		ik1.setSize(245, 130);
		add(ik1);
		
		JLabel lk2 = new JLabel("서울 광진구 화양동 5-43");
		lk2.setLocation(30, 190);
		lk2.setSize(300, 25);
		lk2.setFont(new Font("굴림", Font.BOLD, 13));
		add(lk2);
		
		JLabel lk3 = new JLabel("오시는길");
		lk3.setLocation(30, 215);
		lk3.setSize(300, 25);
		lk3.setFont(new Font("굴림", Font.BOLD, 11));
		add(lk3);
		
		JLabel lk4 = new JLabel("건대입구 2번 출구 220M, 도보 5분");
		lk4.setLocation(80, 215);
		lk4.setSize(300, 25);
		lk4.setFont(new Font("굴림", Font.PLAIN, 10));
		add(lk4);
		
		JLabel lk5 = new JLabel("매일 10 : 00 ~  23 : 00");
		lk5.setLocation(30, 245);
		lk5.setSize(300, 25);
		lk5.setFont(new Font("굴림", Font.BOLD, 10));
		add(lk5);
		
		ImageIcon pickupIcon = new ImageIcon("image/pickupbutton2.png");
		Image img2 = pickupIcon.getImage();
		Image changeImg2 = img2.getScaledInstance(220, 40, Image.SCALE_SMOOTH);
		ImageIcon pickupbutton = new ImageIcon(changeImg2);
		
		JButton btnpickup = new JButton(pickupbutton);
		btnpickup.setBorder(new EmptyBorder(20, 20, 20, 20));
		btnpickup.setBackground(Color.WHITE);
		
		btnpickup.setLocation(37, 350);
		btnpickup.setSize(220, 40);
		add(btnpickup);
	}
	
}
