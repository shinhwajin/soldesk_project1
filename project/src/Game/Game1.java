package Game;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import composition.ButtonEvent;
import composition.MapButtonIcon;
import frame.Images;
import frame.RoundedButton2;

public class Game1 extends JPanel {

	private JTextField text;
	private JLabel label, label1;
	int a;

	public Game1() {
		setSize(600, 800);// 프레임 크기 설정
		setLayout(null);// 레이아웃을 변경가능하게 설정

		JLabel ilbl = new JLabel();
		ImageIcon a1 = new ImageIcon("./src/image/numbergame.png");
		Image b = a1.getImage();
		Image c = b.getScaledInstance(460, 200, Image.SCALE_SMOOTH);
		ImageIcon d = new ImageIcon(c);
		ilbl.setIcon(d);
		ilbl.setBounds(70, 50, 460, 200);
		add(ilbl);

		JLabel ilbl4 = new JLabel();
		ImageIcon image41 = new ImageIcon("./src/image/numbers.png");
		Image image42 = image41.getImage();
		Image image43 = image42.getScaledInstance(450, 200, Image.SCALE_SMOOTH);
		ImageIcon image44 = new ImageIcon(image43);
		ilbl4.setIcon(image44);
		ilbl4.setBounds(70, 440, 450, 200);
		add(ilbl4);

		frame.CustomFont baemin = new frame.CustomFont();
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		Font font1 = baemin.hwajinFont1();
		Font font2 = baemin.hwajinFont2();

		ButtonEvent be = new ButtonEvent();
		MapButtonIcon mbi = new MapButtonIcon();
		JButton backbutton = (JButton) add(mbi.BackButtonIcon());
		be.GameEvent(backbutton);
		add(backbutton);

		RoundedButton2 button = new RoundedButton2("Check!");
		button.setContentAreaFilled(false);
		button.setFont(font);
		button.setBounds(253, 349, 100, 50);
		add(button);
		text = new JTextField("");
		text.setBounds(100, 350, 150, 50);
		add(text);
		label1 = new JLabel("숫자 맞추면 통과! 틀리면 땡~!!");
		label1.setBounds(80, 245, 500, 100);
		label1.setFont(font2);
		add(label1);
		label = new JLabel("1 ~ 5 숫자를 입력하세요.");
		label.setBounds(100, 380, 300, 80);
		label.setFont(font1);
		add(label);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int answer = (int) (Math.random() * 5 + 1);
				try {
					if (Integer.parseInt(text.getText()) < 0 || Integer.parseInt(text.getText()) > 5)
						JOptionPane.showMessageDialog(null, "1 ~ 5 숫자!!!");
					else {
						a = Integer.parseInt(text.getText());
						if (answer == a)
							label.setText("통과!");
						else
							label.setText("땡!! 정답은 : " + answer);
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "1 ~ 5 숫자로 입력하세요");
				}
			}
		});
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					int answer = (int) (Math.random() * 5 + 1);
					try {
						if (Integer.parseInt(text.getText()) < 0 || Integer.parseInt(text.getText()) > 5)
							JOptionPane.showMessageDialog(null, "1 ~ 5 숫자!!!");
						else {
							a = Integer.parseInt(text.getText());
							if (answer == a)
								label.setText("통과!");
							else
								label.setText("땡!! 정답은 : " + answer);
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "1 ~ 5 숫자로 입력하세요");
					}
				}
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
