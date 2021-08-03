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
	JPanel pay = new Pay();
	JPanel coffee = new Coffee();
	
	
	
	public Controller() {
		super("Gong Cha App");
		setBounds(500, 100, 300, 500);
		
		int money = 50000;
		String format = String.format("%,d", money);
		
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
		
		
		add(title);
		add(new Coffee());

		
		setResizable(false);
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(300, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
