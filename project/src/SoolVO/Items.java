package SoolVO;

import javax.swing.ImageIcon;

public class Items {

	// 상품
	int goodsNo; // 상품코드
	String gName; // 상품명
	int danga; // 단가
	int count;//수량
	String itemInfo;//아이템 설명
	String itemurl;//술 이미지
	String itemurl2;//술 맛 향
	ImageIcon a;

	public Items() {
	
	}

	public String getItemurl2() {
		return itemurl2;
	}
	public void setItemurl2(String itemurl2) {
		this.itemurl2 = itemurl2;
	}
	public String getItemurl() {
		return itemurl;
	}
	public void setItemurl(String itemurl) {
		this.itemurl = itemurl;
	}
	public int getGoodsNo() {
		return goodsNo;
	}
	public void setGoodsNo(int goodsNo) {
		this.goodsNo = goodsNo;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public int getDanga() {
		return danga;
	}
	public void setDanga(int danga) {
		this.danga = danga;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}
	
	
	public ImageIcon getA() {
		return a;
	}

	public void setA(ImageIcon a) {
		this.a = a;
	}

	public Items(int goodsNo, String gName, int danga, String itemurl,String itemurl2, String itemInfo) {
		super();
		this.goodsNo = goodsNo;
		this.gName = gName;
		this.danga = danga;
		this.count = count;
		this.itemInfo = itemInfo;
		this.itemurl = itemurl;
		this.itemurl2 = itemurl2;
	}
	public Items(String gName, int danga, int count, ImageIcon a) {
	
		this.gName = gName;
		this.danga = danga;
		this.count = count;
		this.a = a;
	}
	// 상품리스트 출력할 메서드
	public String toString() {
		return  getgName() + "\t" + getDanga()+"\t"+count;
	}
	
	
}
