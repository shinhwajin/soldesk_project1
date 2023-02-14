package composition;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import frame.FrameBase;

public class MapButtonEvent extends JFrame {

	public static int num = 0;
	// 경기도 지역 페이지 이동

	public void GyeonggiSoolEvent(JButton be) {
		be.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "ggsool");
			}
		});

	}

	// 강원도 지역 페이지 이동
	public void GangwonSoolEvent(JButton be) {
		be.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "gangwonsool");
			}
		});

	}

	// 강원도 지역 페이지 이동
	public void ChungcheongSoolEvent(JButton be) {
		be.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "ccsool");
			}
		});

	}

	// 강원도 지역 페이지 이동
	public void GyeongsangSoolEvent(JButton be) {
		be.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "gssool");
			}
		});

	}

	// 강원도 지역 페이지 이동
	public void JeollaSoolEvent(JButton be) {
		be.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "jlsool");
			}
		});

	}

	// 강원도 지역 페이지 이동
	public void JejuSoolEvent(JButton be) {
		be.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.layout.show(FrameBase.cardPanel, "jjsool");
			}
		});

	}

	public void BackEvent(JButton be) {
		be.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (num == 0)
					FrameBase.layout.show(FrameBase.cardPanel, "fm");
				else {
					FrameBase.layout.show(FrameBase.cardPanel, "fh");
					num = 0;
				}
			}
		});
	}

}
