package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mypage extends JFrame{
	public Mypage() {
		super("내정보");		
		this.setBounds(500, 100, 300, 600);
		
		// 내정보 패널 생성
		JPanel mypageContants = new JPanel();
		mypageContants.setLayout(null);
		mypageContants.setBackground(Color.white);
		
		// 헤더 요소 추가
		// 이미지 아이콘 추가
		//공차 메인 로고 넣기
		JLabel lbmain = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50,0);
		lbmain.setIcon(new ImageIcon(mainImage));
		lbmain.setLocation(5, -2);
		lbmain.setSize(40, 60);
		mypageContants.add(lbmain);
		
		//title 삽입
		JLabel title = new JLabel("내정보");
		title.setLocation(50, -50);
		title.setSize(500, 150);
		title.setFont(new Font("", Font.BOLD, 20));
		mypageContants.add(title);
		
		// 내 정보 내용 추가 
		// 내정보 프로필 이미지
		Image profile = new ImageIcon("image/mypage_icon.png").getImage();
		JLabel pLabel = new JLabel(new ImageIcon(profile));
		pLabel.setSize(88, 84);
		pLabel.setLocation(100, 50);
		mypageContants.add(pLabel);
		
		// 닉네임
		JLabel name = new JLabel("닉네임");
		name.setSize(300, 30);
		name.setLocation(100, 170);
		name.setFont(new Font("", Font.BOLD, 28));
		mypageContants.add(name);
		
		// 포인트 내역
		JLabel point = new JLabel("적립된 포인트 : 3,600원");
		point.setSize(300, 30);
		point.setLocation(50, 220);
		point.setFont(new Font("", Font.CENTER_BASELINE, 18));
		mypageContants.add(point);
		
		// 회원정보변경 버튼
		JButton infoChangeBtn = new JButton("회원정보변경");
		infoChangeBtn.setSize(200, 50);
		infoChangeBtn.setLocation(40, 280);
		mypageContants.add(infoChangeBtn);
		
		// 회사 소개 버튼
		JButton companyBtn = new JButton("회사소개");
		companyBtn.setSize(200, 50);
		companyBtn.setLocation(40, 350);
		mypageContants.add(companyBtn);
		
		//패널 결합		
		this.add(mypageContants, "Center");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mypage();
	}
}
