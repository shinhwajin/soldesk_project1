package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import composition.Button;
import composition.UserpageButton;
import composition.ButtonEvent;
import composition.LoginpageButton;
import composition.TextEvent;

public class FrameUserLogin extends JPanel {

	public static JTextField textId;
	public static JPasswordField textPw;
	public static JLabel labelId;
	public static JLabel labelPw;
	LoginpageButton loginicon = new LoginpageButton();

	public FrameUserLogin() {

		frame.CustomFont baemin = new frame.CustomFont();
		Font font = baemin.UserpageFont2();
		Font font2 = baemin.UserpageFont2();

		setSize(600, 800);// 프레임 크기 설정
		setLayout(null);// 레이아웃을 변경가능하게 설정
		ButtonEvent be = new ButtonEvent();

		// 로그인버튼
		UserpageButton loginbutton = new UserpageButton("로그인");
		loginbutton.setContentAreaFilled(false);
		loginbutton.setFont(font);
		loginbutton.setBounds(200, 417, 200, 68);
		loginbutton.setCursor(Button.cursor);
		loginbutton.setForeground(Color.decode("#690707"));
		be.LoginEvent(loginbutton);
		loginbutton.setCursor(Button.cursor);
		add(loginbutton);

		// 회원가입버튼
		UserpageButton signupbutton = new UserpageButton("회원가입");
		signupbutton.setContentAreaFilled(false);
		signupbutton.setFont(font);
		signupbutton.setBounds(200, 517, 200, 68);
		signupbutton.setCursor(Button.cursor);
		signupbutton.setForeground(Color.decode("#690707"));
		be.SignupEvent(signupbutton);
		signupbutton.setCursor(Button.cursor);
		add(signupbutton);

		// 로그인 텍스트박스
		textId = new JTextField();
		textId.setSize(170, 30);
		textId.setLocation(190, 235);
		textId.setOpaque(false);// 투명하게
		textId.setBorder(getBorder());// 테두리제거
		textId.setFont(font2);// 폰트 적용
		textId.setForeground(Color.decode("#690707"));

		// 비밀번호 텍스트박스
		textPw = new JPasswordField();
		Font font3 = new Font("",font.BOLD,30);
		textPw.setSize(170, 30);
		textPw.setLocation(190, 320);
		textPw.setFont(font3);
		textPw.setOpaque(false);// 투명하게
		textPw.setBorder(getBorder());// 테두리제거
		textPw.setForeground(Color.decode("#690707"));
		textPw.setEchoChar('⦁');

		labelId = new JLabel();
		labelId.setBounds(190, 205, 100, 100);
		labelId.setFont(font2);
		labelId.setForeground(Color.decode("#690707"));
		labelId.setText("아이디");
		add(labelId);
		
		labelPw = new JLabel();
		labelPw.setBounds(190, 290, 100, 100);
		labelPw.setFont(font2);
		labelPw.setForeground(Color.decode("#690707"));
		labelPw.setText("패스워드");
		add(labelPw);

		// 텍스트박스 이벤트 추가
		TextEvent te = new TextEvent();
		te.TextLoginId(textId);
		add(textId);

		// 텍스트박스 이벤트 추가
		te.TextLoginPw(textPw);
		add(textPw);
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
		// 로그인화면
		ImageIcon loginImg = new ImageIcon("./src/image/login.png");
		Image loginImg2 = loginImg.getImage();
		Image loginbg = loginImg2.getScaledInstance(300, 600, Image.SCALE_SMOOTH);
		ImageIcon changeIoginImg = new ImageIcon(loginbg);

		g.drawImage(loginbg, 150, 20, null);
		revalidate();
		repaint();
	}

}
