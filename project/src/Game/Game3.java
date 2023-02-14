package Game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import composition.ButtonEvent;
import composition.MapButtonIcon;
import frame.CustomFont;
import frame.Images;
import frame.RoundedButton;
import frame.RoundedButton2;

public class Game3 extends JPanel  {

	public static Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

	public JLabel jlbl, jlbl2;
	public int a, b;

	public Game3() {

		setSize(600, 800);// 프레임 크기 설정
		setLayout(null);// 레이아웃을 변경가능하게 설정
		CustomFont baemin = new CustomFont();
		Font font = baemin.hwajinFont1();
		Font font2 = baemin.hwajinFont2();


		ButtonEvent be = new ButtonEvent();
		MapButtonIcon mbi = new MapButtonIcon();

		JButton backbutton = (JButton) add(mbi.BackButtonIcon());
		be.GameEvent(backbutton);
		add(backbutton);

		JLabel ilbl2 = new JLabel();
		ImageIcon e = new ImageIcon("./src/image/claw-machine2.png");
		Image f = e.getImage();
		Image g = f.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon h = new ImageIcon(g);
		ilbl2.setIcon(h);
		ilbl2.setBounds(250, 280, 100, 100);
		add(ilbl2);

		JLabel ilbl1 = new JLabel();
		ImageIcon i = new ImageIcon("./src/image/claw-machine1.png");
		Image j = i.getImage();
		Image c = j.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		ImageIcon d = new ImageIcon(c);
		ilbl1.setIcon(d);
		ilbl1.setBounds(170, 380, 250, 250);
		add(ilbl1);

		RoundedButton2 btn1 = new RoundedButton2("START");
		btn1.setContentAreaFilled(false);
		btn1.setFont(font);
		btn1.setBounds(80, 85, 90, 40);
		add(btn1);
				
		RoundedButton2 btn2 = new RoundedButton2("타이머");
		btn2.setContentAreaFilled(false);
		btn2.setFont(font);
		btn2.setBounds(80, 130, 90, 40);
		add(btn2);
		
		jlbl = new JLabel("");
		jlbl.setBounds(185, 80, 200, 50);
		jlbl.setOpaque(true); // Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		jlbl.setBackground(Color.PINK);
		jlbl.setFont(font2);
		jlbl.setHorizontalAlignment(JLabel.CENTER);
		add(jlbl);

		jlbl2 = new JLabel("");
		jlbl2.setBounds(400, 140, 150, 50);
		jlbl2.setOpaque(true); // Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		jlbl2.setBackground((new Color(204,153,255)));
		jlbl2.setFont(font2);
		jlbl2.setHorizontalAlignment(JLabel.CENTER);
		add(jlbl2);

		JLabel timer = new JLabel();
		ImageIcon timerimage = new ImageIcon("./src/image/timer2.gif");
		timer.setIcon(timerimage);
		timer.setBounds(350, 190, 255, 191);
		add(timer);


		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a = (int) (Math.random() * 9 + 1);
				b = (int) (Math.random() * 9 + 1);
				jlbl.setText(a + " x " + b + "  ???");
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Thread.sleep(2000);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				jlbl2.setText("정답 : " + (a * b));
			}
		});

	}

	public void paintComponent(Graphics g) {
		Images image = new Images();
		if (Images.bg == 1)
			g.drawImage(image.Bg1(), 0, 0, null);
		else if (Images.bg == 2)
			g.drawImage(image.Bg2(), 0, 0, null);
		else if (Images.bg == 3)
			g.drawImage(image.Bg3(), 0, 0, null);
		else if (Images.bg == 4)
			g.drawImage(image.Bg4(), 0, 0, null);
	}



}
