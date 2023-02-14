package composition;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import frame.FrameBase;
import frame.FrameUser;
import frame.FrameUserLogin;
import frame.FrameUserSignup;
import frame.Images;

public class SignupInfo extends JFrame { // 회원가입시 아이디 비밀번호 오류 체크
	public SignupInfo() {
		JLabel jl = new JLabel();
		setTitle("");
		ImageIcon titleImg = new ImageIcon("./src/image/title.png");
		Image image = titleImg.getImage();
		setIconImage(image);
		setBounds(0, 0, 300, 150);
		if (UserSave.num == 0) { // 상황에 따라 오류문구가 변경됨
			UserpageButton.num = 1;
			jl.setText("회원가입이 완료 되었습니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 1) {
			jl.setText("아이디는 3~16글자로 이루어져야 합니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 2) {
			jl.setText("비밀번호는 4글자 이상이어야 합니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 3) {
			jl.setText("비밀번호가 일치하지 않습니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 4) {
			jl.setText("20세 미만은 이용할 수 없습니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 5) {
			jl.setText(FrameUserLogin.textId.getText() + "님 환영합니다!");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 6) {
			jl.setText("아이디 또는 비밀번호가 일치하지 않습니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 7) {
			jl.setText("정확하지 않은 생년월일입니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 8) {
			jl.setText("중복된 아이디 입니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 9) {
			jl.setText("아이디를 입력해주세요.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 10) {
			jl.setText("비밀번호를 입력해주세요.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 11) {
			jl.setText("비밀번호 확인을 입력해주세요.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 12) {
			jl.setText("생일을 입력해주세요.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == -1) {
			jl.setText("로그아웃 되었습니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 99) {
			jl.setText("아이디는 알파벳, 숫자로만 이루어져야 합니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 20) {
			jl.setText("현재 비밀번호가 일치 하지 않습니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 21) {
			jl.setText("변경 비밀번호가 일치 하지 않습니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (UserSave.num == 22) {
			jl.setText("비밀변호가 변경 되었습니다.");
			jl.setSize(300, 50);
			jl.setHorizontalAlignment(JLabel.CENTER);
		}
		frame.CustomFont baemin = new frame.CustomFont();
		Font font = baemin.BuyFont();
		jl.setFont(font);
		
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		add(jl);
		JButton button = new JButton("확인");
		button.setBounds(115, 60, 60, 30);
		button.setCursor(Button.cursor);
		add(button);
		// 로그인, 회원가입 버튼을 눌렀을 때 상황에 따라 이동하는 페이지가 다름
		if (UserSave.num == -1 || UserSave.num == 6 || UserSave.num == 0) {
			// 아이디 또는 비밀번호가 일치하지 않습니다. | "회원가입이 완료 되었습니다." 로그인페이지로 이동
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					FrameBase.layout.show(FrameBase.cardPanel, "ful");
					FrameUserLogin.textId.setText(""); // 로그인 페이지 아이디 비밀번호 입력값 초기화
					FrameUserLogin.textPw.setText("");
					FrameUserLogin.labelId.setVisible(true);
					FrameUserLogin.labelPw.setVisible(true);
					dispose();
				}
			});
		} else if (UserSave.num == 5 || UserSave.num == 20 || UserSave.num == 21 || UserSave.num == 22) {
			button.addActionListener(new ActionListener() { // 로그인 성공 시 유저페이지로 이동
				@Override
				public void actionPerformed(ActionEvent e) {
					FrameBase.cardPanel.add("fu", new FrameUser());
					FrameBase.layout.show(FrameBase.cardPanel, "fu");
					FrameUserLogin.textId.setText("");
					FrameUserLogin.textPw.setText("");
					FrameUserLogin.labelId.setVisible(true);
					FrameUserLogin.labelPw.setVisible(true);
					dispose();
				}
			});
		} else {
			button.addActionListener(new ActionListener() { // 그 외의 오류는 회원가입 페이지로 이동
				@Override
				public void actionPerformed(ActionEvent e) {
					FrameBase.layout.show(FrameBase.cardPanel, "fus");
					FrameUserLogin.textId.setText("");
					FrameUserLogin.textPw.setText("");
					FrameUserLogin.labelId.setVisible(true);
					FrameUserLogin.labelPw.setVisible(true);
					FrameUserSignup.labelId.setVisible(true);
					FrameUserSignup.labelPw.setVisible(true);
					FrameUserSignup.labelPw2.setVisible(true);
					FrameUserSignup.labelBrithday.setVisible(true);
					FrameUserSignup.labelErrorBrithday.setVisible(false);
					FrameUserSignup.labelErrorId.setVisible(false);
					FrameUserSignup.labelErrorPw.setVisible(false);
					FrameUserSignup.labelErrorPw2.setVisible(false);
					dispose();
				}
			});
		}

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
