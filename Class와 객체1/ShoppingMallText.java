package classpart;

public class ShoppingMallText {

	public static void main(String[] args) {
		ShoppingMall order = new ShoppingMall();
			order.num = 201803120001L;
			order.id = "abc123";
			order.date = "2018년 3월 12일";
			order.name = "홍길순";
			order.productnum = "PD0345-12";
			order.address = "서울시 영등포구 여의도동 20번지";
			
			System.out.println("주문번호:" + order.num);
			System.out.println("주문자 아이디:" + order.id);
			System.out.println("주문날짜:" + order.date);
			System.out.println("주문자 이름:" + order.name);
			System.out.println("주문 상품 번호:" + order.productnum);
			System.out.println("배송 주소:" + order.address);
		

	}

}
