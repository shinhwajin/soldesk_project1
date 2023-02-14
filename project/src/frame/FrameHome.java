package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import SoolVO.ItemDAO;
import SoolVO.Items;
import composition.SoolButtonEvent;
import composition.UserpageButton;

public class FrameHome extends JPanel {
	
	public static String icon1 = null;
	public static String icon2 = null;
	public static String icon3 = null;
	public static ImageIcon icon;
	int changebg;

	public FrameHome() {
		UserpageButton.num = 2;
		frame.CustomFont baemin = new frame.CustomFont();
		Font font = baemin.BuyFont();
		Font font2 = baemin.TitleFont();

		
		JLabel label = new JLabel("오늘의 추천");
		label.setBounds(0, 0, 600, 100);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(font2);
		label.setVisible(true);
		add(label);
		
		
		ImageIcon homeImg = new ImageIcon("./src/image/title.png");// 이미지 가져오기
		Image homeImg2 = homeImg.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagehome = homeImg2.getScaledInstance(200, 200, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
		
		JLabel label2 = new JLabel(changehomeImg);
		label2.setBounds(200, 480, 200, 200);
		label2.setVisible(true);
		add(label2);
		
		
		
		
		
		new ItemDAO();

		// 랜덤 전통주 생성
		ArrayList<String> list = new ArrayList<String>();
		int randomnum1 = (int) ((Math.random() * 23) + 1);
		int randomnum2 = (int) ((Math.random() * 23) + 1);
		int randomnum3 = (int) ((Math.random() * 23) + 1);

		String name1 = null;
		int danga1 = 0;
		
		String name2 = null;
		int danga2 = 0;
		
		String name3 = null;
		int danga3 = 0;
		
		
		for (Items i : ItemDAO.soolList) // 술 리스트의 이름들을 불러와 다른 리스트에 저장
			list.add(i.getgName());

		for (Items i : ItemDAO.soolList) { // 술리스트의 이름과 렌덤으로 뽑아온 이름이 같으면 정보 저장
			if (list.get(randomnum1).equals(i.getgName())) {
				name1 = i.getgName();
				danga1 = i.getDanga();
				icon1 = i.getItemurl();
			}
		}
		while (true) { // 1번 렌덤과 중복되면 다시 뽑기
			if (name1.equals(list.get(randomnum2)))
				randomnum2 = (int) ((Math.random() * 23) + 1);
			else {
				break;
			}
		}
		for (Items i : ItemDAO.soolList) { // 중복이 안된 번호로 술 정보 불러옴
			if (list.get(randomnum2).equals(i.getgName())) {
				name2 = i.getgName();
				danga2 = i.getDanga();
				icon2 = i.getItemurl();
			}
		}

		while (true) { // 1번 2번렌덤과 중복되면 다시 뽑기
			if (name1.equals(list.get(randomnum3)) || name2.equals(list.get(randomnum3)))
				randomnum3 = (int) ((Math.random() * 23) + 1);
			else {
				break;
			}
		}
		for (Items i : ItemDAO.soolList) { // 중복이 안된 번호로 술 정보 불러옴
			if (list.get(randomnum3).equals(i.getgName())) {
				name3 = i.getgName();
				danga3 = i.getDanga();
				icon3 = i.getItemurl();
			}
		}
		Images image = new Images();
		JButton random1 = new JButton(image.HomeRandom(icon1));
		setLayout(null);
		random1.setBounds(10, 120, 180, 250);
		random1.setVisible(true);
		random1.setBorderPainted(false);// 버튼 테두리 제거
		random1.setFocusPainted(false);// 선택데두리 제거
		add(random1);

		JLabel label1_1 = new JLabel(" 이름 : " + name1);
		label1_1.setBounds(10, 365, 180, 30);
		label1_1.setVisible(true);
		label1_1.setFont(font);
		label1_1.setHorizontalAlignment(JLabel.CENTER);
		label1_1.setOpaque(true);
		label1_1.setBackground(Color.white);
		add(label1_1);

		JLabel label1_2 = new JLabel(" 가격 : " + danga1);
		label1_2.setBounds(10, 395, 180, 30);
		label1_2.setVisible(true);
		label1_2.setFont(font);
		label1_2.setHorizontalAlignment(JLabel.CENTER);
		label1_2.setOpaque(true);
		label1_2.setBackground(Color.white);
		add(label1_2);

		JButton random2 = new JButton(image.HomeRandom(icon2));
		setLayout(null);
		random2.setBounds(200, 120, 180, 250);
		random2.setVisible(true);
		random2.setBorderPainted(false);// 버튼 테두리 제거
		random2.setFocusPainted(false);// 선택데두리 제거
		add(random2);

		JLabel label2_1 = new JLabel(" 이름 : " + name2);
		label2_1.setBounds(200, 365, 180, 30);
		label2_1.setVisible(true);
		label2_1.setFont(font);
		label2_1.setHorizontalAlignment(JLabel.CENTER);
		label2_1.setOpaque(true);
		label2_1.setBackground(Color.white);
		add(label2_1);

		JLabel label2_2 = new JLabel(" 가격 : " + danga2);
		label2_2.setBounds(200, 395, 180, 30);
		label2_2.setVisible(true);
		label2_2.setFont(font);
		label2_2.setHorizontalAlignment(JLabel.CENTER);
		label2_2.setOpaque(true);
		label2_2.setBackground(Color.white);
		add(label2_2);

		JButton random3 = new JButton(image.HomeRandom(icon3));
		setLayout(null);
		random3.setBounds(390, 120, 180, 250);
		random3.setVisible(true);
		random3.setBorderPainted(false);// 버튼 테두리 제거
		random3.setFocusPainted(false);// 선택데두리 제거
		add(random3);

		JLabel label3_1 = new JLabel(" 이름 : " + name3);
		label3_1.setBounds(390, 365, 180, 30);
		label3_1.setVisible(true);
		label3_1.setFont(font);
		label3_1.setHorizontalAlignment(JLabel.CENTER);
		label3_1.setOpaque(true);
		label3_1.setBackground(Color.white);
		add(label3_1);

		JLabel label3_2 = new JLabel(" 가격 : " + danga3);
		label3_2.setBounds(390, 395, 180, 30);
		label3_2.setVisible(true);
		label3_2.setFont(font);
		label3_2.setHorizontalAlignment(JLabel.CENTER);
		label3_2.setOpaque(true);
		label3_2.setBackground(Color.white);
		add(label3_2);
		
		
		SoolButtonEvent be=new SoolButtonEvent();
		UserpageButton buy1 = new UserpageButton("구매하기");
		setLayout(null);
		buy1.setBounds(50, 440, 100, 30);
		buy1.setForeground(Color.decode("#690707"));
		buy1.setName(name1);
		be.Sool(buy1);
		buy1.setVisible(true);
		buy1.setFont(font);
		add(buy1);

		UserpageButton buy2 = new UserpageButton("구매하기");
		setLayout(null);
		buy2.setBounds(240, 440, 100, 30);
		buy2.setForeground(Color.decode("#690707"));
		buy2.setName(name2);
		be.Sool(buy2);
		buy2.setVisible(true);
		buy2.setFont(font);
		add(buy2);

		UserpageButton buy3 = new UserpageButton("구매하기");
		setLayout(null);
		buy3.setBounds(430, 440, 100, 30);
		buy3.setForeground(Color.decode("#690707"));
		buy3.setName(name3);
		be.Sool(buy3);
		buy3.setVisible(true);
		buy3.setFont(font);
		add(buy3);

		ImageIcon title = new ImageIcon("./src/image/title.png");// 이미지 가져오기
		Image title2 = title.getImage();// 이미지를 설정크기에 맞도록 설정
		Image title3 = title2.getScaledInstance(350, 350, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon title4 = new ImageIcon(title3);// 이미지를 설정크기에 맞도록 설정

		JButton icon = new JButton(title4);
		setLayout(null);
		icon.setBounds(125, 300, 350, 350);
		icon.setVisible(true);
		icon.setBorderPainted(false);// 버튼 테두리 제거
		icon.setFocusPainted(false);// 선택데두리 제거
		// add(icon);
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
