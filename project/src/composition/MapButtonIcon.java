package composition;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MapButtonIcon extends JPanel {

   public static Cursor cursor = new Cursor(Cursor.HAND_CURSOR);// 버튼에 마우스가 올라갔을 때 손모양으로 변경
   
   public Component GyeonggiIcon() {
      
      // 경기도 버튼 생성
            ImageIcon gyeonggiImg = new ImageIcon("./src/image/경기도투명.png");// 이미지 가져오기
            Image gyeonggiImg2 = gyeonggiImg.getImage();// 이미지를 설정크기에 맞도록 설정
            Image chagehome = gyeonggiImg2.getScaledInstance(130, 130, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
            ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
            JButton gyeonggibutton = new JButton(changehomeImg);// 버튼을 이미지로 변경
            // 마우스가 버튼에 갔을때 이미지
            ImageIcon homerollImg = new ImageIcon("./src/image/경기도투명3.png");// 이미지 가져오기
            Image homerollImg2 = homerollImg.getImage();// 이미지를 설정크기에 맞도록 설정
            Image chagerollhome = homerollImg2.getScaledInstance(130, 130, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
            ImageIcon changehomerollImg = new ImageIcon(chagerollhome);// 이미지를 설정크기에 맞도록 설정
            gyeonggibutton.setRolloverIcon(changehomerollImg);// 버튼을 이미지로 변경
            // 버튼 설정
            gyeonggibutton.setBounds(65, 100, 140, 140);// 버튼 위치 크기
            gyeonggibutton.setBorderPainted(false);// 버튼 테두리 제거
            gyeonggibutton.setContentAreaFilled(false);// 버튼 배경삭제
            gyeonggibutton.setFocusPainted(false);// 선택데두리 제거
            return add(gyeonggibutton);// 버튼추가
      
      
   }
   
         public Component GangIcon() {
      
      // 강원도 버튼 생성
      ImageIcon gangImg = new ImageIcon("./src/image/강원도투명.png");// 이미지 가져오기
      Image gangImg2 = gangImg.getImage();// 이미지를 설정크기에 맞도록 설정
      Image chagehome = gangImg2.getScaledInstance(130, 130, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
      ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
      JButton gangbutton = new JButton(changehomeImg);// 버튼을 이미지로 변경
      // 버튼 설정
      ImageIcon homerollImg = new ImageIcon("./src/image/강원도투명3.png");// 이미지 가져오기
      Image homerollImg2 = homerollImg.getImage();// 이미지를 설정크기에 맞도록 설정
      Image chagerollhome = homerollImg2.getScaledInstance(130, 130, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
      ImageIcon changehomerollImg = new ImageIcon(chagerollhome);// 이미지를 설정크기에 맞도록 설정
      gangbutton.setRolloverIcon(changehomerollImg);// 버튼을 이미지로 변경
      // 버튼 설정
      gangbutton.setBounds(410, 110, 130, 130);// 버튼 위 치 크기
      gangbutton.setBorderPainted(false);// 버튼 테두리 제거
      gangbutton.setContentAreaFilled(false);// 버튼 배경삭제
      gangbutton.setFocusPainted(false);// 선택데두리 제거
      return add(gangbutton);// 버튼추가
      
   }
   
   
         public Component GyeongsangIcon() {
           
           // 경상도 버튼 생성
           ImageIcon gyeongsangImg = new ImageIcon("./src/image/경상도투명.png");// 이미지 가져오기
           Image gyeongsangImg2 = gyeongsangImg.getImage();// 이미지를 설정크기에 맞도록 설정
           Image chagehome = gyeongsangImg2.getScaledInstance(140, 140, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
           ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
           JButton gyeongsangbutton = new JButton(changehomeImg);// 버튼을 이미지로 변경

           // 마우스가 버튼에 갔을때 이미지
           ImageIcon homerollImg = new ImageIcon("./src/image/경상도투명3.png");// 이미지 가져오기
           Image homerollImg2 = homerollImg.getImage();// 이미지를 설정크기에 맞도록 설정
           Image chagerollhome = homerollImg2.getScaledInstance(140, 140, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
           ImageIcon changehomerollImg = new ImageIcon(chagerollhome);// 이미지를 설정크기에 맞도록 설정
           gyeongsangbutton.setRolloverIcon(changehomerollImg);// 버튼을 이미지로 변경
            // 버튼 설정
           gyeongsangbutton.setBounds(400, 410, 140, 140);// 버튼 위치 크기
           gyeongsangbutton.setBorderPainted(false);// 버튼 테두리 제거
          gyeongsangbutton.setContentAreaFilled(false);// 버튼 배경삭제
          gyeongsangbutton.setFocusPainted(false);// 선택데두리 제거
          return add(gyeongsangbutton);// 버튼추가
      
   }
   
     
         public Component JeollaIcon() {
            
              // 전라도 버튼 생성
           ImageIcon jeollaImg = new ImageIcon("./src/image/전라도투명.png");// 이미지 가져오기
           Image jeollaImg2 = jeollaImg.getImage();// 이미지를 설정크기에 맞도록 설정
           Image chagehome = jeollaImg2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
           ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
           JButton jeollabutton = new JButton(changehomeImg);// 버튼을 이미지로 변경

           // 마우스가 버튼에 갔을때 이미지
           ImageIcon homerollImg = new ImageIcon("./src/image/전라도투명3.png");// 이미지 가져오기
           Image homerollImg2 = homerollImg.getImage();// 이미지를 설정크기에 맞도록 설정
           Image chagerollhome = homerollImg2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
           ImageIcon changehomerollImg = new ImageIcon(chagerollhome);// 이미지를 설정크기에 맞도록 설정
           jeollabutton.setRolloverIcon(changehomerollImg);// 버튼을 이미지로 변경
                 // 버튼 설정
           jeollabutton.setBounds(10, 480, 150, 150);// 버튼 위치 크기
           jeollabutton.setBorderPainted(false);// 버튼 s테두리 제거
          jeollabutton.setContentAreaFilled(false);// 버튼 배경삭제
          jeollabutton.setFocusPainted(false);// 선택데두리 제거
          return add(jeollabutton);// 버튼추가
           
        }
       
         public Component JejuIcon(){
             
              // 제주도 버튼 생성
           ImageIcon jejuImg = new ImageIcon("./src/image/제주도투명.png");// 이미지 가져오기
           Image jejuImg2 = jejuImg.getImage();// 이미지를 설정크기에 맞도록 설정
           Image chagehome = jejuImg2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
           ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
           JButton jejubutton = new JButton(changehomeImg);// 버튼을 이미지로 변경

           // 마우스가 버튼에 갔을때 이미지
           ImageIcon homerollImg = new ImageIcon("./src/image/제주도투명3.png");// 이미지 가져오기
           Image homerollImg2 = homerollImg.getImage();// 이미지를 설정크기에 맞도록 설정
           Image chagerollhome = homerollImg2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
           ImageIcon changehomerollImg = new ImageIcon(chagerollhome);// 이미지를 설정크기에 맞도록 설정
           jejubutton.setRolloverIcon(changehomerollImg);// 버튼을 이미지로 변경
                  // 버튼 설정
           jejubutton.setBounds(250, 500, 150, 150);// 버튼 위치 크기
           jejubutton.setBorderPainted(false);// 버튼 테두리 제거
          jejubutton.setContentAreaFilled(false);// 버튼 배경삭제
          jejubutton.setFocusPainted(false);// 선택데두리 제거
          return add(jejubutton);// 버튼추가
            
         }
         
         public Component ChungIcon() {
              
              // 충청도 버튼 생성
           ImageIcon chungImg = new ImageIcon("./src/image/충청도투명.png");// 이미지 가져오기
           Image chungImg2 = chungImg.getImage();// 이미지를 설정크기에 맞도록 설정
           Image chagehome = chungImg2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
           ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
           JButton chungbutton = new JButton(changehomeImg);// 버튼을 이미지로 변경

           // 마우스가 버튼에 갔을때 이미지
           ImageIcon homerollImg = new ImageIcon("./src/image/충청도투명3.png");// 이미지 가져오기
           Image homerollImg2 = homerollImg.getImage();// 이미지를 설정크기에 맞도록 설정
           Image chagerollhome = homerollImg2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
           ImageIcon changehomerollImg = new ImageIcon(chagerollhome);// 이미지를 설정크기에 맞도록 설정
           chungbutton.setRolloverIcon(changehomerollImg);// 버튼을 이미지로 변경
                   // 버튼 설정
           chungbutton.setBounds(30, 260, 150, 150);// 버튼 위치 크기
           chungbutton.setBorderPainted(false);// 버튼 테두리 제거
          chungbutton.setContentAreaFilled(false);// 버튼 배경삭제
          chungbutton.setFocusPainted(false);// 선택데두리 제거
          return add(chungbutton);// 버튼추가
             
          } 
        public Component BackButtonIcon() {
       // 뒤로가기 버튼 생성
       ImageIcon backImg = new ImageIcon("./src/image/backbutton.png");// 이미지 가져오기
       Image backImg2 = backImg.getImage();// 이미지를 설정크기에 맞도록 설정
       Image chagehome = backImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
       ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
       JButton backbutton = new JButton(changehomeImg);// 버튼을 이미지로 변경
 
       // 마우스가 버튼에 갔을때 이미지
       ImageIcon homerollImg = new ImageIcon("./src/image/backbutton2.png");// 이미지 가져오기
       Image homerollImg2 = homerollImg.getImage();// 이미지를 설정크기에 맞도록 설정
       Image chagerollhome = homerollImg2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
       ImageIcon changehomerollImg = new ImageIcon(chagerollhome);// 이미지를 설정크기에 맞도록 설정
       backbutton.setRolloverIcon(changehomerollImg);// 버튼을 이미지로 변경
 
       // 버튼 설정
       backbutton.setBounds(0,0, 100, 100);// 버튼 위치 크기
       backbutton.setBorderPainted(false);// 버튼 테두리 제거
       backbutton.setContentAreaFilled(false);// 버튼 배경삭제
       backbutton.setFocusPainted(false);// 선택데두리 제거
       return add(backbutton);// 버튼추가
 
    }


    public Component CartplusButtonIcon() {
       // 구매수량 카운트 버튼 생성(+)
       ImageIcon cartplusImg = new ImageIcon("./src/image/plus.png");// 이미지 가져오기
       Image cartplusImg2 = cartplusImg.getImage();// 이미지를 설정크기에 맞도록 설정
       Image chagehome = cartplusImg2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
       ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
       JButton cartplus = new JButton(changehomeImg);// 버튼을 이미지로 변경

       // 마우스가 버튼에 갔을때 이미지
       ImageIcon cartplusrollImg = new ImageIcon("./src/image/plus.png");// 이미지 가져오기
       Image cartplusrollImg2 =cartplusrollImg.getImage();// 이미지를 설정크기에 맞도록 설정
       Image chagerollcartplus = cartplusrollImg2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
       ImageIcon changecartplusrollImg = new ImageIcon(chagerollcartplus);// 이미지를 설정크기에 맞도록 설정
       cartplus.setRolloverIcon(changecartplusrollImg);// 버튼을 이미지로 변경

       // 버튼 설정
       cartplus.setBounds(0,0, 0, 0);// 버튼 위치 크기
       cartplus.setBorderPainted(false);// 버튼 테두리 제거
       cartplus.setContentAreaFilled(false);// 버튼 배경삭제
       cartplus.setFocusPainted(false);// 선택데두리 제거
       return add(cartplus);// 버튼추가


    }
    public Component CartminusButtonIcon() {
       // 구매수량 카운트 버튼 생성(-)
       ImageIcon cartminusImg = new ImageIcon("./src/image/minus.png");// 이미지 가져오기
       Image cartminusImg2 = cartminusImg.getImage();// 이미지를 설정크기에 맞도록 설정
       Image chagehome = cartminusImg2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
       ImageIcon changehomeImg = new ImageIcon(chagehome);// 이미지를 설정크기에 맞도록 설정
       JButton cartminus = new JButton(changehomeImg);// 버튼을 이미지로 변경

       // 마우스가 버튼에 갔을때 이미지
       ImageIcon cartminussrollImg = new ImageIcon("./src/image/minus.png");// 이미지 가져오기
       Image cartminusrollImg2 =cartminussrollImg.getImage();// 이미지를 설정크기에 맞도록 설정
       Image chagerollcartminus = cartminusrollImg2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
       ImageIcon changecartminusrollImg = new ImageIcon(chagerollcartminus);// 이미지를 설정크기에 맞도록 설정
       cartminus.setRolloverIcon(changecartminusrollImg);// 버튼을 이미지로 변경

       // 버튼 설정
       cartminus.setBounds(0,0, 0, 0);// 버튼 위치 크기
       cartminus.setBorderPainted(false);// 버튼 테두리 제거
       cartminus.setContentAreaFilled(false);// 버튼 배경삭제
       cartminus.setFocusPainted(false);// 선택데두리 제거
       return add(cartminus);// 버튼추가
    }
 }

         