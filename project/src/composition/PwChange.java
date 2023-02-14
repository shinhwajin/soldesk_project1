package composition;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import frame.FrameUserSignup;
import frame.Images;

public class PwChange extends JFrame {

	public static JTextField oldPw;
	public static JTextField newPw;
	public static JTextField newPw2;
	public static JLabel labelErrorPw2 = new JLabel("비밀번호가 일치하지 않습니다.");

	public PwChange() {

		setSize(280, 300);
		setLayout(null);
		setVisible(true);// 프레임 보이게
		setResizable(false);// 크기조절불가
		setLocationRelativeTo(null);// 프레임이 화면 중앙에 나옴

		Panel();

	}

	public void Panel() {
		frame.CustomFont baemin = new frame.CustomFont();
		Font font2 = baemin.UserpageFont2();
		Font font3 = baemin.UserpageErrorFont();

		JPanel panel = new JPanel();

		setTitle("비밀번호 변경");
		ImageIcon titleImg = new ImageIcon("./src/image/title.png");
		Image image = titleImg.getImage();// 타이틀 이미지
		setIconImage(image);// 타이틀 이미지 추가

		oldPw = new JPasswordField();
		newPw = new JPasswordField();
		newPw2 = new JPasswordField();

		oldPw.setBounds(10, 40, 200, 30);
		newPw.setBounds(10, 110, 200, 30);
		newPw2.setBounds(10, 180, 200, 30);

		JLabel labelOldPw = new JLabel();
		labelOldPw.setBounds(10, 10, 150, 30);
		labelOldPw.setFont(font2);
		labelOldPw.setForeground(Color.decode("#690707"));
		labelOldPw.setText("현재 비밀번호");
		add(labelOldPw);

		JLabel labelNewPw = new JLabel();
		labelNewPw.setBounds(10, 80, 150, 30);
		labelNewPw.setFont(font2);
		labelNewPw.setForeground(Color.decode("#690707"));
		labelNewPw.setText("변경할 비밀번호");
		add(labelNewPw);

		JLabel labelNewPw2 = new JLabel();
		labelNewPw2.setBounds(10, 150, 200, 30);
		labelNewPw2.setFont(font2);
		labelNewPw2.setForeground(Color.decode("#690707"));
		labelNewPw2.setText("변경할 비밀번호 확인");
		add(labelNewPw2);

		labelErrorPw2.setForeground(Color.red);
		labelErrorPw2.setBounds(15, 210, 130, 15);
		labelErrorPw2.setFont(font3);
		labelErrorPw2.setVisible(false);
		add(labelErrorPw2);

		UserpageButton button = new UserpageButton("확인");
		button.setBounds(180, 220, 70, 30);
		button.setVisible(true);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				UserSave us = new UserSave();
				try {
					us.PwChange();
					dispose();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});

		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (newPw.getText().equals(newPw2.getText())) {
					labelErrorPw2.setVisible(false);
				} else {
					labelErrorPw2.setVisible(true);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (newPw.getText().equals(newPw2.getText())) {
					labelErrorPw2.setVisible(false);
				} else {
					labelErrorPw2.setVisible(true);
				}

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (newPw.getText().equals(newPw2.getText())) {
					labelErrorPw2.setVisible(false);
				} else {
					labelErrorPw2.setVisible(true);
				}

			}
		};
		newPw2.addKeyListener(listener);
		add(button);

		add(oldPw);
		add(newPw);
		add(newPw2);

		revalidate();
		repaint();
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
