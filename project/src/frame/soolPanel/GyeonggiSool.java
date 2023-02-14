package frame.soolPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import composition.MapButtonEvent;
import composition.MapButtonIcon;
import composition.SoolButtonEvent;
import composition.SoolButtonIcon;
import frame.Images;
import frame.RoundedButton;

public class GyeonggiSool extends JPanel {
	public static JButton soolbutton;
	public static JButton soolbutton2;
	public static JButton soolbutton3;
	public static JButton soolbutton4;

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
	public GyeonggiSool() {

		setLayout(null);
		setSize(600, 800);
		setBackground(Color.WHITE);
		frame.CustomFont baemin = new frame.CustomFont();
		Font font = baemin.hwajinFont2();

		// =============카테고리===============

		// 카테고리 배경색
		JPanel top = new JPanel();
		top.setSize(600, 90);
		top.setLocation(0, 0);
		top.setLayout(null);
		top.setBackground(Color.WHITE);
		add(top); // 프레임에 탑 패널 붙임

		// 각 지역으로 갈 수 있는 버튼
		MapButtonEvent be = new MapButtonEvent();
		MapButtonIcon bi = new MapButtonIcon();

		JButton backbutton = (JButton) add(bi.BackButtonIcon());
		backbutton.setBounds(15, 15, 60, 60);
		RoundedButton gangbutton = new RoundedButton("강원");
		gangbutton.setBounds(100, 10, 60, 60);
		gangbutton.setFont(font);
		RoundedButton chungbutton = new RoundedButton("충청");
		chungbutton.setBounds(200, 10, 60, 60);
		chungbutton.setFont(font);
		RoundedButton gyeongsangbutton = new RoundedButton("경상");
		gyeongsangbutton.setBounds(300, 10, 60, 60);
		gyeongsangbutton.setFont(font);
		RoundedButton jeollabutton = new RoundedButton("전라");
		jeollabutton.setBounds(400, 10, 60, 60);
		jeollabutton.setFont(font);
		RoundedButton Jejubutton = new RoundedButton("제주");
		Jejubutton.setBounds(500, 10, 60, 60);
		Jejubutton.setFont(font);

		// 탑 버튼 이벤트

		be.BackEvent(backbutton);
		be.GangwonSoolEvent(gangbutton);
		be.ChungcheongSoolEvent(chungbutton);
		be.GyeongsangSoolEvent(gyeongsangbutton);
		be.JeollaSoolEvent(jeollabutton);
		be.JejuSoolEvent(Jejubutton);

		// top 패널에 버튼을 붙임
		top.add(backbutton);
		top.add(gangbutton);
		top.add(chungbutton);
		top.add(gyeongsangbutton);
		top.add(jeollabutton);
		top.add(Jejubutton);

		// =============중간 패널===============

		// 상세 페이지 이미지 버튼

		SoolButtonIcon ibi = new SoolButtonIcon();
		soolbutton = (JButton) add(ibi.GyeonggiSoolIcon());
		soolbutton.setBounds(77, 135, 185, 230);
		soolbutton.setName("남한산성");

		soolbutton2 = (JButton) add(ibi.GyeonggiSoolIcon2());
		soolbutton2.setBounds(340, 135, 185, 230);
		soolbutton2.setName("문배주");

		soolbutton3 = (JButton) add(ibi.GyeonggiSoolIcon3());
		soolbutton3.setBounds(77, 410, 185, 230);
		soolbutton3.setName("옥로주");

		soolbutton4 = (JButton) add(ibi.GyeonggiSoolIcon4());
		soolbutton4.setBounds(340, 410, 185, 230);
		soolbutton4.setName("천비향");

		// 술 버튼 이벤트
		SoolButtonEvent be2 = new SoolButtonEvent();
		be2.Sool(soolbutton);
		be2.Sool(soolbutton2);
		be2.Sool(soolbutton3);
		be2.Sool(soolbutton4);

		// 라벨
		Font pp = baemin.hwajinFont2();
		JLabel sool = new JLabel("남한산성");
		sool.setLayout(null);
		sool.setBounds(77, 365, 185, 40);
		sool.setHorizontalAlignment(JLabel.CENTER);
		sool.setFont(pp);
		add(sool);

		JLabel sool2 = new JLabel("문배주");
		sool2.setLayout(null);
		sool2.setBounds(340, 365, 185, 40);
		sool2.setHorizontalAlignment(JLabel.CENTER);
		sool2.setFont(pp);
		add(sool2);

		JLabel sool3 = new JLabel("옥로주");
		sool3.setLayout(null);
		sool3.setBounds(77, 640, 185, 40);
		sool3.setHorizontalAlignment(JLabel.CENTER);
		sool3.setFont(pp);
		add(sool3);

		JLabel sool4 = new JLabel("천비향");
		sool4.setLayout(null);
		sool4.setBounds(340, 640, 185, 40);
		sool4.setHorizontalAlignment(JLabel.CENTER);
		sool4.setFont(pp);
		add(sool4);

	}// 생성자

}
