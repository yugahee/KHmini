package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import roundedButton.RoundedButton;

public class Shopping extends JPanel {
	
	public Shopping() {

		//메인 panel 만들기 
		setLayout(null);
		setBackground(Color.WHITE);

		//공차 메인 로고 넣기
		JLabel lbmain = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50,0);
		lbmain.setIcon(new ImageIcon(mainImage));
		lbmain.setLocation(5, -2);
		lbmain.setSize(40, 60);
		add(lbmain);
		
		//장바구니 title 생성
		JLabel title = new JLabel("장바구니");
		title.setLocation(55, -47);
		title.setSize(500,150);
		title.setFont(new Font("", Font.BOLD, 22));
		add(title);
		
		//매장 검색 버튼 생성
		String text = "주문할 매장을 선택해 주세요";
		JButton button = new JButton(text);
		button.setFont(new Font("", Font.BOLD, 15));
		button.setSize(270, 33);
		button.setLocation(12, 65);
		Color gongcha = new Color(184, 27, 46);
		button.setBackground(new Color(240,240,240));
		add(button);
		
		
		//제품 사진 생성
		JLabel label = new JLabel();
		Image MilkTeaimage = new ImageIcon("image/MilkTea/MilkTea_01.jpg").getImage().getScaledInstance(80,90,0);
		label.setIcon(new ImageIcon(MilkTeaimage));
		label.setLocation(20, 90);
		label.setSize(100, 150);
		add(label); 
		

		//제품 이름
		JLabel name = new JLabel("블랙 밀크티");
		name.setLocation(106, 55);
		name.setSize(500,150);
		name.setFont(new Font("", Font.BOLD, 13));
		add(name);
		
		//주문 내역
		String order = "ICED | Less | 30% | 밀크폼 | 코코넛";
		JLabel order2 = new JLabel(order);
		order2.setLocation(108, 0);
		order2.setSize(300, 300);
		order2.setFont(new Font("", Font.PLAIN, 11));
		add(order2);
		
		//가격
		String price = "4,400원";
		JLabel price2 = new JLabel(price);
		price2.setLocation(108, 18);
		price2.setSize(300, 300);
		price2.setFont(new Font("", Font.PLAIN, 11));
		add(price2);
		
		
		// 수량 spinner 생성
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 100, 1);
		JSpinner spinner = new JSpinner(numberModel);
		spinner.setLocation(106, 181);
		spinner.setSize(55, 22);
		add(spinner);
		
		// 선긋기
		JButton line = new JButton();
		line.setLocation(18, 214);
		line.setSize(254, 1);
		line.setBackground(Color.LIGHT_GRAY);
		add(line);
		
		
		//pink 하단 패널
		JPanel pink = new JPanel();
		pink.setLayout(null);
		Color light = new Color(244,230,230);
		pink.setBackground(light);
		pink.setSize(300, 88);
		pink.setLocation(0, 379);
		add(pink);
		
		
		// 가격 text 생성
		JLabel all = new JLabel(Controller.order+"원");
		all.setLocation(240, 2);
		all.setSize(50, 50);
		all.setFont(new Font("", Font.BOLD, 20));
		pink.add(all);
		
		// 총 건수 생성
		JLabel cases = new JLabel("총 2건");
		cases.setLocation(17,1);
		cases.setSize(50, 50);
		cases.setFont(new Font("", Font.BOLD, 14));
		pink.add(cases);
		
		
		// 주문하기 버튼 생성
		JButton choose = new RoundedButton("주문하기");
		choose.setForeground(Color.white);
		choose.setLocation(90, 50);
		choose.setSize(100, 24);
		choose.setFont(new Font("", Font.BOLD, 13));
		choose.setBackground(gongcha);
		pink.add(choose);
		
		
				
				
		
	}
}
