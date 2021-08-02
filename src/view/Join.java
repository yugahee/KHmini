package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Join extends JFrame{
	public Join() {
		this.setBounds(500, 100, 300, 500);
		
		// 패널 생성
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setLocation(500, 100);
		panel.setSize(300, 500);
		this.add(panel);
		// 메인 로고
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		JLabel main = new JLabel(mainImage);
		main.setLocation(5, 5);
		main.setSize(40, 60);
		panel.add(main);
		
		// Title
		JLabel join = new JLabel("멤버십 가입하고 혜택 받기");
		join.setLocation(50, 35);
		join.setSize(370, 20);
		join.setFont(new Font("굵음", Font.BOLD, 18));
		panel.add(join);
		
		// Sub Title
		JLabel join2 = new JLabel("회원 정보 입력");
		join2.setLocation(10, 75);
		join2.setSize(280, 20);
		join2.setFont(new Font("굵음", Font.BOLD, 15));
		panel.add(join2);
		
		// ID
		JLabel joinId = new JLabel("아이디 입력헤주세요(이메일)");
		joinId.setLocation(15, 100);
		joinId.setSize(300, 30);
		panel.add(joinId);
		JTextField id = new JTextField(20); /*{
			@Override
			public void setBorder(Border border) {	// 텍스트 필드 테두리 없애기
			}
		};*/
		id.setLocation(20, 130);
		id.setSize(250, 30);
		panel.add(id);
		
		// PassWard
		JLabel joinPw = new JLabel("비밀번호를 입력해주세요");
		joinPw.setLocation(15, 180);
		joinPw.setSize(300, 30);
		panel.add(joinPw);
		JTextField pw = new JTextField(20);
		pw.setLocation(20, 210);
		pw.setSize(250, 30);
		panel.add(pw);
		
		// PhoneNumber
		JLabel joinNum = new JLabel("휴대폰번호를 입력해주세요");
		joinNum.setLocation(15, 240);
		joinNum.setSize(300, 30);
		panel.add(joinNum);
		String[] ms = {"SKT", "KT", "LGU+", "알뜰"};
		JComboBox msList = new JComboBox(ms);
		msList.setLocation(20, 270);
		msList.setSize(60, 30);
		panel.add(msList);
		JTextField num = new JTextField(20);
		num.setLocation(90, 270);
		num.setSize(180, 30);
		panel.add(num);
		
		// Name
		JLabel joinName = new JLabel("닉네임을 입력해주세요");
		joinName.setLocation(15, 320);
		joinName.setSize(300, 30);
		panel.add(joinName);
		JTextField name = new JTextField(20);
		name.setLocation(20, 350);
		name.setSize(250, 30);
		panel.add(name);
		
		// Button
		JButton joinBt = new JButton("완료");
		joinBt.setBackground(new Color(184, 27, 46));
		joinBt.setLocation(100, 400);
		joinBt.setSize(60, 40);
		panel.add(joinBt);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Join();
	}
}
