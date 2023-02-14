package composition;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LoginpageButton extends JPanel { //로그인 회원가입 버튼 클래스

	ImageIcon loginImg = new ImageIcon("./src/image/loginClick.png");
	Image loginImg2 = loginImg.getImage();
	Image chagelogin = loginImg2.getScaledInstance(200, 68, Image.SCALE_SMOOTH);
	ImageIcon changeloginImg = new ImageIcon(chagelogin);

	ImageIcon signupImg = new ImageIcon("./src/image/sinupButton.png");
	Image signupImg2 = signupImg.getImage();
	Image chagesignup = signupImg2.getScaledInstance(200, 68, Image.SCALE_SMOOTH);
	ImageIcon changesignupImg = new ImageIcon(chagesignup);

	
	frame.CustomFont baemin = new frame.CustomFont();
	Font font = baemin.UserpageFont();
	
	public JButton loginbutton = new JButton("로그인");
	public JButton signupbutton = new JButton(changesignupImg);

	public Component LoginIcon() {

		
		ImageIcon loginrollImg = new ImageIcon("./src/image/loginClick2.png");
		Image loginrollImg2 = loginrollImg.getImage();
		Image chagerolllogin = loginrollImg2.getScaledInstance(200, 68, Image.SCALE_SMOOTH);
		ImageIcon changeloginrollImg = new ImageIcon(chagerolllogin);
		loginbutton.setPressedIcon(changeloginrollImg);
		loginbutton.setBounds(200, 417, 200, 68);
		loginbutton.setFont(font);
		loginbutton.setBorderPainted(false);
		loginbutton.setContentAreaFilled(false);
		loginbutton.setFocusPainted(false);
		loginbutton.setCursor(Button.cursor);
		loginbutton.setEnabled(false);
		return add(loginbutton);
	}

	public Component Loginsinup() {

		ImageIcon sinupImg = new ImageIcon("./src/image/sinupClick.png");
		Image sinupImg2 = sinupImg.getImage();
		Image chagesinup = sinupImg2.getScaledInstance(100, 38, Image.SCALE_SMOOTH);
		ImageIcon changesinupImg = new ImageIcon(chagesinup);
		JButton sinupbutton = new JButton(changesinupImg);
		sinupbutton.setBounds(250, 517, 100, 38);
		sinupbutton.setBorderPainted(false);
		sinupbutton.setContentAreaFilled(false);
		sinupbutton.setFocusPainted(false);
		sinupbutton.setCursor(Button.cursor);
		return add(sinupbutton);
	}

	public Component SignupIcon() {

		ImageIcon signuprollImg = new ImageIcon("./src/image/sinupButton.png");
		Image signuprollImg2 = signuprollImg.getImage();
		Image chagerollsignup = signuprollImg2.getScaledInstance(200, 68, Image.SCALE_SMOOTH);
		ImageIcon changesignuprollImg = new ImageIcon(chagerollsignup);
		signupbutton.setPressedIcon(changesignuprollImg);
		signupbutton.setBounds(195, 505, 200, 68);
		signupbutton.setBorderPainted(false);
		signupbutton.setContentAreaFilled(false);
		signupbutton.setFocusPainted(false);
		signupbutton.setCursor(Button.cursor);
		signupbutton.setEnabled(false);
		return add(signupbutton);
	}
}
