package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import roundedButton.RoundedButton;

public class Smoothie extends JPanel {
	
	public Smoothie() {

		//메인 panel 생성 
		setLayout(null);
		setBackground(Color.WHITE);

		//공차 메인 로고 생성
		JLabel lbmain = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50,0);
		lbmain.setIcon(new ImageIcon(mainImage));
		lbmain.setLocation(5, -2);
		lbmain.setSize(40, 60);
		add(lbmain);
		
		//Smoothie title 생성
		JLabel title = new JLabel("Smoothie");
		title.setLocation(64, -50);
		title.setSize(500,150);
		title.setFont(new Font("", Font.BOLD, 20));
		add(title);
		
		
		//메뉴 목록 생성
		String[] Smoothies = {"망고 스무디", "딸기 스무디"};
		JComboBox<String> SmoothieList = new JComboBox(Smoothies);
		SmoothieList.setSelectedIndex(0);
		SmoothieList.setLocation(160, 10);
		SmoothieList.setSize(100, 30);
		add(SmoothieList);
		
		
		//Smoothie 사진 생성
		JLabel label = new JLabel();
		Image Smoothieimage = new ImageIcon("image/Smoothie/Smoothie_01.png").getImage().getScaledInstance(90,100,0);
		label.setIcon(new ImageIcon(Smoothieimage));
		label.setLocation(90, 30);
		label.setSize(100, 150);
		add(label); //*버튼 클릭 이벤트 추가해야 함
		

		//HOT/ICED text 생성
		JLabel text = new JLabel("HOT / ICED");
		text.setLocation(20, 95);
		text.setSize(500,150);
		text.setFont(new Font("", Font.BOLD, 16));
		add(text);
		
		
		//HOT/ICED 라디오 버튼 생성
		JRadioButton Hot = new JRadioButton("HOT");
		JRadioButton Iced = new JRadioButton("ICED");
		
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(Hot);
		sizeGroup.add(Iced);
		
		Hot.setSize(60, 30);
		Hot.setLocation(60,187);
		Hot.setBackground(Color.white);
		Iced.setSize(60, 30);
		Iced.setLocation(150,187);
		Iced.setBackground(Color.white);
		add(Hot);
		add(Iced);
		
		//선긋기1
		JButton line = new JButton();
		line.setLocation(20, 221);
		line.setSize(240, 1);
		line.setBackground(Color.LIGHT_GRAY);
		add(line);
		
		//당도선택 text 생성
		JLabel text2 = new JLabel("당도선택");
		text2.setLocation(20, 165);
		text2.setSize(500,150);
		text2.setFont(new Font("", Font.BOLD, 16));
		add(text2);
		
		
		//당도선택 라디오 버튼 생성
		JRadioButton zero = new JRadioButton("0%");
		JRadioButton thirty = new JRadioButton("30%");
		JRadioButton half = new JRadioButton("50%");
		JRadioButton seventy = new JRadioButton("70%");
		JRadioButton hundred = new JRadioButton("100%");
				
		ButtonGroup sizeGroup2 = new ButtonGroup();
		sizeGroup2.add(zero);
		sizeGroup2.add(thirty);
		sizeGroup2.add(half);
		sizeGroup2.add(seventy);
		sizeGroup2.add(hundred);
				
		zero.setSize(45, 30);
		zero.setLocation(15,255);
		zero.setBackground(Color.white);
		thirty.setSize(48, 30);
		thirty.setLocation(60, 255);
		thirty.setBackground(Color.white);
		half.setSize(48, 30);
		half.setLocation(110, 255);
		half.setBackground(Color.white);
		seventy.setSize(48, 30);
		seventy.setLocation(160, 255);
		seventy.setBackground(Color.white);
		hundred.setSize(55, 30);
		hundred.setLocation(210, 255);
		hundred.setBackground(Color.white);
		
		add(zero);
		add(thirty);
		add(half);
		add(seventy);
		add(hundred);
		
		
		//선긋기2
		JButton line2 = new JButton();
		line2.setLocation(20, 290);
		line2.setSize(240, 1);
		line2.setBackground(Color.LIGHT_GRAY);
		add(line2);
		
		
		//얼음 text 생성
		JLabel text3 = new JLabel("얼음");
		text3.setLocation(20, 235);
		text3.setSize(500,150);
		text3.setFont(new Font("", Font.BOLD, 16));
		add(text3);
		
		//얼음 라디오버튼 생성
		JRadioButton less = new JRadioButton("Less");
		JRadioButton regular = new JRadioButton("Regular");
		JRadioButton full = new JRadioButton("Full");
	
		ButtonGroup sizeGroup3 = new ButtonGroup();
		sizeGroup3.add(less);
		sizeGroup3.add(regular);
		sizeGroup3.add(full);
				
		less.setSize(53, 30);
		less.setLocation(30,323);
		less.setBackground(Color.white);
		regular.setSize(70, 30);
		regular.setLocation(100, 323);
		regular.setBackground(Color.white);
		full.setSize(48, 30);
		full.setLocation(190, 323);
		full.setBackground(Color.white);
		
		add(less);
		add(regular);
		add(full);
	
		
		//뒤로가기 버튼 삽입
		JButton back = new RoundedButton("Back");
		back.setForeground(Color.white);
		back.setLocation(20,415);
		back.setSize(65,30);
		Color gongcha = new Color(184, 27, 46);
		back.setBackground(gongcha);
		add(back);
		
		//next 버튼 생성
	    JButton next = new RoundedButton("Next");
	    next.setForeground(Color.white);
	    next.setLocation(210,415);
	    next.setSize(65,30);
	    next.setBackground(gongcha);
	   	add(next);
	   	
		
		
//		//하단 메뉴 생성
//		JButton home = new JButton("HOME");
//		home.setForeground(Color.white);
//		Color a = new Color(184, 27, 46);
//		home.setBackground(a);
//		home.setLocation(1, 400);
//		home.setSize(70, 50);
//		 panel.add(home);
//		
//		
//		JButton pay = new JButton("PAY");
//		pay.setForeground(Color.white);
//		pay.setBackground(a);
//		pay.setLocation(73, 400);
//		pay.setSize(60, 50);
//		 panel.add(pay);
//		
//		JButton order = new JButton("ORDER");
//		order.setForeground(Color.white);
//		order.setBackground(a);
//		order.setLocation(135, 400);
//		order.setSize(75, 50);
//		 panel.add(order);
//		
//		JButton my = new JButton("내 정보");
//		my.setForeground(Color.white);
//		my.setBackground(a);
//		my.setLocation(212, 400);
//		my.setSize(80, 50);
//		 panel.add(my);
	
		
	}

}
