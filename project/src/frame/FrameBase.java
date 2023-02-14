package frame;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Game.Game1;
import Game.Game2;
import Game.Game3;
import composition.Button;
import frame.soolPanel.ChungcheongSool;
import frame.soolPanel.GangwonSool;
import frame.soolPanel.GyeonggiSool;
import frame.soolPanel.GyeongsangSool;
import frame.soolPanel.JejuSool;
import frame.soolPanel.JeollaSool;

public class FrameBase extends JFrame {

	JPanel panel;
	public static JPanel cardPanel;
	public static CardLayout layout;
	Label label;
	public static boolean login = false;
	public static int success;
	public static int home=1;

	
	public void Frame() {
		cardPanel = new JPanel();//종이에 패널을 붙히고 이름을 지정 한 여러장의 카드로 리스트 저장 후 이름을 호출해 카드를 불러옴
		layout = new CardLayout();
		cardPanel.setLayout(layout);
		cardPanel.add("fh", new FrameHome());
		
		//게임페널
		cardPanel.add("game1",new Game1());
		cardPanel.add("game2",new Game2());
		cardPanel.add("game3",new Game3());
		
		// 지역별 술 페널
		cardPanel.add("ggsool", new GyeonggiSool());
		cardPanel.add("gangwonsool", new GangwonSool());
		cardPanel.add("ccsool", new ChungcheongSool());
		cardPanel.add("gssool", new GyeongsangSool());
		cardPanel.add("jlsool", new JeollaSool());
		cardPanel.add("jjsool", new JejuSool());
		
		setTitle("술팜");//타이틀이름 변경
		ImageIcon titleImg = new ImageIcon("./src/image/title.png");
		Image image = titleImg.getImage();// 타이틀 이미지
		setIconImage(image);// 타이틀 이미지 추가
		
		setSize(600, 800);//프레임 크기
		setVisible(true);//프레임 보이게
		setResizable(false);//크기조절불가
		setLocationRelativeTo(null);// 프레임이 화면 중앙에 나옴
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 프레임이 정상 종료되도록 설정

		panel = new JPanel(new GridLayout(0, 5));// 밑에 버튼 갯수
		Button button = new Button();

		button.HomeButton(button.HomeIcon(), button.HomeRoll(), panel);
		button.MapButton(button.MapIcon(), button.MapRoll(), panel);
		button.GameButton(button.GameIcon(), button.GameRoll(), panel);
		button.CartButton(button.CartIcon(), button.CartRoll(), panel);
		button.UserButton(button.UserIcon(), button.UserRoll(), panel);
		
		add(cardPanel);
		add(panel, "South");
		
		revalidate();
		repaint();
	}
}
