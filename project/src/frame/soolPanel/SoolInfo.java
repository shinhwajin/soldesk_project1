package frame.soolPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import SoolVO.ItemDAO;
import SoolVO.Items;
import composition.LoginInfo;
import composition.MapButtonIcon;
import composition.SoolButtonEvent;
import frame.CustomFont;
import frame.FrameBase;
import frame.FrameCart;
import frame.Images;

public class SoolInfo extends JPanel {

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

	ItemDAO itemDAO;

	public SoolInfo() {

		setLayout(null);
		setSize(600, 800);

		// 뒤로가기 버튼

		MapButtonIcon bi = new MapButtonIcon();

		JButton backbutton = (JButton) add(bi.BackButtonIcon());
		backbutton.setBounds(15, 15, 60, 60);

		// 술 이미지 가져오기

		JLabel ggsool = new JLabel(SoolButtonEvent.icon);
		ggsool.setBounds(20, 70, 240, 360);
		add(ggsool);
		JLabel ggsoolG = new JLabel(SoolButtonEvent.icon2);
		ggsoolG.setBounds(270, 60, 300, 260);
		add(ggsoolG);

		// 상품설명
		Font font = new Font("Arial", Font.PLAIN, 22);
		TextArea text = new TextArea(" ◆ 술 이름 : " + SoolButtonEvent.name + "\n\n ◆ 가격 : " + SoolButtonEvent.dnaga
				+ "\n\n ◆ 상세설명 : " + SoolButtonEvent.itemInfo, 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		text.setBounds(5, 430, 580, 261);
		text.setFont(font);
		text.setEditable(false);// 텍스트 입력 x
		text.setBackground(Color.WHITE);
		add(text);

		// =============구매 버튼===============

		CustomFont baemin = new CustomFont();
		Font font1 = baemin.hwajinFont1();
		JLabel q = new JLabel("수량");
		q.setBounds(285, 320, 80, 20);
		q.setFont(font1);

		// 구매 수량 버튼 생성
		JButton cartminus = (JButton) add(bi.CartminusButtonIcon());
		cartminus.setBounds(320, 310, 40, 40);

		// 구매 수량 카운트 박스

		JTextField count = new JTextField("1");
		count.setBounds(360, 320, 80, 20);
		count.setHorizontalAlignment(JTextField.RIGHT);

		JButton cartplus = (JButton) add(bi.CartplusButtonIcon());
		cartplus.setBounds(440, 310, 40, 40);

		// 장바구니 버튼
		ImageIcon a1 = new ImageIcon("./src/image/장바구니.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(94, 52, Image.SCALE_SMOOTH);
		ImageIcon a4 = new ImageIcon(a3);
		JButton button1 = new JButton(a4);
		button1.setBounds(320, 360, 94, 52);
		button1.setBorderPainted(true);
		button1.setContentAreaFilled(true);
		button1.setFocusPainted(true);
		add(button1);

		ImageIcon b1 = new ImageIcon("./src/image/바로구매.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(94, 52, Image.SCALE_SMOOTH);
		ImageIcon b4 = new ImageIcon(b3);
		JButton button2 = new JButton(b4);
		button2.setBounds(430, 360, 94, 52);
		button2.setBorderPainted(true);
		button2.setContentAreaFilled(true);
		button2.setFocusPainted(false);
		add(button2);

		backbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (SoolButtonEvent.home == 1) {
					FrameBase.layout.show(FrameBase.cardPanel, "fh");
					SoolButtonEvent.home = 0;

				} else if (SoolButtonEvent.goodsNo < 1005) {
					FrameBase.layout.show(FrameBase.cardPanel, "ggsool");
				} else if (SoolButtonEvent.goodsNo < 1009) {
					FrameBase.layout.show(FrameBase.cardPanel, "gangwonsool");
				} else if (SoolButtonEvent.goodsNo < 1013) {
					FrameBase.layout.show(FrameBase.cardPanel, "ccsool");
				} else if (SoolButtonEvent.goodsNo < 1017) {
					FrameBase.layout.show(FrameBase.cardPanel, "gssool");
				} else if (SoolButtonEvent.goodsNo < 1021) {
					FrameBase.layout.show(FrameBase.cardPanel, "jlsool");
				} else if (SoolButtonEvent.goodsNo < 1025) {
					FrameBase.layout.show(FrameBase.cardPanel, "jjsool");
				}

			}
		});

		// =========================================================================
		// 버튼 클릭시 구매 개수 증감
		ActionListener cartplus1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(count.getText());
				i += 1;
				if (i > 10) {
					JOptionPane.showMessageDialog(count, "구매 가능한 개수 초과");
				} else {
					count.setText(String.valueOf(i));
				}
			}
		};

		cartplus.addActionListener(cartplus1);
		ActionListener cartminus1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(count.getText());
				i -= 1;
				if (i < 0) {
					JOptionPane.showMessageDialog(count, "1개 이상 구매 가능합니다");
				} else {
					count.setText(String.valueOf(i));
				}
			}
		};
		cartminus.addActionListener(cartminus1);
		// ======================================================================================
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (FrameBase.login == true) {
					if (!count.getText().equals("0")) {
						if (FrameCart.cartList.size() < 3) {
							FrameCart.cartList.add(new Items(SoolButtonEvent.name, Integer.parseInt(SoolButtonEvent.dnaga),
									Integer.parseInt(count.getText()), SoolButtonEvent.homeImg));
							JOptionPane.showMessageDialog(null, count.getText() + "병을 장바구니에 담았습니다");
							FrameBase.cardPanel.add("fc", new FrameCart());// 패널을 새로운 정보를 적용해서 덮어씀
						} else {
							JOptionPane.showMessageDialog(null, "장바구니에는 3가지 종류의 술까지만 담을 수 있습니다.");
						}
					} else {
						JOptionPane.showMessageDialog(null, "수량을 입력하세요");// 텍스트 박스 0이면
					}
				} else {
					new LoginInfo();
				}
				repaint();
				revalidate();
				// 텍스트박스의 수량이 0이 아니면
				
			}
		});

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (FrameBase.login == true) {
					if (!count.getText().equals("0")) {
			               JOptionPane.showMessageDialog(null, SoolButtonEvent.name+" "+count.getText()+"병 결제 완료되었습니다.");
			            } else {
			               JOptionPane.showMessageDialog(null, "수량을 입력하세요");
			            }
				} else {
					new LoginInfo();
				}
				repaint();
				revalidate();
				
			}
		});

		// 버튼을 패널에 붙임
		add(cartplus);
		add(cartminus);
		add(count);
		add(q);
	}

}
