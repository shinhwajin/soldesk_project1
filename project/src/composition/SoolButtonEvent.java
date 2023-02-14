package composition;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import SoolVO.ItemDAO;
import SoolVO.Items;
import frame.FrameBase;
import frame.soolPanel.SoolInfo;

public class SoolButtonEvent extends JFrame {
	public static String name;
	public static String dnaga;
	public static String itemInfo;
	public static ImageIcon icon;
	public static ImageIcon icon2;
	public static ImageIcon homeImg;
	public static int goodsNo;
	public static int home;

	Button b = new Button();

	// 술 상세페이지로 이동
	public void Sool(JButton be) {

		be.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ItemDAO();
				JButton button = (JButton) e.getSource(); // 눌린 버튼의 소스를 버튼으로 캐스팅
				if (button.getName().equals(be.getName())) { // 눌러진 버튼과 이미지 이름이 같을경우
					for (Items i : ItemDAO.soolList) {
						name = i.getgName(); // 변수에 이름 0번부터 끝까지 저장
						if (be.getName().equals(name)) { // 이미지 버튼 이름과 리스트 이름이 같을경우
							dnaga = (Integer.toString(i.getDanga())); // 라벨은 스트링만 입력 되므로 스트링으로 캐스팅
							itemInfo = i.getItemInfo(); // 정보 저장
							goodsNo = i.getGoodsNo();

							homeImg = new ImageIcon(i.getItemurl());// 이미지 가져오기
							Image homeImg2 = homeImg.getImage();// 이미지를 설정크기에 맞도록 설정
							Image chagehome = homeImg2.getScaledInstance(240, 320, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록
																										// 설정
							ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
							icon = changehomeImg;

							ImageIcon homeImg0 = new ImageIcon(i.getItemurl2());// 이미지 가져오기
							Image homeImg20 = homeImg0.getImage();// 이미지를 설정크기에 맞도록 설정
							Image chagehome0 = homeImg20.getScaledInstance(300, 200, Image.SCALE_SMOOTH);// 이미지를 설정크기에
																											// 맞도록 설정
							ImageIcon changehomeImg0 = new ImageIcon(chagehome0);// 이미지를 설정크기에 맞도록 설정
							icon2 = changehomeImg0;

							break;
						}
					}
				}
				if (e.getActionCommand().equals("구매하기")) {
					home = 1;
					
				}
				FrameBase.cardPanel.add("sool", new SoolInfo());// 패널을 새로운 정보를 적용해서 덮어씀
				FrameBase.layout.show(FrameBase.cardPanel, "sool");
				revalidate();
				repaint();// 새로고침
			}
		});

	}

}
