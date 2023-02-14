package frame;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Images extends JPanel {

	public static int bg = 3;
	Image chagebg;

	// ==========================================배경이미지========================================================

	public Image Bg1() {
		ImageIcon bgImg = new ImageIcon("./src/image/bg1.png");// 배경 이미지 가져오기
		Image bgImg2 = bgImg.getImage();// 이미지를 설정크기에 맞도록 설정
		chagebg = bgImg2.getScaledInstance(600, 850, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changebgImg = new ImageIcon(chagebg);// 이미지 가져오기
		return chagebg;
	}

	public Image Bg2() {
		ImageIcon bgImg = new ImageIcon("./src/image/bg2.png");// 배경 이미지 가져오기
		Image bgImg2 = bgImg.getImage();// 이미지를 설정크기에 맞도록 설정
		chagebg = bgImg2.getScaledInstance(600, 850, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changebgImg = new ImageIcon(chagebg);// 이미지 가져오기
		return chagebg;
	}

	public Image Bg3() {
		ImageIcon bgImg = new ImageIcon("./src/image/bg3.jpg");// 배경 이미지 가져오기
		Image bgImg2 = bgImg.getImage();// 이미지를 설정크기에 맞도록 설정
		chagebg = bgImg2.getScaledInstance(600, 850, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changebgImg = new ImageIcon(chagebg);// 이미지 가져오기
		return chagebg;
	}

	public Image Bg4() {
		ImageIcon bgImg = new ImageIcon("./src/image/bg4.jpg");// 배경 이미지 가져오기
		Image bgImg2 = bgImg.getImage();// 이미지를 설정크기에 맞도록 설정
		chagebg = bgImg2.getScaledInstance(600, 850, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changebgImg = new ImageIcon(chagebg);// 이미지 가져오기
		return chagebg;
	}

	// ==========================================홈랜덤이미지========================================================

	public ImageIcon HomeRandom(String icon) {
		ImageIcon random = new ImageIcon(icon);// 배경 이미지 가져오기
		Image random2 = random.getImage();// 이미지를 설정크기에 맞도록 설정
		Image randombg = random2.getScaledInstance(180, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon randombg2 = new ImageIcon(randombg);// 이미지 가져오기
		return randombg2;
	}

}
