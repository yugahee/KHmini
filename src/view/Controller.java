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
	JPanel pay = new Pay();
	JPanel store = new Store();
	JPanel konkukst = new KonkukSt();
=======
	
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
	
	
>>>>>>> a8c64026d500b67a6a675b02b1e152902e294fab
	
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
		 add(home);
		// add(title);
		// add(store);
		// add(konkukst);
=======
		add(title);
//		add(new Payment());
//		add(new Waiting());
//		add(new Pay());
//		add(new IsGongcharFirst());		//�Ϸ�
//		add(new Mypage());
//		add(new Order());
//		add(home);						//�Ϸ�
//		add(new Coffee());
//		add(new Coffee2());
>>>>>>> a8c64026d500b67a6a675b02b1e152902e294fab
		
		setResizable(false);
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(300, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
