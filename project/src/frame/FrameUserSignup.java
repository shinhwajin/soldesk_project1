package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

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

public class FrameUserSignup extends JPanel {

	private static LoginpageButton signupicon = new LoginpageButton();
	public static JButton signupbutton;
	public static JTextField textsignupId = new JTextField();
	public static JPasswordField textsignupPw = new JPasswordField();
	public static JPasswordField textsignupPw2 = new JPasswordField();
	public static JTextField textsignupBirthday = new JTextField();
	public static JLabel labelErrorId = new JLabel("아이디는 알파벳과 숫자, 3~16글자로 이루어져야 합니다.");
	public static JLabel labelErrorPw = new JLabel("비밀번호는 4글자 이상이어야 합니다.");
	public static JLabel labelErrorPw2 = new JLabel("비밀번호가 일치하지 않습니다.");
	public static JLabel labelErrorBrithday = new JLabel("생년월일이 올바르지 않습니다. ex) 20230101");
	public static JLabel labelId;
	public static JLabel labelPw;
	public static JLabel labelPw2;
	public static JLabel labelBrithday;

	public FrameUserSignup() {

		frame.CustomFont baemin = new frame.CustomFont();
		Font font = baemin.UserpageFont();
		Font font2 = baemin.UserpageFont2();
		Font font3 = baemin.UserpageErrorFont();

		setSize(600, 800);// 프레임 크기 설정
		setLayout(null);// 레이아웃을 변경가능하게 설정
		// 라벨
		labelId = new JLabel();
		labelId.setBounds(190, 120, 100, 100);
		labelId.setFont(font2);
		labelId.setForeground(Color.decode("#690707"));
		labelId.setText("아이디");

		add(labelId);
		labelPw = new JLabel();
		labelPw.setBounds(190, 200, 100, 100);
		labelPw.setFont(font2);
		labelPw.setForeground(Color.decode("#690707"));
		labelPw.setText("비밀번호");
		add(labelPw);

		labelPw2 = new JLabel();
		labelPw2.setBounds(190, 280, 150, 100);
		labelPw2.setFont(font2);
		labelPw2.setForeground(Color.decode("#690707"));
		labelPw2.setText("비밀번호 확인");
		add(labelPw2);

		labelBrithday = new JLabel();
		labelBrithday.setBounds(190, 360, 150, 100);
		labelBrithday.setFont(font2);
		labelBrithday.setForeground(Color.decode("#690707"));
		labelBrithday.setText("생년월일");
		add(labelBrithday);

		// 회원가입버튼
		ButtonEvent be = new ButtonEvent();
		signupbutton = new UserpageButton("회원가입");
		signupbutton.setContentAreaFilled(false);
		signupbutton.setFont(font);
		signupbutton.setBounds(200, 500, 200, 68);
		signupbutton.setCursor(Button.cursor);
		signupbutton.setForeground(Color.decode("#690707"));
		signupbutton.setBackground(Color.getHSBColor(233, 189, 242));
		be.Signup2Event(signupbutton);
		signupbutton.setCursor(Button.cursor);
		add(signupbutton);

		// 회원가입 아이디 텍스트박스
		Font fontsignup = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		textsignupId.setSize(170, 30);
		textsignupId.setLocation(193, 149);
		textsignupId.setOpaque(false);// 투명하게
		textsignupId.setBorder(getBorder());// 테두리제거
		textsignupId.setFont(fontsignup);// 폰트 적용

		// 회원가입 아이디 텍스트박스 이벤트 추가
		TextEvent te = new TextEvent();
		te.TextSignupId(textsignupId);
		add(textsignupId);

		// 아이디 3글자 미만
		labelErrorId.setForeground(Color.red);
		labelErrorId.setBounds(193, 190, 250, 15);
		labelErrorId.setFont(font3);
		labelErrorId.setVisible(false);
		add(labelErrorId);

		// 회원가입 비밀번호 텍스트박스

		textsignupPw.setSize(170, 30);
		textsignupPw.setLocation(193, 235);
		textsignupPw.setOpaque(false);// 투명하게
		textsignupPw.setBorder(getBorder());// 테두리제거
		textsignupPw.setFont(fontsignup);// 폰트 적용
		textsignupPw.setEchoChar('⦁');

		// 회원가입 비밀번호 텍스트박스 이벤트 추가
		te.TextSignupPw(textsignupPw);
		add(textsignupPw);

		// 비밀번호 4글자 미만
		labelErrorPw.setForeground(Color.red);
		labelErrorPw.setBounds(193, 272, 170, 15);
		labelErrorPw.setFont(font3);
		labelErrorPw.setVisible(false);
		add(labelErrorPw);

		// 회원가입 비밀번호 확인 텍스트박스

		textsignupPw2.setSize(170, 30);
		textsignupPw2.setLocation(193, 317);
		textsignupPw2.setOpaque(false);// 투명하게
		textsignupPw2.setBorder(getBorder());// 테두리제거
		textsignupPw2.setFont(fontsignup);// 폰트 적용
		textsignupPw2.setEchoChar('⦁');

		// 회원가입 비밀번호 확인 이벤트 추가
		te.TextSignupPw2(textsignupPw2);
		add(textsignupPw2);

		// pw pw2불일치일 경우
		labelErrorPw2.setForeground(Color.red);
		labelErrorPw2.setBounds(193, 350, 130, 15);
		labelErrorPw2.setFont(font3);
		labelErrorPw2.setVisible(false);
		add(labelErrorPw2);

		// 회원가입 생일 텍스트박스
		Font fontsignup2 = new Font(Font.SANS_SERIF, Font.PLAIN, 0);
		textsignupBirthday.setSize(170, 30);
		textsignupBirthday.setLocation(193, 402);
		textsignupBirthday.setOpaque(false);// 투명하게
		textsignupBirthday.setBorder(getBorder());// 테두리제거
		textsignupBirthday.setFont(fontsignup2);// 폰트 적용
		textsignupBirthday.setForeground(Color.WHITE);
		textsignupBirthday.setText("0");

		// 회원가입 생일 이벤트 추가
		te.TextSignupBirthday(textsignupBirthday);
		add(textsignupBirthday);

		// 생일 오류검증
		labelErrorBrithday.setFont(fontsignup2);
		labelErrorBrithday.setBounds(193, 435, 260, 15);
		labelErrorBrithday.setForeground(Color.red);
		labelErrorBrithday.setFont(font3);
		labelErrorBrithday.setVisible(false);
		add(labelErrorBrithday);
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
		ImageIcon loginImg = new ImageIcon("./src/image/singup.png");
		Image loginImg2 = loginImg.getImage();
		Image loginbg = loginImg2.getScaledInstance(300, 600, Image.SCALE_SMOOTH);
		ImageIcon changeIoginImg = new ImageIcon(loginbg);

		g.drawImage(loginbg, 150, 20, null);
		revalidate();
		repaint();
	}
}
