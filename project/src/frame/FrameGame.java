package frame;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FrameGame extends JPanel {

	public FrameGame() {

		setSize(600, 800);// 프레임 크기 설정
		setLayout(null);// 레이아웃을 변경가능하게 설정
		CustomFont baemin = new CustomFont();
		Font font = baemin.hwajinTitleFont();
		
		RoundedButton game1button = new RoundedButton("숫자 맞추기");
		game1button.setContentAreaFilled(false);
		game1button.setFont(font);
		game1button.setBounds(45, 50, 500, 150);
		add(game1button);
		
		RoundedButton game2button = new RoundedButton("주사위 게임");
		game2button.setContentAreaFilled(false);
		game2button.setFont(font);
		game2button.setBounds(45, 250, 500, 150);
		add(game2button);
		
		
		RoundedButton game3button = new RoundedButton("구구단 게임");
		game3button.setContentAreaFilled(false);
		game3button.setFont(font);
		game3button.setBounds(45, 450, 500, 150);
		add(game3button);
		
		game1button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "game1");
			}
		});
		game2button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "game2");
			}
		});
		game3button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "game3");
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
