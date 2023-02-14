package composition;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import frame.FrameBase;
import frame.FrameUserLogin;

public class LoginInfo extends JFrame {

	public LoginInfo() {
		JLabel jl = new JLabel(); // 로그인이 필요한 메뉴 접근 시 로그인이 필요하다고 알려줌
		setTitle("로그인 오류");
		ImageIcon titleImg = new ImageIcon("./src/image/title.png");
		Image image = titleImg.getImage();
		setIconImage(image);
		setBounds(0, 0, 300, 150);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
        
		jl.setText("로그인이 필요한 서비스 입니다.");
		jl.setBounds(60, 10, 274, 50);
		add(jl);
		JButton button = new JButton("확인");
		button.setBounds(113, 60, 60, 30);
		button.setCursor(Button.cursor);
		add(button);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.cardPanel.add("ful", new FrameUserLogin());
				FrameBase.layout.show(FrameBase.cardPanel, "ful"); //확인을 누르면 로그인 페이지로 이동
				dispose();
			}
		});

	}
}
