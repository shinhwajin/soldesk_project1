package SoolVO;

public class Cart {
	int count; // 수량
	int total; // 합계
	Items goods;

	Cart() {

	}

	Cart(Items goods, int count) {
		this.goods = goods;
		this.count = count;
		this.total = (int) (goods.danga * count); // 합계= 상품의단가 * 수량
	}

	public int getCount() {
		return count;
	}

	public int getTotal() {
		return total;
	}

	public Items getGoods() {
		return goods;
	}

	// 장바구니 출력할 메서드
	public String toString() {
		return goods.goodsNo + "\t" + goods.gName + "\t" + goods.danga + "\t" + getCount() + "\t" + getTotal();
	}
	
	//상품코드 1002인 상품 삭제하기
	String delete(int goodsNo){
	this.goods = goods;

	if(goods.goodsNo==1002){
	System.out.println("\n[해당 상품 품절]\n");
	System.out.println("---------------------------------------");

	}
	return  goods.goodsNo+"\t"+ goods.gName+"\t"+goods.danga+"\t"+ getCount()+"\t"+getTotal();

	}

	
}
