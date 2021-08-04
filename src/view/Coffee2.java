package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import roundedButton.RoundedButton;

public class Coffee2 extends JPanel {
	
	public Coffee2() {

		// 메인 panel 만들기
		setLayout(null);
		setBackground(Color.WHITE);
		setLocation(500, 100);
		setSize(300, 500);

		// 공차 메인 로고 넣기
		JLabel lbmain = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50, 0);
		lbmain.setIcon(new ImageIcon(mainImage));
		lbmain.setLocation(5, -2);
		lbmain.setSize(40, 60);
		add(lbmain);

		// Coffee title 생성
		JLabel title = new JLabel("Coffee");
		title.setLocation(80, -50);
		title.setSize(500, 150);
		title.setFont(new Font("", Font.BOLD, 20));
		add(title);

		// 메뉴 목록 넣기
		String[] coffees = { "아메리카노", "카페라떼", "바닐라라떼" };
		JComboBox<String> coffeeList = new JComboBox(coffees);
		coffeeList.setBackground(Color.white);
		coffeeList.setSelectedIndex(0);
		coffeeList.setLocation(160, 10);
		coffeeList.setSize(100, 30);
		add(coffeeList);

		// 커피 사진 넣기
		JLabel label = new JLabel();
		Image coffeeimage = new ImageIcon("image/coffee/coffee_01.jpg").getImage().getScaledInstance(90, 100, 0);
		label.setIcon(new ImageIcon(coffeeimage));
		label.setLocation(90, 30);
		label.setSize(100, 150);
		add(label); // *버튼 클릭 이벤트 추가해야 함

		// 폼 text 생성
		JLabel text = new JLabel("폼(300원 추가)");
		text.setLocation(20, 95);
		text.setSize(500, 150);
		text.setFont(new Font("", Font.BOLD, 16));
		add(text);

		// 폼 체크박스 생성
		JCheckBox[] check = new JCheckBox[2];
		String[] foam = { "밀크폼", "치즈폼" };

		for (int i = 0; i < check.length; i++) {
			check[i] = new JCheckBox(foam[i]);
			add(check[i]);
		}

		check[0].setSize(70, 30);
		check[0].setLocation(55, 180);
		check[0].setBackground(Color.white);
		check[1].setSize(70, 30);
		check[1].setLocation(155, 180);
		check[1].setBackground(Color.white);

		// 선긋기1
		JButton line = new JButton();
		line.setLocation(20, 214);
		line.setSize(240, 1);
		line.setBackground(Color.LIGHT_GRAY);
		add(line);

		// 토핑 text 생성
		JLabel text2 = new JLabel("토핑(500원 추가)");
		text2.setLocation(20, 160);
		text2.setSize(500, 150);
		text2.setFont(new Font("", Font.BOLD, 16));
		add(text2);

		// 토핑 체크박스 생성
		JCheckBox[] check2 = new JCheckBox[4];
		String[] topping = { "펄", "화이트펄", "알로에", "코코넛" };

		for (int i = 0; i < check2.length; i++) {
			check2[i] = new JCheckBox(topping[i]);
			add(check2[i]);
		}

		check2[0].setSize(45, 30);
		check2[0].setLocation(18, 250);
		check2[0].setBackground(Color.white);
		check2[1].setSize(77, 30);
		check2[1].setLocation(58, 250);
		check2[1].setBackground(Color.white);
		check2[2].setSize(65, 30);
		check2[2].setLocation(136, 250);
		check2[2].setBackground(Color.white);
		check2[3].setSize(65, 30);
		check2[3].setLocation(200, 250);
		check2[3].setBackground(Color.white);

		// 선긋기2
		JButton line2 = new JButton();
		line2.setLocation(20, 284);
		line2.setSize(240, 1);
		line2.setBackground(Color.LIGHT_GRAY);
		add(line2);

		// 사이즈 text 생성
		JLabel text3 = new JLabel("사이즈");
		text3.setLocation(20, 230);
		text3.setSize(500, 150);
		text3.setFont(new Font("", Font.BOLD, 16));
		add(text3);

		// 사이즈 체크박스 생성
		JCheckBox[] check3 = new JCheckBox[2];
		String[] size = { "Small", "Large(300원 추가)" };

		for (int i = 0; i < check3.length; i++) {
			check3[i] = new JCheckBox(size[i]);
			add(check3[i]);
		}

		check3[0].setSize(63, 30);
		check3[0].setLocation(30, 315);
		check3[0].setBackground(Color.white);
		check3[1].setSize(130, 30);
		check3[1].setLocation(115, 315);
		check3[1].setBackground(Color.white);

		// 수량 text 생성
		JLabel quantity = new JLabel("수량");
		quantity.setLocation(100, 315);
		quantity.setSize(500, 150);
//	quantity.setFont(new Font("", Font.BOLD, 16));
		add(quantity);

		// 수량 spinner 생성
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 100, 1);
		JSpinner spinner = new JSpinner(numberModel);
		spinner.setLocation(135, 375);
		spinner.setSize(55, 30);
		add(spinner);

		// 가격 text 생성
		JLabel price = new JLabel(Controller.order+"원");
		price.setLocation(205, 315);
		price.setSize(500, 150);
		price.setFont(new Font("", Font.BOLD, 16));
		add(price);

		// 뒤로가기 버튼 생성
		JButton back = new RoundedButton("Back");
		back.setForeground(Color.white);
		back.setLocation(20, 415);
		back.setSize(65, 30);
		Color gongcha = new Color(184, 27, 46);
		back.setBackground(gongcha);
		add(back);

		// 장바구니 버튼 생성
		JButton choose = new RoundedButton("장바구니");
		choose.setForeground(Color.white);
		choose.setLocation(210, 415);
		choose.setSize(65, 30);
		choose.setBackground(gongcha);
		add(choose);

	}
}