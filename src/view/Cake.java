package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import roundedButton.RoundedButton;

public class Cake extends JPanel {
	
	public Cake() {

		//메인 panel 생성 
		setLayout(null);
		setBackground(Color.WHITE);

		// 공차 메인 로고 생성
		JLabel lbmain = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50, 0);
		lbmain.setIcon(new ImageIcon(mainImage));
		lbmain.setLocation(5, -2);
		lbmain.setSize(40, 60);
		add(lbmain);

		// Cake title 생성
		JLabel title = new JLabel("Bakery");
		title.setLocation(80, -50);
		title.setSize(500, 150);
		title.setFont(new Font("", Font.BOLD, 20));
		add(title);
		
		// Cake information 생성
		String infor = "<html>사워 크림의 상큼함과 진한 치즈의 맛을 동시에 <br>맛볼 수 있는 케이크 입니다.</html>";
		JLabel infor2 = new JLabel(infor);
		infor2.setLocation(25, 98);
		infor2.setSize(300, 150);
		infor2.setFont(new Font("", Font.PLAIN, 11));
		add(infor2);
		
		
		// 선긋기1
		JButton line = new JButton();
		line.setLocation(20, 196);
		line.setSize(240, 1);
		line.setBackground(Color.LIGHT_GRAY);
		add(line);
		
		
		//제품영양정보 text 생성
		JLabel text = new JLabel("제품 영양 정보");
		text.setLocation(23, 136);
		text.setSize(500,150);
		text.setFont(new Font("", Font.BOLD, 13));
		add(text);
		
		
		//제품 영양 정보 내용 생성
		String explain = "<html>칼로리&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;550kcal"
				+ "<br>당류&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 26g"
				+ "<br>나트륨&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;435mg"
				+ "<br>단백질&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7g<br>"
				+ "포화지방&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;25g</html>";
		JLabel explain2 = new JLabel(explain);
		explain2.setLocation(25, 115);
		explain2.setSize(300, 300);
		explain2.setFont(new Font("", Font.PLAIN, 11));
		add(explain2);
		
		
		// 선긋기2
		JButton line2 = new JButton();
		line2.setLocation(20, 314);
		line2.setSize(240, 1);
		line2.setBackground(Color.LIGHT_GRAY);
		add(line2);
		
		//알레르기 유발 요인 text 생성
		JLabel all = new JLabel("알레르기 유발 요인");
		all.setLocation(23, 256);
		all.setSize(500,150);
		all.setFont(new Font("", Font.BOLD, 13));
		add(all);
		
		//알레르기 유발 요인 내용 생성
		String alltext = "우유, 난류, 밀, 아황산류";
		JLabel alltext2 = new JLabel(alltext);
		alltext2.setLocation(25, 202);
		alltext2.setSize(300, 300);
		alltext2.setFont(new Font("", Font.PLAIN, 11));
		add(alltext2);

		

		// 메뉴 목록 생성
		String[] Cakes = {"치즈 케이크", "초코 케이크"};
		JComboBox<String> CakeList = new JComboBox(Cakes);
		CakeList.setBackground(Color.white);
		CakeList.setSelectedIndex(0);
		CakeList.setLocation(160, 10);
		CakeList.setSize(100, 30);
		add(CakeList);
		
		//Cake 사진 생성
		JLabel label = new JLabel();
		Image Cakeimage = new ImageIcon("image/Bakery/Cake_01.jpg").getImage().getScaledInstance(90,100,0);
		label.setIcon(new ImageIcon(Cakeimage));
		label.setLocation(90, 30);
		label.setSize(100, 150);
		add(label); // *버튼 클릭 이벤트 추가해야 함

		

		

		

	

		
	

		// 수량 text 생성
		JLabel quantity = new JLabel("수량");
		quantity.setLocation(100, 310);
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