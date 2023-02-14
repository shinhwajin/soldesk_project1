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

public class GangwonSool extends JPanel {
	public static JButton soolbutton5;
	public static JButton soolbutton6;
	public static JButton soolbutton7;
	public static JButton soolbutton8;

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
	public GangwonSool() {

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
		RoundedButton gyeonggibutton = new RoundedButton("경기");
		gyeonggibutton.setBounds(100, 10, 60, 60);
		gyeonggibutton.setFont(font);
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

		// 버튼 이벤트

		be.BackEvent(backbutton);
		be.GyeonggiSoolEvent(gyeonggibutton);
		be.ChungcheongSoolEvent(chungbutton);
		be.GyeongsangSoolEvent(gyeongsangbutton);
		be.JeollaSoolEvent(jeollabutton);
		be.JejuSoolEvent(Jejubutton);

		// top 패널에 버튼을 붙임
		top.add(backbutton);
		top.add(gyeonggibutton);
		top.add(chungbutton);
		top.add(gyeongsangbutton);
		top.add(jeollabutton);
		top.add(Jejubutton);

		// =============중간===============

		// 상세 페이지 이미지 버튼

		SoolButtonIcon ibi = new SoolButtonIcon();
		soolbutton5 = (JButton) add(ibi.GangwonSoolIcon());
		soolbutton5.setBounds(77, 135, 185, 230);
		soolbutton5.setName("대관령");

		soolbutton6 = (JButton) add(ibi.GangwonSoolIcon2());
		soolbutton6.setBounds(340, 135, 185, 230);
		soolbutton6.setName("동강더덕주");

		soolbutton7 = (JButton) add(ibi.GangwonSoolIcon3());
		soolbutton7.setBounds(77, 410, 185, 230);
		soolbutton7.setName("동정춘");

		soolbutton8 = (JButton) add(ibi.GangwonSoolIcon4());
		soolbutton8.setBounds(340, 410, 185, 230);
		soolbutton8.setName("설궁");

		// 술 버튼 이벤트
		SoolButtonEvent be2 = new SoolButtonEvent();
		be2.Sool(soolbutton5);
		be2.Sool(soolbutton6);
		be2.Sool(soolbutton7);
		be2.Sool(soolbutton8);

		// 라벨
	       Font pp=baemin.hwajinFont2();
	         JLabel sool = new JLabel("대관령");
	         sool.setLayout(null);
	         sool.setBounds(77, 365, 185, 40);
	         sool.setHorizontalAlignment(JLabel.CENTER);
	         sool.setFont(pp);
	         add(sool);

	         JLabel sool2 = new JLabel("동강더덕주");
	         sool2.setLayout(null);
	         sool2.setBounds(340, 365, 185, 40);
	         sool2.setHorizontalAlignment(JLabel.CENTER);
	         sool2.setFont(pp);
	         add(sool2);

	         JLabel sool3 = new JLabel("동정춘");
	         sool3.setLayout(null);
	         sool3.setBounds(77, 640, 185, 40);
	         sool3.setHorizontalAlignment(JLabel.CENTER);
	         sool3.setFont(pp);
	         add(sool3);

	         JLabel sool4 = new JLabel("설궁");
	         sool4.setLayout(null);
	         sool4.setBounds(340, 640, 185, 40);
	         sool4.setHorizontalAlignment(JLabel.CENTER);
	         sool4.setFont(pp);
	         add(sool4);

		add(sool);
		add(sool2);
		add(sool3);
		add(sool4);

	}
}
