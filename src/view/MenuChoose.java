package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MenuChoose extends JFrame{
	
	public MenuChoose() {
	
		this.setBounds(500, 100, 300, 500);
		
		//메인 panel 만들기 
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setLocation(500, 100);
		panel.setSize(300, 500);
		this.add(panel);
		
		//공차 메인 로고 넣기
		JLabel lbmain = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50,0);
		lbmain.setIcon(new ImageIcon(mainImage));
		lbmain.setLocation(5, -2);
		lbmain.setSize(40, 60);
		panel.add(lbmain);
		
		//Coffee title 삽입
		JLabel title = new JLabel("Coffee");
		title.setLocation(80, -50);
		title.setSize(500,150);
		title.setFont(new Font("", Font.BOLD, 20));
		panel.add(title);
		
		
		//메뉴 목록 넣기
		String[] coffees = {"아메리카노", "카페라떼", "바닐라라떼"};
		JComboBox<String> coffeeList = new JComboBox(coffees);
		coffeeList.setSelectedIndex(0);
		coffeeList.setLocation(160, 10);
		coffeeList.setSize(100, 30);
		panel.add(coffeeList);
		
		
		//커피 사진 넣기
		JLabel label = new JLabel();
		Image coffeeimage = new ImageIcon("image/coffee/coffee_01.jpg").getImage().getScaledInstance(90,90,0);
		label.setIcon(new ImageIcon(coffeeimage));
		label.setLocation(90, 20);
		label.setSize(100, 150);
		panel.add(label); //*버튼 클릭 이벤트 추가해야 함
		

		//HOT/ICED text 삽입
		JLabel text = new JLabel("HOT/ICED");
		text.setLocation(20, 72);
		text.setSize(500,150);
		text.setFont(new Font("", Font.BOLD, 16));
		panel.add(text);
		
		
		//HOT/ICED 라디오 버튼 삽입
		JRadioButton Hot = new JRadioButton("HOT");
		JRadioButton Iced = new JRadioButton("ICED");
		
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(Hot);
		sizeGroup.add(Iced);
		
		Hot.setSize(60, 30);
		Hot.setLocation(60,170);
		Iced.setSize(60, 30);
		Iced.setLocation(150,170);
		panel.add(Hot);
		panel.add(Iced);
		
		
		//당도선택 text 삽입
		JLabel text2 = new JLabel("당도선택");
		text2.setLocation(20, 152);
		text2.setSize(500,150);
		text2.setFont(new Font("", Font.BOLD, 16));
		panel.add(text2);
		
		
		//당도선택 라디오 버튼 삽입
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
		zero.setLocation(15,250);
		thirty.setSize(48, 30);
		thirty.setLocation(65, 250);
		half.setSize(48, 30);
		half.setLocation(115, 250);
		seventy.setSize(48, 30);
		seventy.setLocation(165, 250);
		hundred.setSize(55, 30);
		hundred.setLocation(215, 250);
		
		panel.add(zero);
		panel.add(thirty);
		panel.add(half);
		panel.add(seventy);
		panel.add(hundred);
		
		
		//얼음 text 삽입
		JLabel text3 = new JLabel("얼음");
		text3.setLocation(20, 228);
		text3.setSize(500,150);
		text3.setFont(new Font("", Font.BOLD, 16));
		panel.add(text3);
		
		//얼음 라디오버튼
		JRadioButton less = new JRadioButton("Less");
		JRadioButton regular = new JRadioButton("Regular");
		JRadioButton full = new JRadioButton("Full");
	
		ButtonGroup sizeGroup3 = new ButtonGroup();
		sizeGroup2.add(less);
		sizeGroup2.add(regular);
		sizeGroup2.add(full);
				
		less.setSize(53, 30);
		less.setLocation(30,320);
		regular.setSize(70, 30);
		regular.setLocation(100, 320);
		full.setSize(48, 30);
		full.setLocation(190, 320);
		
		panel.add(less);
		panel.add(regular);
		panel.add(full);
	
		
		//하단 메뉴 삽입
		JButton home = new JButton("HOME");
		home.setForeground(Color.white);
		Color a = new Color(184, 27, 46);
		home.setBackground(a);
		home.setLocation(1, 400);
		home.setSize(70, 50);
		panel.add(home);
		
		
		JButton pay = new JButton("PAY");
		pay.setForeground(Color.white);
		pay.setBackground(a);
		pay.setLocation(73, 400);
		pay.setSize(60, 50);
		panel.add(pay);
		
		JButton order = new JButton("ORDER");
		order.setForeground(Color.white);
		order.setBackground(a);
		order.setLocation(135, 400);
		order.setSize(75, 50);
		panel.add(order);
		
		JButton my = new JButton("내 정보");
		my.setForeground(Color.white);
		my.setBackground(a);
		my.setLocation(212, 400);
		my.setSize(80, 50);
		panel.add(my);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MenuChoose();
	}

}
