package composition;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import frame.FrameUserLogin;
import frame.FrameUserSignup;

public class TextEvent extends JPanel {

	LoginpageButton login = new LoginpageButton();
	boolean id;
	boolean pw;
	boolean signupid;
	boolean signuppw;
	boolean birthday;
	boolean signuppw2;
	String sigupid;
	int textnum = 1;
	public static String textid;

	public void TextLoginId(JTextField text) {
		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserLogin.labelId.setVisible(true);
				} else {
					FrameUserLogin.labelId.setVisible(false);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserLogin.labelId.setVisible(true);
				} else {
					FrameUserLogin.labelId.setVisible(false);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserLogin.labelId.setVisible(true);
				} else {
					FrameUserLogin.labelId.setVisible(false);
				}
			}
		};
		text.addKeyListener(listener);
	}
	
	public void TextLoginPw(JTextField text) {
		KeyListener listener = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserLogin.labelPw.setVisible(true);
				} else {
					FrameUserLogin.labelPw.setVisible(false);
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserLogin.labelPw.setVisible(true);
				} else {
					FrameUserLogin.labelPw.setVisible(false);
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserLogin.labelPw.setVisible(true);
				} else {
					FrameUserLogin.labelPw.setVisible(false);
				}
			}
		};
		text.addKeyListener(listener);
	}
//==================================회원가입 버튼================================================================

	int signupcnt = 0;

	public void TextSignupId(JTextField text) {

		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserSignup.labelId.setVisible(true);
				} else {
					FrameUserSignup.labelId.setVisible(false);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserSignup.labelId.setVisible(true);
				} else {
					FrameUserSignup.labelId.setVisible(false);
				}
				if(FrameUserSignup.textsignupId.getText().length() <3)
					FrameUserSignup.labelErrorId.setVisible(true);
				else
					FrameUserSignup.labelErrorId.setVisible(false);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserSignup.labelId.setVisible(true);
				} else {
					FrameUserSignup.labelId.setVisible(false);
				}
			}
		};
		text.addKeyListener(listener);

	}

	public void TextSignupPw(JTextField text) {

		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserSignup.labelPw.setVisible(true);
				} else {
					FrameUserSignup.labelPw.setVisible(false);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserSignup.labelPw.setVisible(true);
				} else {
					FrameUserSignup.labelPw.setVisible(false);
				}
				if(FrameUserSignup.textsignupPw.getText().length() <4)
					FrameUserSignup.labelErrorPw.setVisible(true);
				else
					FrameUserSignup.labelErrorPw.setVisible(false);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserSignup.labelPw.setVisible(true);
				} else {
					FrameUserSignup.labelPw.setVisible(false);
				}
			}
		};
		text.addKeyListener(listener);

	}

	public void TextSignupPw2(JTextField text) {

		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserSignup.labelPw2.setVisible(true);
				} else {
					FrameUserSignup.labelPw2.setVisible(false);
				}
				if (FrameUserSignup.textsignupPw.getText().equals(FrameUserSignup.textsignupPw2.getText())) {
					FrameUserSignup.labelErrorPw2.setVisible(false);
				} else {
					FrameUserSignup.labelErrorPw2.setVisible(true);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserSignup.labelPw2.setVisible(true);
				} else {
					FrameUserSignup.labelPw2.setVisible(false);
				}
				if (FrameUserSignup.textsignupPw.getText().equals(FrameUserSignup.textsignupPw2.getText())) {
					FrameUserSignup.labelErrorPw2.setVisible(false);
				} else {
					FrameUserSignup.labelErrorPw2.setVisible(true);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (text.getText().equals("")) {
					FrameUserSignup.labelPw2.setVisible(true);
				} else {
					FrameUserSignup.labelPw2.setVisible(false);
				}
				if (FrameUserSignup.textsignupPw.getText().equals(FrameUserSignup.textsignupPw2.getText())) {
					FrameUserSignup.labelErrorPw2.setVisible(false);
				} else {
					FrameUserSignup.labelErrorPw2.setVisible(true);
				}
			}
		};
		text.addKeyListener(listener);

	}

	public void TextSignupBirthday(JTextField textBirthday) {

		KeyListener listener = new KeyListener() {
			int textdate;
			Date now = new Date(System.currentTimeMillis());
			SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
			int nowdate = Integer.parseInt(dtFormat.format(now));

			@Override
			public void keyTyped(KeyEvent e) {
				if (textBirthday.getText().equals("")) {
					FrameUserSignup.labelBrithday.setVisible(true);
				} else {
					FrameUserSignup.labelBrithday.setVisible(false);
					textdate = Integer.parseInt(FrameUserSignup.textsignupBirthday.getText());// 입력받은 날짜
					if (FrameUserSignup.textsignupBirthday.getText().length() != 8 || textdate < 19000101
							|| textdate > nowdate) {
						signupcnt = 1;
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

				if (textBirthday.getText().equals("")) {
					FrameUserSignup.labelBrithday.setVisible(true);
				} else {
					FrameUserSignup.labelBrithday.setVisible(false);
					textdate = Integer.parseInt(FrameUserSignup.textsignupBirthday.getText());// 입력받은 날짜
					if (FrameUserSignup.textsignupBirthday.getText().length() != 8 || textdate < 19000101
							|| textdate > nowdate) {
						FrameUserSignup.labelErrorBrithday.setVisible(true);// 생년월일 오류문구 출력
						signupcnt = 1;
					}else
						FrameUserSignup.labelErrorBrithday.setVisible(false);// 생년월일 오류문구 삭제
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

				Font fontsignup = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
				FrameUserSignup.textsignupBirthday.setFont(fontsignup);
				FrameUserSignup.textsignupBirthday.setForeground(Color.black);
				if (textnum == 1) {
					FrameUserSignup.textsignupBirthday.setText("");
					textnum = 2;
				}

				if (textBirthday.getText().equals("")) {
					FrameUserSignup.labelBrithday.setVisible(true);
				} else {
					FrameUserSignup.labelBrithday.setVisible(false);
					textdate = Integer.parseInt(FrameUserSignup.textsignupBirthday.getText());// 입력받은 날짜
					if (FrameUserSignup.textsignupBirthday.getText().length() == 8 && textdate > 19000101
							&& textdate < nowdate) {
						signupcnt = 1;
					} else {
						signupcnt = 0;
					}
				}
			}
		};
		textBirthday.addKeyListener(listener);
	}
}
