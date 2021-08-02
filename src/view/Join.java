package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Join extends JFrame{
	public Join() {
		this.setBackground(Color.WHITE);
		
		setLayout(null);
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		JLabel main = new JLabel(mainImage);
		main.setLocation(5, 5);
		main.setSize(40, 60);
		add(main);
		
		JLabel join = new JLabel("����� �����ϰ� ���ùޱ�");
		join.setLocation(50, 35);
		join.setSize(370, 20);
		join.setFont(new Font("����", Font.BOLD, 20));
		add(join);
		JLabel join2 = new JLabel("ȸ�� ���� �Է�");
		join2.setLocation(10, 80);
		join2.setSize(280, 20);
		join2.setFont(new Font("����", Font.BOLD, 20));
		add(join2);
		
		JLabel joinId = new JLabel("���̵� �Է����ּ���(�̸���)");
		joinId.setLocation(15, 120);
		joinId.setSize(300, 30);
		add(joinId);
		JTextField id = new JTextField(20);
		id.setLocation(20, 150);
		id.setSize(250, 30);
		add(id);
		
		JLabel joinPw = new JLabel("��й�ȣ�� �Է����ּ���");
		joinPw.setLocation(15, 200);
		joinPw.setSize(300, 30);
		add(joinPw);
		JTextField pw = new JTextField(20);
		pw.setLocation(20, 230);
		pw.setSize(250, 30);
		add(pw);
		
		JLabel joinNum = new JLabel("�޴�����ȣ�� �Է����ּ���");
		joinNum.setLocation(15, 280);
		joinNum.setSize(300, 30);
		add(joinNum);
		String[] ms = {"SKT", "KT", "LGU+", "�˶�"};
		JComboBox msList = new JComboBox(ms);
		msList.setLocation(20, 310);
		msList.setSize(60, 30);
		add(msList);
		JTextField num = new JTextField(20);
		num.setLocation(90, 310);
		num.setSize(180, 30);
		add(num);
		
		JLabel joinName = new JLabel("�г����� �Է����ּ���");
		joinName.setLocation(15, 360);
		joinName.setSize(300, 30);
		add(joinName);
		JTextField name = new JTextField(20);
		name.setLocation(20, 390);
		name.setSize(250, 30);
		add(name);
		
		JButton joinBt = new JButton("�Ϸ�");
		joinBt.setBackground(Color.red);
		joinBt.setLocation(100, 450);
		joinBt.setSize(60, 40);
		add(joinBt);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Join();
	}
}
