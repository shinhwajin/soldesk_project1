package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import composition.Button;
import composition.ButtonEvent;
import composition.LoginpageButton;
import composition.PwChange;
import composition.UserSave;
import composition.UserpageButton;
import main.main;

public class FrameUser extends JPanel {

	public static JButton loginbutton;
	public static JTextField textId = new JTextField();
	public static JPasswordField textPw = new JPasswordField();

	public FrameUser() {
		
		frame.CustomFont baemin = new frame.CustomFont();
		Font font = baemin.UserpageFont();
		Font font2 = baemin.UserpageFont2();
		
		setSize(600, 800);// 프레임 크기 설정
		setLayout(null);// 레이아웃을 변경가능하게 설정

		ImageIcon homeImg = new ImageIcon("./src/image/user3.png");// 이미지 가져오기
		Image homeImg2 = homeImg.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagehome = homeImg2.getScaledInstance(200, 200, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
		
		JButton button = new JButton(changehomeImg);
		button.setBounds(30, 30, 200, 200);
		button.setVisible(true);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);// 버튼 테두리 제거
		button.setFocusPainted(false);// 선택데두리 제거
		add(button);
		
		JLabel idlabel = new JLabel("  "+UserSave.id+"님");
		idlabel.setBounds(230, 30, 330, 30);
		idlabel.setVisible(true);
		idlabel.setFont(font2);
		idlabel.setOpaque(true);
		idlabel.setBackground(Color.white);
		add(idlabel);
		
		JLabel idlabel2 = new JLabel();
		idlabel2.setBounds(230, 60, 330, 170);
		idlabel2.setVisible(true);
		idlabel2.setFont(font2);
		idlabel2.setOpaque(true);
		idlabel2.setBackground(Color.white);
		add(idlabel2);
		
		
		
		
		
		JButton logoutbutton = new UserpageButton("로그아웃");
		logoutbutton.setContentAreaFilled(false);
		logoutbutton.setFont(font);
		logoutbutton.setBounds(200, 550, 200, 68);
		logoutbutton.setCursor(Button.cursor);
		logoutbutton.setForeground(Color.decode("#690707"));
		logoutbutton.setBackground(Color.getHSBColor(233, 189, 242));
		logoutbutton.setCursor(Button.cursor);
		add(logoutbutton);
		
		logoutbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {// 버튼을 눌렀을때 로그아웃됨
				FrameBase.success = 0;
				UserSave us = new UserSave();
				us.LogOut();
			}
		});

		JButton changebutton = new UserpageButton("배경 변경");
		changebutton.setContentAreaFilled(false);
		changebutton.setFont(font);
		changebutton.setBounds(200, 400, 200, 68);
		changebutton.setCursor(Button.cursor);
		changebutton.setForeground(Color.decode("#690707"));
		changebutton.setBackground(Color.getHSBColor(233, 189, 242));
		changebutton.setCursor(Button.cursor);
		add(changebutton);

		changebutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {// 버튼을 눌렀을때 배경을 순서대로 변경
				Images.bg++;
				revalidate();
				repaint();
				if (Images.bg == 5) {
					Images.bg = 1;
					revalidate();
					repaint();
				}
			}
		});

		// 비밀번호 변경
		JButton qna = new UserpageButton("비밀번호 변경");
		qna.setContentAreaFilled(false);
		qna.setFont(font);
		qna.setBounds(200, 250, 200, 68);
		qna.setCursor(Button.cursor);
		qna.setForeground(Color.decode("#690707"));
		qna.setBackground(Color.getHSBColor(233, 189, 242));
		qna.setCursor(Button.cursor);
		add(qna);
		
		qna.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {	
				new PwChange();
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
