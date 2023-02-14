package Game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import composition.ButtonEvent;
import composition.MapButtonIcon;
import frame.CustomFont;
import frame.Images;
import frame.RoundedButton;

public class Game2 extends JPanel {

	public static Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

	public Game2() {

		setSize(600, 800);// 프레임 크기 설정
		setLayout(null);// 레이아웃을 변경가능하게 설정
		CustomFont baemin = new CustomFont();
		Font font = baemin.hwajinFont1();
		Font font2 = baemin.hwajinFont2();
		
		JLabel l1 = new JLabel("6개의 벌칙을 입력해주세요!");
		l1.setBounds(45, 100, 500, 400);
		l1.setOpaque(true); // Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		l1.setBackground(Color.PINK);
		l1.setFont(font2);
		l1.setHorizontalAlignment(JLabel.CENTER);
		add(l1);
		
		RoundedButton btn = new RoundedButton("입력하기");
		btn.setContentAreaFilled(false);
		btn.setFont(font);
		btn.setBounds(45, 510, 100, 50);
		add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = JOptionPane.showInputDialog("첫번째 벌칙을 입력해주세요.");
				String s2 = JOptionPane.showInputDialog("두번째 벌칙을 입력해주세요.");
				String s3 = JOptionPane.showInputDialog("세번째 벌칙을 입력해주세요.");
				String s4 = JOptionPane.showInputDialog("네번째 벌칙을 입력해주세요.");
				String s5 = JOptionPane.showInputDialog("다섯번째 벌칙을 입력해주세요.");
				String s6 = JOptionPane.showInputDialog("여섯번째 벌칙을 입력해주세요.");
				l1.setText("<html><body><center>1. "+s1+"<br><br>2. "+s2+"<br><br>3. "+s3+"<br><br>4. "+s4+"<br><br>5. "+s5+"<br><br>6. "+s6+"</center></body></html>");
			}
		});

		// Dice 버튼 생성
		ImageIcon diceImg = new ImageIcon("./src/image/diceroll.gif");// 이미지 가져오기
		JButton dicebutton = new JButton(diceImg);// 버튼을 이미지로 변경
		dicebutton.setBounds(440, 530, 100, 100);// 버튼 위치 크기
		dicebutton.setBorderPainted(false);// 버튼 테두리 제거
		dicebutton.setContentAreaFilled(false);// 버튼 배경삭제
		dicebutton.setFocusPainted(false);// 선택데두리 제거
		dicebutton.setCursor(cursor);
		add(dicebutton);
		// 버튼 이벤트
		dicebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, (int) (Math.random() * 6 + 1));
			}
		});

		ButtonEvent be = new ButtonEvent();
		MapButtonIcon mbi = new MapButtonIcon();
		JButton backbutton = (JButton) add(mbi.BackButtonIcon());
		be.GameEvent(backbutton);
		add(backbutton);
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