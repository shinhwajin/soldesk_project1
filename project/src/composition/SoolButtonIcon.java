package composition;

import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SoolButtonIcon extends JPanel{


	public Component GyeonggiSoolIcon() {

		//경기도
		//=========================남한산성 술 이미지=====================
		ImageIcon soolImg = new ImageIcon("./src/image/1/남한산성.png");// 이미지 가져오기
		Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
		JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

		// 버튼 설정
		soolbutton.setBounds(0,0, 0, 0);// 버튼 위치 크기
		soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
		//soolbutton.setBorderPainted(false);// 버튼 테두리 제거
		//soolbutton.setFocusPainted(false);// 선택데두리 제거
		return add(soolbutton);// 버튼추가
	}
	//=========================문배주 술 이미지=========================
	public Component GyeonggiSoolIcon2() {
		ImageIcon sool2Img = new ImageIcon("./src/image/1/문배주.png");// 이미지 가져오기
		Image sool2Img2 = sool2Img.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagesool2 = sool2Img2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changesool2Img = new ImageIcon(chagesool2);// 이미지를 설정크기에 맞도록 설정
		JButton soolbutton2 = new JButton(changesool2Img);// 버튼을 이미지로 변경

		// 버튼 설정
		soolbutton2.setBounds(0,0, 0, 0);// 버튼 위치 크기
		soolbutton2.setContentAreaFilled(false);// 버튼 배경삭제
		//soolbutton2.setBorderPainted(false);// 버튼 테두리 제거
		//soolbutton2.setFocusPainted(false);// 선택데두리 제거
		return add(soolbutton2);// 버튼추가
	}
	//=========================옥로주 술 이미지=========================
	public Component GyeonggiSoolIcon3() {
		ImageIcon sool3Img = new ImageIcon("./src/image/1/옥로주.png");// 이미지 가져오기
		Image sool3Img2 = sool3Img.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagesool3 = sool3Img2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changesool3Img = new ImageIcon(chagesool3);// 이미지를 설정크기에 맞도록 설정
		JButton soolbutton3 = new JButton(changesool3Img);// 버튼을 이미지로 변경

		// 버튼 설정
		soolbutton3.setBounds(0,0, 0, 0);// 버튼 위치 크기
		soolbutton3.setContentAreaFilled(false);// 버튼 배경삭제
		//soolbutton3.setBorderPainted(false);// 버튼 테두리 제거
		//soolbutton3.setFocusPainted(false);// 선택데두리 제거
		return add(soolbutton3);// 버튼추가
	}
	//=========================천비향 술 이미지=========================
	public Component GyeonggiSoolIcon4() {
		ImageIcon sool4Img = new ImageIcon("./src/image/1/천비향.png");// 이미지 가져오기
		Image sool4Img2 = sool4Img.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagesool4 = sool4Img2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changesool4Img = new ImageIcon(chagesool4);// 이미지를 설정크기에 맞도록 설정
		JButton soolbutton4 = new JButton(changesool4Img);// 버튼을 이미지로 변경

		// 버튼 설정
		soolbutton4.setBounds(0,0, 0, 0);// 버튼 위치 크기
		soolbutton4.setContentAreaFilled(false);// 버튼 배경삭제
		//soolbutton4.setBorderPainted(false);// 버튼 테두리 제거
		//soolbutton4.setFocusPainted(false);// 선택데두리 제거
		return add(soolbutton4);// 버튼추가
	}

	//강원도

	public Component GangwonSoolIcon() {

		
		//=========================대관령 술 이미지=====================
		ImageIcon soolImg = new ImageIcon("./src/image/2/대관령.png");// 이미지 가져오기
		Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
		JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경


		// 버튼 설정
		soolbutton.setBounds(0,0, 0, 0);// 버튼 위치 크기
		soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
		//soolbutton.setBorderPainted(false);// 버튼 테두리 제거
		//soolbutton.setFocusPainted(false);// 선택데두리 제거
		return add(soolbutton);// 버튼추가
	}

	
	public Component GangwonSoolIcon2() {

		
		//=========================동강더덕주 술 이미지=====================
		ImageIcon soolImg = new ImageIcon("./src/image/2/동강더덕주.png");// 이미지 가져오기
		Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
		JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경


		// 버튼 설정
		soolbutton.setBounds(0,0, 0, 0);// 버튼 위치 크기
		soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
		//soolbutton.setBorderPainted(false);// 버튼 테두리 제거
		//soolbutton.setFocusPainted(false);// 선택데두리 제거
		return add(soolbutton);// 버튼추가
	}

	
	public Component GangwonSoolIcon3() {

	
		//=========================동정춘 술 이미지=====================
		ImageIcon soolImg = new ImageIcon("./src/image/2/동정춘.png");// 이미지 가져오기
		Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
		JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경


		// 버튼 설정
		soolbutton.setBounds(0,0, 0, 0);// 버튼 위치 크기
		soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
		//soolbutton.setBorderPainted(false);// 버튼 테두리 제거
		//soolbutton.setFocusPainted(false);// 선택데두리 제거
		return add(soolbutton);// 버튼추가
	}

	public Component GangwonSoolIcon4() {

		
		//=========================설궁 술 이미지=====================
		ImageIcon soolImg = new ImageIcon("./src/image/2/설궁.png");// 이미지 가져오기
		Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
		Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
		ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
		JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경


		// 버튼 설정
		soolbutton.setBounds(0,0, 0, 0);// 버튼 위치 크기
		soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
		//soolbutton.setBorderPainted(false);// 버튼 테두리 제거
		//soolbutton.setFocusPainted(false);// 선택데두리 제거
		return add(soolbutton);// 버튼추가
	}

	// 충청도
		public Component ChungcheongIcon1() {

			// =========================면천두견주 이미지=====================
			ImageIcon soolImg = new ImageIcon("./src/image/3/면천두견주.png");// 이미지 가져오기
			Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
			Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
			ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
			JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

			// 버튼 설정
			soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
			soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
			// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
			// soolbutton.setFocusPainted(false);// 선택데두리 제거
			return add(soolbutton);// 버튼추가
		}

		public Component ChungcheongIcon2() {

			// =========================백련생막걸리 술 이미지=====================
			ImageIcon soolImg = new ImageIcon("./src/image/3/백련생막걸리.png");// 이미지 가져오기
			Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
			Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
			ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
			JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

			// 버튼 설정
			soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
			soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
			// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
			// soolbutton.setFocusPainted(false);// 선택데두리 제거
			return add(soolbutton);// 버튼추가
		}

		public Component ChungcheongIcon3() {

			// =========================청명주 이미지=====================
			ImageIcon soolImg = new ImageIcon("./src/image/3/청명주.png");// 이미지 가져오기
			Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
			Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
			ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
			JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

			// 버튼 설정
			soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
			soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
			// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
			// soolbutton.setFocusPainted(false);// 선택데두리 제거
			return add(soolbutton);// 버튼추가
		}

		public Component ChungcheongIcon4() {

			
			//=========================한산소곡주 이미지=====================
			ImageIcon soolImg = new ImageIcon("./src/image/3/한산소곡주.png");// 이미지 가져오기
			Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
			Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
			ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
			JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경


			// 버튼 설정
			soolbutton.setBounds(0,0, 0, 0);// 버튼 위치 크기
			soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
			//soolbutton.setBorderPainted(false);// 버튼 테두리 제거
			//soolbutton.setFocusPainted(false);// 선택데두리 제거
			return add(soolbutton);// 버튼추가

		}
		
		// 경상도
			public Component GyeongsangIcon1() {

				// =========================과화주 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/4/과화주.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

				// 버튼 설정
				soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				// soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가
			}

			public Component GyeongsangIcon2() {

				// =========================교동법주 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/4/교동법주.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

				// 버튼 설정
				soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				// soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가
			}

			public Component GyeongsangIcon3() {

				// =========================국화주 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/4/국화주.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

				// 버튼 설정
				soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				// soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가
			}

			public Component GyeongsangIcon4() {

				
				//=========================안동소주 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/4/안동소주.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경


				// 버튼 설정
				soolbutton.setBounds(0,0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				//soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				//soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가

			}
			
			
			// 전라도
			public Component JeollaIcon1() {

				// =========================고구마 아락 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/5/고구마 아락.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

				// 버튼 설정
				soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				// soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가
			}

			public Component JeollaIcon2() {

				// =========================자희향 나비 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/5/자희향 나비.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

				// 버튼 설정
				soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				// soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가
			}

			public Component JeollaIcon3() {

				// =========================죽력고 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/5/죽력고.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

				// 버튼 설정
				soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				// soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가
			}

			public Component JeollaIcon4() {

				
				//=========================추성주 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/5/추성주.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경


				// 버튼 설정
				soolbutton.setBounds(0,0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				//soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				//soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가

			}
			
			// 제주도
			public Component JejuIcon1() {

				// =========================고소리 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/6/고소리.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

				// 버튼 설정
				soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				// soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가
			}

			public Component JejuIcon2() {

				// =========================녹고의눈물 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/6/녹고의눈물.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

				// 버튼 설정
				soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				// soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가
			}

			public Component JejuIcon3() {

				// =========================세우리 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/6/세우리.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경

				// 버튼 설정
				soolbutton.setBounds(0, 0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				// soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				// soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가
			}

			public Component JejuIcon4() {

				
				//=========================허벅술 이미지=====================
				ImageIcon soolImg = new ImageIcon("./src/image/6/허벅술.png");// 이미지 가져오기
				Image soolImg2 = soolImg.getImage();// 이미지를 설정크기에 맞도록 설정
				Image chagesool = soolImg2.getScaledInstance(185, 250, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
				ImageIcon changesoolImg = new ImageIcon(chagesool);// 이미지를 설정크기에 맞도록 설정
				JButton soolbutton = new JButton(changesoolImg);// 버튼을 이미지로 변경


				// 버튼 설정
				soolbutton.setBounds(0,0, 0, 0);// 버튼 위치 크기
				soolbutton.setContentAreaFilled(false);// 버튼 배경삭제
				//soolbutton.setBorderPainted(false);// 버튼 테두리 제거
				//soolbutton.setFocusPainted(false);// 선택데두리 제거
				return add(soolbutton);// 버튼추가

			}

}

