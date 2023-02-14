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

public class GyeongsangSool extends JPanel {
	public static JButton soolbutton13;
	public static JButton soolbutton14;
	public static JButton soolbutton15;
	public static JButton soolbutton16;

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

	public GyeongsangSool() {

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
		RoundedButton chungbutton = new RoundedButton("충청");
		chungbutton.setBounds(300, 10, 60, 60);
		chungbutton.setFont(font);
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
		be.ChungcheongSoolEvent(chungbutton);
		be.JeollaSoolEvent(jeollabutton);
		be.JejuSoolEvent(Jejubutton);

		// top 패널에 버튼을 붙임
		top.add(backbutton);
		top.add(gyeonggibutton);
		top.add(gangbutton);
		top.add(chungbutton);
		top.add(jeollabutton);
		top.add(Jejubutton);

		// =============중간===============

		// 상세 페이지 이미지 버튼

		SoolButtonIcon ibi = new SoolButtonIcon();
		soolbutton13 = (JButton) add(ibi.GyeongsangIcon1());
		soolbutton13.setBounds(77, 135, 185, 230);
		soolbutton13.setName("과화주");

		soolbutton14 = (JButton) add(ibi.GyeongsangIcon2());
		soolbutton14.setBounds(340, 135, 185, 230);
		soolbutton14.setName("교동법주");

		soolbutton15 = (JButton) add(ibi.GyeongsangIcon3());
		soolbutton15.setBounds(77, 410, 185, 230);
		soolbutton15.setName("국화주");

		soolbutton16 = (JButton) add(ibi.GyeongsangIcon4());
		soolbutton16.setBounds(340, 410, 185, 230);
		soolbutton16.setName("안동소주");

		// 술 버튼 이벤트
		SoolButtonEvent be2 = new SoolButtonEvent();
		be2.Sool(soolbutton13);
		be2.Sool(soolbutton14);
		be2.Sool(soolbutton15);
		be2.Sool(soolbutton16);

		// 라벨
	    Font pp=baemin.hwajinFont2();
        JLabel sool = new JLabel("과화주");
        sool.setLayout(null);
        sool.setBounds(77, 365, 185, 40);
        sool.setHorizontalAlignment(JLabel.CENTER);
        sool.setFont(pp);
        add(sool);

        JLabel sool2 = new JLabel("교동법주");
        sool2.setLayout(null);
        sool2.setBounds(340, 365, 185, 40);
        sool2.setHorizontalAlignment(JLabel.CENTER);
        sool2.setFont(pp);
        add(sool2);

        JLabel sool3 = new JLabel("국화주");
        sool3.setLayout(null);
        sool3.setBounds(77, 640, 185, 40);
        sool3.setHorizontalAlignment(JLabel.CENTER);
        sool3.setFont(pp);
        add(sool3);

        JLabel sool4 = new JLabel("안동소주");
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
