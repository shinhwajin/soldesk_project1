package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import SoolVO.Items;

public class FrameCart extends JPanel {

   public ImageIcon icon;
   public String name;
   public String dnaga;
   public static ArrayList<Items> cartList = new ArrayList<Items>();

   public FrameCart() {
      setSize(600, 800);// 프레임 크기 설정
      setLayout(null);// 레이아웃을 변경가능하게 설정
      frame.CustomFont baemin = new frame.CustomFont();
      Font font = baemin.hwajinTitleFont();
      int total = 0;

      JButton cart1button = new JButton("결제하기");
      cart1button.setContentAreaFilled(false);
      Font qq1=baemin.hayeongFont1();
      cart1button.setFont(qq1);
      Color qweqwe = new Color(051,000,102);
      cart1button.setForeground(qweqwe);
      Color asdasd=new Color(210,180,140);
      cart1button.setBackground(asdasd);
      cart1button.setOpaque(true);
      cart1button.setBounds(300, 600, 240, 80); // x,y,넓이,높이
      cart1button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(cartList.size()==0)
                  JOptionPane.showMessageDialog(null, "장바구니가 비었습니다.");
               else
                  JOptionPane.showMessageDialog(null, "결제 완료되었습니다.");
               cartList.removeAll(cartList);
               refresh();
            }
         });
      add(cart1button);

      JButton cart2button = new JButton("전체삭제");
      cart2button.setContentAreaFilled(false);
      Font qq2=baemin.hayeongFont1();
      cart2button.setFont(qq2);
      Color qweqwe1 =new Color(153,000,000);
      cart2button.setForeground(qweqwe1);
      Color asdasd1=new Color(210,180,140);
      cart2button.setBackground(asdasd1);
      cart2button.setOpaque(true);
      cart2button.setBounds(50, 600, 240, 80); // x,y,넓이,높이
      cart2button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(cartList.size()==0)
                  JOptionPane.showMessageDialog(null, "장바구니가 비었습니다.");
               else
                  JOptionPane.showMessageDialog(null, "삭제 완료되었습니다.");
               cartList.removeAll(cartList);
               refresh();
            }
         });
      add(cart2button);

      
      //상단 장바구니 디자인
      JLabel dz=new JLabel();
      ImageIcon random = new ImageIcon("./src/image/cart.png");// 배경 이미지 가져오기
      Image random2 = random.getImage();// 이미지를 설정크기에 맞도록 설정
      Image randombg = random2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
      ImageIcon qq = new ImageIcon(randombg);
      dz.setIcon(qq);
      dz.setBounds(20,10,60,60);
      add(dz);
      
      //이름라벨
      JLabel wkd = new JLabel();
      wkd.setBounds(100,10,250,60);
      Font ff= baemin.hayeongFont();
      wkd.setFont(ff);
      wkd.setText("장바구니");
      add(wkd);
      
      
      
      // 상품설명 라벨
      JLabel jlbl1 = new JLabel();
      jlbl1.setHorizontalAlignment(JLabel.CENTER);
      jlbl1.setBounds(160, 80, 350, 130);
      jlbl1.setBackground(Color.WHITE);
      jlbl1.setOpaque(true);
      add(jlbl1);

      JLabel jlbl2 = new JLabel();
      jlbl2.setHorizontalAlignment(JLabel.CENTER);
      jlbl2.setBounds(160, 230, 350, 130);
      jlbl2.setBackground(Color.WHITE);
      jlbl2.setOpaque(true);
      add(jlbl2);

      JLabel jlbl3 = new JLabel();
      jlbl3.setHorizontalAlignment(JLabel.CENTER);
      jlbl3.setBounds(160, 380, 350, 130);
      jlbl3.setBackground(Color.WHITE);
      jlbl3.setOpaque(true);
      add(jlbl3);

      // 상품이미지 라벨
      JLabel ilbl1 = new JLabel();
      ilbl1.setBounds(40, 80, 92, 125);
      add(ilbl1);

      JLabel ilbl2 = new JLabel();
      ilbl2.setBounds(40, 230, 92, 125);
      add(ilbl2);

      JLabel ilbl3 = new JLabel();
      ilbl3.setBounds(40, 380, 92, 125);
      add(ilbl3);

      // 라벨을 배열에 대입
      JLabel[] jlbl = { jlbl1, jlbl2, jlbl3 };
      JLabel[] ilbl = { ilbl1, ilbl2, ilbl3 };

      // 장바구니 출력
      for (int i = 0; i < cartList.size(); i++) {
         jlbl[i].setFont(qq2);
         jlbl[i].setFont(jlbl[i].getFont().deriveFont(25.0f));
         jlbl[i].setText("<html>상품명 : "+cartList.get(i).getgName() + ", " + cartList.get(i).getCount() + "개 "+"<br>===================<br>"
               + cartList.get(i).getDanga()*cartList.get(i).getCount() + "원<html>");
         Image Img = cartList.get(i).getA().getImage();// 이미지를 설정크기에 맞도록 설정
         Image Img2 = Img.getScaledInstance(92, 125, Image.SCALE_SMOOTH);// 이미지를 설정크기에 맞도록 설정
         ImageIcon Img3 = new ImageIcon(Img2);// 이미지를 설정크기에 맞도록 설정
            ilbl[i].setIcon(Img3);
               total += (cartList.get(i).getDanga()*cartList.get(i).getCount());
            }

            // 전체 결제금액
            JLabel jlblto = new JLabel();
            jlblto.setHorizontalAlignment(JLabel.CENTER);
            jlblto.setBounds(270, 530, 290, 40);
            jlblto.setOpaque(true);
            Font asd = baemin.hwajinFont2();
            jlblto.setFont(asd);
            jlblto.setBackground(Color.WHITE);
            add(jlblto);
            jlblto.setText("총 금액 : " + total + "원");

      
//=========================================================================================
      // 부분삭제
      // 장바구니 삭제 버튼
      JButton deletebutton1 = new JButton();
      deletebutton1.setBounds(520, 115, 30, 30);
      deletebutton1.setContentAreaFilled(false);
      deletebutton1.setBorderPainted(false);
      deletebutton1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "삭제되었습니다.");
            cartList.remove(cartList.get(0));
            refresh();
         }
      });
      add(deletebutton1);

      JButton deletebutton2 = new JButton();
      deletebutton2.setBounds(520, 265, 30, 30);
      deletebutton2.setContentAreaFilled(false);
      deletebutton2.setBorderPainted(false);
      deletebutton2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "삭제되었습니다.");
            cartList.remove(cartList.get(1));
            refresh();
         }
      });
      add(deletebutton2);

      JButton deletebutton3 = new JButton();
      deletebutton3.setBounds(520, 415, 30, 30);
      deletebutton3.setContentAreaFilled(false);
      deletebutton3.setBorderPainted(false);
      deletebutton3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "삭제되었습니다.");
            cartList.remove(cartList.get(2));
            refresh();
         }
      });
      add(deletebutton3);

      // 삭제버튼
      // 삭제버튼을 for로 돌려서 장바구니에 담겼을때 나오게끔 구현
      JButton[] btlb = { deletebutton1, deletebutton2, deletebutton3 };

      for (int k = 0; k < cartList.size(); k++) {
         ImageIcon a1 = new ImageIcon("./src/image/삭제.png");
         Image b1 = a1.getImage();
         Image c1 = b1.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
         ImageIcon d1 = new ImageIcon(c1);
         btlb[k].setIcon(d1);
      }
   }

//=================================================================   

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
   
   public void refresh() {
      FrameBase.cardPanel.add("fc", new FrameCart());// 패널을 새로운 정보를 적용해서 덮어씀
      FrameBase.layout.show(FrameBase.cardPanel, "fc");
      revalidate();
      repaint();// 새로고침
   }
   
//====================================================================================
   
   
   
   
}