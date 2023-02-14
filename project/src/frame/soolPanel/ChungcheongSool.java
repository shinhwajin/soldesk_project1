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

public class ChungcheongSool extends JPanel {
	public static JButton soolbutton9;
	public static JButton soolbutton10;
	public static JButton soolbutton11;
	public static JButton soolbutton12;

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

	public ChungcheongSool() {

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
		RoundedButton gangbutton = new RoundedButton("강원");
		gangbutton.setBounds(200, 10, 60, 60);
		gangbutton.setFont(font);
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
		be.GangwonSoolEvent(gangbutton);
		be.GyeongsangSoolEvent(gyeongsangbutton);
		be.JeollaSoolEvent(jeollabutton);
		be.JejuSoolEvent(Jejubutton);

		// top 패널에 버튼을 붙임
		top.add(backbutton);
		top.add(gyeonggibutton);
		top.add(gangbutton);
		top.add(gyeongsangbutton);
		top.add(jeollabutton);
		top.add(Jejubutton);

		// 상세 페이지 이미지 버튼

		SoolButtonIcon ibi = new SoolButtonIcon();
		soolbutton9 = (JButton) add(ibi.ChungcheongIcon1());
		soolbutton9.setBounds(77, 135, 185, 230);
		soolbutton9.setName("면천두견주");

		soolbutton10 = (JButton) add(ibi.ChungcheongIcon2());
		soolbutton10.setBounds(340, 135, 185, 230);
		soolbutton10.setName("백련생막걸리");

		soolbutton11 = (JButton) add(ibi.ChungcheongIcon3());
		soolbutton11.setBounds(77, 410, 185, 230);
		soolbutton11.setName("청명주");

		soolbutton12 = (JButton) add(ibi.ChungcheongIcon4());
		soolbutton12.setBounds(340, 410, 185, 230);
		soolbutton12.setName("한산소곡주");

		// 술 버튼 이벤트
		SoolButtonEvent be2 = new SoolButtonEvent();
		be2.Sool(soolbutton9);
		be2.Sool(soolbutton10);
		be2.Sool(soolbutton11);
		be2.Sool(soolbutton12);

		// 라벨
	    Font pp=baemin.hwajinFont2();
        JLabel sool = new JLabel("면천두견주");
        sool.setLayout(null);
        sool.setBounds(77, 365, 185, 40);
        sool.setHorizontalAlignment(JLabel.CENTER);
        sool.setFont(pp);
        add(sool);

        JLabel sool2 = new JLabel("백련생막걸리");
        sool2.setLayout(null);
        sool2.setBounds(340, 365, 185, 40);
        sool2.setHorizontalAlignment(JLabel.CENTER);
        sool2.setFont(pp);
        add(sool2);

        JLabel sool3 = new JLabel("청명주");
        sool3.setLayout(null);
        sool3.setBounds(77, 640, 185, 40);
        sool3.setHorizontalAlignment(JLabel.CENTER);
        sool3.setFont(pp);
        add(sool3);

        JLabel sool4 = new JLabel("한산소곡주");
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
