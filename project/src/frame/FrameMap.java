package frame;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import composition.MapButtonEvent;
import composition.MapButtonIcon;

public class FrameMap extends JPanel {

	public FrameMap() {

		setLayout(null);
		// 버튼 생성
		MapButtonIcon bi = new MapButtonIcon();
		JButton gyeonggibutton = (JButton) add(bi.GyeonggiIcon());
		JButton gangbutton = (JButton) add(bi.GangIcon());
		JButton chungbutton = (JButton) add(bi.ChungIcon());
		JButton gyeongsangbutton = (JButton) add(bi.GyeongsangIcon());
		JButton jeollabutton = (JButton) add(bi.JeollaIcon());
		JButton Jejubutton = (JButton) add(bi.JejuIcon());

		// 버튼 이벤트
		MapButtonEvent be = new MapButtonEvent();
		be.GyeonggiSoolEvent(gyeonggibutton);
		be.GangwonSoolEvent(gangbutton);
		be.ChungcheongSoolEvent(chungbutton);
		be.GyeongsangSoolEvent(gyeongsangbutton);
		be.JeollaSoolEvent(jeollabutton);
		be.JejuSoolEvent(Jejubutton);

		JLabel ilbl = new JLabel();
		ImageIcon a1 = new ImageIcon("./src/image/사진최종2.png");
		Image b = a1.getImage();
		Image c = b.getScaledInstance(600, 760, Image.SCALE_SMOOTH);
		ImageIcon d = new ImageIcon(c);
		ilbl.setIcon(d);
		ilbl.setBounds(0, 0, 600, 760);
		add(ilbl);

		frame.CustomFont baemin = new frame.CustomFont();
		JButton map = new JButton();
		map.setBounds(75, 10, 450, 100);
		Font mm = baemin.hwajinTitleFont();
		map.setFont(mm);
		map.setText("지역을 선택하세요");
		map.setBorderPainted(false);
		map.setContentAreaFilled(false);
		map.setFocusPainted(false);

		add(map);
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