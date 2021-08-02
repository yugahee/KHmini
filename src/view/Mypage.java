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
		super("������");		
		this.setBounds(500, 100, 300, 600);
		
		// ������ �г� ����
		JPanel mypageContants = new JPanel();
		mypageContants.setLayout(null);
		mypageContants.setBackground(Color.white);
		
		// ��� ��� �߰�
		// �̹��� ������ �߰�
		//���� ���� �ΰ� �ֱ�
		JLabel lbmain = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50,0);
		lbmain.setIcon(new ImageIcon(mainImage));
		lbmain.setLocation(5, -2);
		lbmain.setSize(40, 60);
		mypageContants.add(lbmain);
		
		//title ����
		JLabel title = new JLabel("������");
		title.setLocation(50, -50);
		title.setSize(500, 150);
		title.setFont(new Font("", Font.BOLD, 20));
		mypageContants.add(title);
		
		// �� ���� ���� �߰� 
		// ������ ������ �̹���
		Image profile = new ImageIcon("image/mypage_icon.png").getImage();
		JLabel pLabel = new JLabel(new ImageIcon(profile));
		pLabel.setSize(88, 84);
		pLabel.setLocation(100, 50);
		mypageContants.add(pLabel);
		
		// �г���
		JLabel name = new JLabel("�г���");
		name.setSize(300, 30);
		name.setLocation(100, 170);
		name.setFont(new Font("", Font.BOLD, 28));
		mypageContants.add(name);
		
		// ����Ʈ ����
		JLabel point = new JLabel("������ ����Ʈ : 3,600��");
		point.setSize(300, 30);
		point.setLocation(50, 220);
		point.setFont(new Font("", Font.CENTER_BASELINE, 18));
		mypageContants.add(point);
		
		// ȸ���������� ��ư
		JButton infoChangeBtn = new JButton("ȸ����������");
		infoChangeBtn.setSize(200, 50);
		infoChangeBtn.setLocation(40, 280);
		mypageContants.add(infoChangeBtn);
		
		// ȸ�� �Ұ� ��ư
		JButton companyBtn = new JButton("ȸ��Ұ�");
		companyBtn.setSize(200, 50);
		companyBtn.setLocation(40, 350);
		mypageContants.add(companyBtn);
		
		//�г� ����		
		this.add(mypageContants, "Center");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mypage();
	}
}
