// 카페에서 음료를 주문하고 사이즈에 따라 가격이 달라짐
// 결제 시 영수증 출력

public class CoffeeOrderTest {
	String menu;
	String size;
	int basePrice;
	
	// 사이즈와 기본 가격에 따라 최종 가격 계산
	int calcPrice() {
		return size.equals("GRANDE") ? basePrice + 500 : basePrice;
	}
	void printReceipt() {
		// 메뉴와 사이즈, 최종 가격 출력
		System.out.println("[영수증] 메뉴: " + menu + "(" + size + ")" + " / 가격: " + calcPrice() + "원");
	}
	
	public static void main(String[] args) {
		CoffeeOrderTest order = new CoffeeOrderTest();
		
		order.menu = "아메리카노";
		order.size = "GRANDE";
		order.basePrice = 4000;
		
		order.printReceipt();		// [영수증] 메뉴: 아메리카노(GRANDE) / 가격: 4500원
		
	}
}
