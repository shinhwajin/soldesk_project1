package composition;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFrame;
import frame.FrameBase;
import frame.FrameUserLogin;
import frame.FrameUserSignup;

public class ButtonEvent extends JFrame {

	public void HomeEvent(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "fh"); // 버튼을 누면 카트레이어에 저장된 패널을 불러옴
			}
		});

	}

	public void MapEvent(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "fm");
			}
		});
	}

	public void GameEvent(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "fg");

			}
		});
	}

	public void CartEvent(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (FrameBase.login == true) {
					FrameBase.layout.show(FrameBase.cardPanel, "fc");
				} else {
					new LoginInfo();
				}
			}
		});
	}

	public void UserEvent(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (FrameBase.success == 0) {// 로그인이 안된 상태면 로그인 페이지로 이동
					FrameBase.layout.show(FrameBase.cardPanel, "ful");
				} else if (FrameBase.success == 1)// 로그인이 되있으면 유저페이지로 이동
					FrameBase.layout.show(FrameBase.cardPanel, "fu");
			}
		});
	}

	public void SignupEvent(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.cardPanel.add("fus", new FrameUserSignup());
				FrameBase.layout.show(FrameBase.cardPanel, "fus");
				UserpageButton.num = 2;

			}
		});
	}

	public void Signup2Event(JButton button) {

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (FrameUserSignup.textsignupId.getText().equals("")) {
					UserSave.num = 9;
					new SignupInfo();
					return;
				} else if (FrameUserSignup.textsignupPw.getText().equals("")) {
					UserSave.num = 10;
					new SignupInfo();
					return;
				} else if (FrameUserSignup.textsignupPw2.getText().equals("")) {
					UserSave.num = 11;
					new SignupInfo();
					return;
				} else if (FrameUserSignup.textsignupBirthday.getText().equals("")) {
					UserSave.num = 12;
					new SignupInfo();
					return;
				}
				try {
					UserSave.SaveUser(); // 아이디 비밀번호 오류 체크 클래스로 이동
				} catch (ParseException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

	}

	public void LoginEvent(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserSave save = new UserSave();
				try {
					save.Login();
				} catch (IOException e1) {
					e1.printStackTrace();
				} // 아이디 비밀번호 일치 체크 메소드

			}
		});

	}

	public void LogOutEvent(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.success = 0; // 로그아웃 후 메뉴 일부 제한
				UserSave save = new UserSave();
				save.LogOut(); // 로그아웃 메소드

			}
		});

	}

}