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

public class MilkTea extends JFrame{
	
	public MilkTea() {
	
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
		
		//MilkTea title 삽입
		JLabel title = new JLabel("MilkTea");
		title.setLocation(80, -50);
		title.setSize(500,150);
		title.setFont(new Font("", Font.BOLD, 20));
		 panel.add(title);
		
		
		//메뉴 목록 넣기
		String[] MilkTeas = {"블랙 밀크티", "타로 밀크티"};
		JComboBox<String> MilkTeaList = new JComboBox(MilkTeas);
		MilkTeaList.setSelectedIndex(0);
		MilkTeaList.setLocation(160, 10);
		MilkTeaList.setSize(100, 30);
		 panel.add(MilkTeaList);
		
		
		//커피 사진 넣기
		JLabel label = new JLabel();
		Image MilkTeaimage = new ImageIcon("image/MilkTea/MilkTea_01.jpg").getImage().getScaledInstance(90,100,0);
		label.setIcon(new ImageIcon(MilkTeaimage));
		label.setLocation(90, 30);
		label.setSize(100, 150);
		panel.add(label); //*버튼 클릭 이벤트 추가해야 함
		

		//HOT/ICED text 삽입
		JLabel text = new JLabel("HOT / ICED");
		text.setLocation(20, 95);
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
		Hot.setLocation(60,187);
		Hot.setBackground(Color.white);
		Iced.setSize(60, 30);
		Iced.setLocation(150,187);
		Iced.setBackground(Color.white);
		 panel.add(Hot);
		 panel.add(Iced);
		
		//선긋기1
		JButton line = new JButton();
		line.setLocation(20, 221);
		line.setSize(240, 1);
		line.setBackground(Color.LIGHT_GRAY);
		 panel.add(line);
		
		//당도선택 text 삽입
		JLabel text2 = new JLabel("당도선택");
		text2.setLocation(20, 165);
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
		
		 panel.add(zero);
		 panel.add(thirty);
		 panel.add(half);
		 panel.add(seventy);
		 panel.add(hundred);
		
		
		//선긋기2
		JButton line2 = new JButton();
		line2.setLocation(20, 290);
		line2.setSize(240, 1);
		line2.setBackground(Color.LIGHT_GRAY);
		 panel.add(line2);
		
		
		//얼음 text 삽입
		JLabel text3 = new JLabel("얼음");
		text3.setLocation(20, 235);
		text3.setSize(500,150);
		text3.setFont(new Font("", Font.BOLD, 16));
		 panel.add(text3);
		
		//얼음 라디오버튼
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
		
		 panel.add(less);
		 panel.add(regular);
		 panel.add(full);
	
		
		//뒤로가기 버튼 삽입
		JButton back = new JButton("Back");
		back.setForeground(Color.white);
		back.setLocation(20,410);
		back.setSize(65,30);
		Color gongcha = new Color(184, 27, 46);
		back.setBackground(gongcha);
		 panel.add(back);
		
		//next 버튼 생성
	    JButton next = new JButton("Next");
	    next.setForeground(Color.white);
	    next.setLocation(200,410);
	    next.setSize(65,30);
	    next.setBackground(gongcha);
	   	 panel.add(next);
		
		

	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MilkTea();
	}

}
