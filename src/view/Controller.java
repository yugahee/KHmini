package view;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Controller extends JFrame{
	
	JPanel title = new Title();
	JPanel home = new Home();
<<<<<<< HEAD

//	JPanel pay = new Pay();
//	JPanel store = new Store();
//	JPanel konkukst = new KonkukSt();
//
//	JPanel hongikunivst = new HongikUnivSt();
//	JPanel gangnamst = new GangnamSt();
//	JPanel pay = new Pay();
//	JPanel store = new Store();
//	JPanel konkukst = new KonkukSt();
=======
	JPanel pay = new Pay();
	JPanel store = new Store();
	JPanel konkukst = new KonkukSt();
>>>>>>> a8687a3c19fa2dc78915180acda464daffddb56c

	
	public static int money = 50000;		// ���� �ܾ�
	public static int point = 0;			// ���� ����Ʈ
	public static int pointpay = 0;			// ��� �� ����Ʈ
	public static int order = 0;			// �ֹ��ݾ�
	public static int order2 = 0;			// ���� �� �� ���� �ݾ�
	public static String[] coffeMenu = {"�Ƹ޸�ī��", "ī���", "�ٴҶ� ī���",
										"����ũƼ", "Ÿ�� ��ũƼ", "���ݷ� ��ũƼ", "���� �׸� ��ũƼ",
										"��������", "���� �׸�Ƽ ������", "û���� ������", "���� ���ũ ������",
										"�ڽ��� �׸�Ƽ", "���Ƽ",
										"ġ�� ����ũ"};
	public static int[] coffePrice = {3500, 4000, 4500, 4500,
									4000, 4000, 4000, 4700,
									5300, 5300, 4800, 4500,
									3500, 3500,
									5700};
	
	
	
	public Controller() {
		super("Gong Cha App");
		setBounds(500, 100, 300, 500);

		
		try {
			setIconImage(ImageIO.read(new File("image/Title.jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		title.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					title.setVisible(false);
					add(home);
				}
			}
		});
		
<<<<<<< HEAD
=======


// 		add(title);
		add(home);						//�Ϸ�
// 		add(store);
// 		add(konkukst);
>>>>>>> a8687a3c19fa2dc78915180acda464daffddb56c
//		add(new Payment());
//		add(new Waiting());
//		add(new Pay());
//		add(new IsGongcharFirst());		//�Ϸ�
//		add(new Mypage());
//		add(new Order());
<<<<<<< HEAD
//		add(store);
//		add(konkukst);
//		add(hongikunivst);
//		add(gangnamst);
//		add(home);						//�Ϸ�
=======
>>>>>>> a8687a3c19fa2dc78915180acda464daffddb56c
//		add(new Coffee());
//		add(new Coffee2());
//		add(new MilkTea());
//		add(new MilkTea2());
<<<<<<< HEAD
//		add(new Smoothie());
//		add(new Smoothie2());
//		add(new Tea());
//		add(new Tea2());
//		add(new Season());
//		add(new Season2());
//		add(new Cake());
		add(new Shopping());

		
=======

>>>>>>> a8687a3c19fa2dc78915180acda464daffddb56c
		setResizable(false);
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(300, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
