package composition;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import frame.FrameBase;
import frame.FrameCart;
import frame.FrameGame;
import frame.FrameHome;
import frame.FrameMap;
import frame.FrameUser;
import frame.FrameUserLogin;

public class Button extends JPanel implements ActionListener {

	public static Cursor cursor = new Cursor(Cursor.HAND_CURSOR);// 버튼에 마우스가 올라갔을 때 손모양으로 변경

	public ImageIcon HomeIcon() {
		ImageIcon homeImg = new ImageIcon("./src/image/home.png");// 이미지 가져오기
		Image homeImg2 = homeImg.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagehome = homeImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
		return changehomeImg;
	}

	public ImageIcon HomeRoll() {
		ImageIcon homerollImg = new ImageIcon("./src/image/home2.png");// 이미지 가져오기
		Image homerollImg2 = homerollImg.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagerollhome = homerollImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changehomerollImg = new ImageIcon(chagerollhome);// 이미지를 설정크기에 맞도록 설정
		return changehomerollImg;
	}

	public ImageIcon MapIcon() {
		ImageIcon mapImg = new ImageIcon("./src/image/map.png");
		Image mapImg2 = mapImg.getImage();
		Image chagemap = mapImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changemapImg = new ImageIcon(chagemap);
		return changemapImg;
	}

	public ImageIcon MapRoll() {
		ImageIcon maprollImg = new ImageIcon("./src/image/map2.png");
		Image maprollImg2 = maprollImg.getImage();
		Image chagerollmap = maprollImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changemaprollImg = new ImageIcon(chagerollmap);
		return changemaprollImg;
	}

	public ImageIcon GameIcon() {
		ImageIcon gameImg = new ImageIcon("./src/image/game.png");
		Image gameImg2 = gameImg.getImage();
		Image chagegame = gameImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changegameImg = new ImageIcon(chagegame);
		return changegameImg;
	}

	public ImageIcon GameRoll() {
		ImageIcon gamerollImg = new ImageIcon("./src/image/game2.png");
		Image gamerollImg2 = gamerollImg.getImage();
		Image chagerollgame = gamerollImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changegamerollImg = new ImageIcon(chagerollgame);
		return changegamerollImg;
	}

	public ImageIcon CartIcon() {
		ImageIcon cartImg = new ImageIcon("./src/image/cart.png");
		Image cartImg2 = cartImg.getImage();
		Image chagecart = cartImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecartImg = new ImageIcon(chagecart);
		return changecartImg;
	}

	public ImageIcon CartRoll() {
		ImageIcon cartrollImg = new ImageIcon("./src/image/cart2.png");
		Image cartrollImg2 = cartrollImg.getImage();
		Image chagerollcart = cartrollImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecartrollImg = new ImageIcon(chagerollcart);
		return changecartrollImg;
	}

	public ImageIcon UserIcon() {
		ImageIcon userImg = new ImageIcon("./src/image/user.png");
		Image userImg2 = userImg.getImage();
		Image chageuser = userImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changeuserImg = new ImageIcon(chageuser);
		return changeuserImg;
	}

	public ImageIcon UserRoll() {
		ImageIcon userrollImg = new ImageIcon("./src/image/user2.png");
		Image userrollImg2 = userrollImg.getImage();
		Image chagerolluser = userrollImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changeuserrollImg = new ImageIcon(chagerolluser);
		return changeuserrollImg;
	}

	public static int button;

	public void HomeButton(ImageIcon icon, ImageIcon roll, Container panel) {
		// Home 버튼 생성

		JButton button = new JButton(icon);// 버튼을 이미지로 변경
		button.setRolloverIcon(roll);// 마우스가 버튼에 갔을때 이미지 변경
		button.setCursor(cursor);// 마우스가 버튼에 갔을때 커서 변경
		// 버튼 설정
		// button.setBounds(40, 650, 60, 60);// 버튼 위치 크기
		button.setBackground(Color.white);
		button.setBorderPainted(false);// 버튼 테두리 제거
		// button.setContentAreaFilled(false);// 버튼 배경삭제
		button.setFocusPainted(false);// 선택데두리 제거
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.cardPanel.add("fh", new FrameHome());
				FrameBase.layout.show(FrameBase.cardPanel, "fh");
			}
		});
		panel.add(button);// 버튼추가
	}

	public void MapButton(ImageIcon icon, ImageIcon roll, Container panel) {
		// Map 버튼 생성

		JButton button = new JButton(icon);// 버튼을 이미지로 변경
		button.setRolloverIcon(roll);// 마우스가 버튼에 갔을때 이미지 변경
		button.setCursor(cursor);// 마우스가 버튼에 갔을때 커서 변경
		// 버튼 설정
		button.setBounds(150, 650, 60, 60);// 버튼 위치 크기
		button.setBackground(Color.white);
		button.setBorderPainted(false);// 버튼 테두리 제거
		// button.setContentAreaFilled(false);// 버튼 배경삭제
		button.setFocusPainted(false);// 선택데두리 제거
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.cardPanel.add("fm", new FrameMap());
				FrameBase.layout.show(FrameBase.cardPanel, "fm");
			}
		});
		panel.add(button);// 버튼추가
	}

	public void GameButton(ImageIcon icon, ImageIcon roll, Container panel) {
		// Game 버튼 생성

		JButton button = new JButton(icon);// 버튼을 이미지로 변경
		button.setRolloverIcon(roll);// 마우스가 버튼에 갔을때 이미지 변경
		button.setCursor(cursor);// 마우스가 버튼에 갔을때 커서 변경
		// 버튼 설정
		button.setBounds(265, 650, 60, 60);// 버튼 위치 크기
		button.setBackground(Color.white);
		button.setBorderPainted(false);// 버튼 테두리 제거
		// button.setContentAreaFilled(false);// 버튼 배경삭제
		button.setFocusPainted(false);// 선택데두리 제거
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.cardPanel.add("fg", new FrameGame());
				FrameBase.layout.show(FrameBase.cardPanel, "fg");
			}
		});
		panel.add(button);// 버튼추가
	}

	public void CartButton(ImageIcon icon, ImageIcon roll, Container panel) {
		button = 4;
		// Cart 버튼 생성
		JButton button = new JButton(icon);// 버튼을 이미지로 변경
		button.setRolloverIcon(roll);// 마우스가 버튼에 갔을때 이미지 변경
		button.setCursor(cursor);// 마우스가 버튼에 갔을때 커서 변경
		// 버튼 설정
		button.setBounds(380, 650, 60, 60);// 버튼 위치 크기
		button.setBackground(Color.white);
		button.setBorderPainted(false);// 버튼 테두리 제거
		// button.setContentAreaFilled(false);// 버튼 배경삭제
		button.setFocusPainted(false);// 선택데두리 제거
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (FrameBase.login == true) {
					FrameBase.cardPanel.add("fc", new FrameCart());
					FrameBase.layout.show(FrameBase.cardPanel, "fc");
				} else {
					new LoginInfo();
				}
				repaint();
				revalidate();
			}
		});
		panel.add(button);// 버튼추가
	}

	public void UserButton(ImageIcon icon, ImageIcon roll, Container panel) {
		button = 5;
		// User 버튼 생성
		JButton button = new JButton(icon);// 버튼을 이미지로 변경
		button.setRolloverIcon(roll);// 마우스가 버튼에 갔을때 이미지 변경
		button.setCursor(cursor);// 마우스가 버튼에 갔을때 커서 변경
		// 버튼 설정
		button.setBounds(495, 650, 60, 60);// 버튼 위치 크기
		button.setBackground(Color.white);
		button.setBorderPainted(false);// 버튼 테두리 제거
		// button.setContentAreaFilled(false);// 버튼 배경삭제
		button.setFocusPainted(false);// 선택데두리 제거
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (FrameBase.success == 0) {
					FrameBase.cardPanel.add("ful", new FrameUserLogin());
					FrameBase.layout.show(FrameBase.cardPanel, "ful");
					UserpageButton.num = 1;
				} else if (FrameBase.success == 1) {
					FrameBase.cardPanel.add("fu", new FrameUser());
					FrameBase.layout.show(FrameBase.cardPanel, "fu");
				}
				repaint();
				revalidate();
			}
		});
		panel.add(button);// 버튼추가
	}

	// 게임 뒤로가기 버튼
	public Component backIcon() {
		// user 버튼 생성
		ImageIcon backImg = new ImageIcon("./src/image/left_arrow.png");
		Image backImg2 = backImg.getImage();
		Image chageback = backImg2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon changebackImg = new ImageIcon(chageback);
		JButton backbutton = new JButton(changebackImg);
		backbutton.setBounds(10, 10, 100, 100);
		backbutton.setBorderPainted(false);
		backbutton.setContentAreaFilled(false);
		backbutton.setFocusPainted(false);
		backbutton.setCursor(cursor);
		return add(backbutton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton a = (JButton) e.getSource(); // 버튼 눌리는 주소를 눌리는 버튼으로 변환
		if (a.getX() == 0) {// 홈 //버튼의 시작x축을 비교해 어떤 버튼이 눌렸는지 구별
			FrameBase.cardPanel.add("fh", new FrameHome());// 버튼을 누를 때마다 추천이 바뀜
			FrameBase.layout.show(FrameBase.cardPanel, "fh");
			repaint();
			revalidate();

		} else if (a.getX() == 117) { // 지도
			FrameBase.layout.show(FrameBase.cardPanel, "fm");
			repaint();
			revalidate();

		} else if (a.getX() == 234) { // 게임
			FrameBase.layout.show(FrameBase.cardPanel, "fg");
			repaint();
			revalidate();

		} else if (a.getX() == 351) { // 카트
			if (FrameBase.login == true) {
				FrameBase.layout.show(FrameBase.cardPanel, "fc");
			} else {
				new LoginInfo();
			}
			repaint();
			revalidate();

		} else if (a.getX() == 468) { // 설정

			if (FrameBase.success == 0) {
				FrameBase.layout.show(FrameBase.cardPanel, "ful");
				UserpageButton.num = 1;
			} else if (FrameBase.success == 1) {
				FrameBase.layout.show(FrameBase.cardPanel, "fu");
			}
			repaint();
			revalidate();
		}

	}
}