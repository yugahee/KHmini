package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Home extends JPanel{
	private Controller mf;
	private Home mainPage;
	
	public Home() {
		setBackground(Color.WHITE);
		
		setLayout(null);
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		JLabel lbmain = new JLabel(mainImage);
		lbmain.setLocation(5, 5);
		lbmain.setSize(40, 60);
		add(lbmain);
		JLabel lbmain2 = new JLabel("안녕하세요,");
		lbmain2.setLocation(50, 15);
		lbmain2.setSize(300, 20);
		lbmain2.setFont(new Font("돋움",Font.PLAIN,13));
		add(lbmain2);
		JLabel lbmain3 = new JLabel("공차입니다.");
		lbmain3.setLocation(50, 35);
		lbmain3.setSize(300, 20);
		lbmain3.setFont(new Font("돋움",Font.PLAIN,13));
		add(lbmain3);
		
		JLabel lbmain4 = new JLabel("이전에 주문한 메뉴");
		lbmain4.setLocation(20, 220);
		lbmain4.setSize(300, 30);
		lbmain4.setFont(new Font("돋움",Font.PLAIN,12));
		add(lbmain4);

		
		ImageIcon firstimg = new ImageIcon("image/orderimg/areyoufirst4.png"); // 현정
		JButton btnmain1 = new JButton(firstimg); 
		// JLabel firstlb = new JLabel();
		// btnmain1.add(firstlb);
		// btnmain1.setIcon(firstimg);
		
		btnmain1.setLocation(20, 80);
		btnmain1.setSize(250, 60);
		btnmain1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new IsGongcharFirst();
			}
		});
		add(btnmain1);
		
		
		ImageIcon memimg = new ImageIcon("image/orderimg/membership2.png");
		
		JButton btnmain2 = new JButton(memimg);
		btnmain2.setLocation(20, 150);
		btnmain2.setSize(250, 60);
		add(btnmain2);
		
		
		ImageIcon icon = new ImageIcon("image/smoothie/smoothie_01.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(110, 110, Image.SCALE_SMOOTH);
		ImageIcon beforeMenu = new ImageIcon(changeImg);
		
		JLabel lbmain5 = new JLabel(beforeMenu);
		lbmain5.setLocation(1, 245);
		lbmain5.setSize(120, 120);
		add(lbmain5);
		
		//ImageIcon homeicon = new ImageIcon("image/orderimg/HOME2.png");
		JButton btnmain3 = new RoundedButton("HOME");
		btnmain3.setBackground(new Color(180,45,60));
		btnmain3.setForeground(Color.white);
		btnmain3.setLocation(5, 400);
		btnmain3.setSize(70, 45);
		add(btnmain3);
		
		//ImageIcon payicon = new ImageIcon("image/orderimg/PAY2.png");
		JButton btnmain4 = new RoundedButton("PAY");
		btnmain4.setBackground(new Color(180,45,60));
		btnmain4.setForeground(Color.white);
		btnmain4.setLocation(80, 400);
		btnmain4.setSize(65, 45);
		add(btnmain4);
		
		//ImageIcon ordericon = new ImageIcon("image/orderimg/ORDER2.png");
		JButton btnmain5 = new RoundedButton("ORDER");
		btnmain5.setBackground(new Color(180,45,60));
		btnmain5.setForeground(Color.white);
		btnmain5.setLocation(150, 400);
		btnmain5.setSize(65, 45);
		add(btnmain5);
		btnmain5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Order();
			}
			
		});
		
		// ImageIcon myicon = new ImageIcon("image/orderimg/myprofile2.png");
		JButton btnmain6 = new RoundedButton("내 정보");
		// btnmain6.setFont(new Font("",Font.BOLD,13));
		btnmain6.setBackground(new Color(180,45,60));
		btnmain6.setForeground(Color.white);
		btnmain6.setLocation(220, 400);
		btnmain6.setSize(70, 45);
		add(btnmain6);
		
		
		
	}
	
	// 버튼 동그랗게 만드는 메소드
	class RoundedButton extends JButton {
	public RoundedButton() {
		super();
		decorate();
	}
	public RoundedButton(String text) {
		super(text);
		decorate();
	}
	public RoundedButton(Action action) {
		super(action);
		decorate();
	}
	public RoundedButton(Icon icon) {
		super(icon);
		decorate();
	}
	public RoundedButton(String text, Icon icon) {
		super(text, icon);
		decorate();
	}
	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		
		Graphics2D graphics = (Graphics2D) g;
		
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		if(getModel().isArmed()) {
			graphics.setColor(getBackground().darker());
		}else if (getModel().isRollover()) {
			graphics.setColor(getBackground().brighter());
		}else {
			graphics.setColor(getBackground());
		}
		graphics.fillRoundRect(0, 0, width, height, 10, 10);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(),
									graphics).getBounds();
		int textY = (height - stringBounds.height) /2+fontMetrics.getAscent();
		int textX = (width - stringBounds.width) /2;
		
		graphics.setColor(getForeground());
		graphics.setFont(getFont());
		graphics.drawString(getText(),textX,textY);
		graphics.dispose();
		
		super.paintComponent(g);
		
	}
}

	
}
