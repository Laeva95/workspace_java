package wrapperclass;

public class WrapperPractice {

	public static void main(String[] args) {
		// 웹에서는 모든 데이터를 문자열로 처리함
		// 또한 int 같은 기본 자료형은 null 값을 받아서 처리 할 수 없음
		
		String priceInput = "100";			// 클라이언트가 입력한 상품 가격
		String countInput = "3 ";			// 클라이언트가 실수로 빈 공백을 포함한 문자열 입력
		String discountInput = "";			// 클라이언트가 입력 하지 않은 할인 금액
		
		// 사용자의 실수를 대비해서 입력받은 문자열의 앞뒤 공백 제거
		priceInput = priceInput.trim();
		countInput = countInput.trim();
		discountInput = discountInput.trim();
		
		// 문자열이 숫자 형태인지 확인하는 사용자 정의 메소드
		Integer price = isNumeric(priceInput) ? Integer.parseInt(priceInput) : 0;
		
		Integer count = isNumeric(countInput) ? Integer.parseInt(countInput) : 0;
		
		Integer discount;
		
		if(discountInput == null || discountInput.equals("")) {
			discount = 0;
		}{
			discount = isNumeric(discountInput) ? Integer.parseInt(discountInput) : 0;
		}
		
		// 구매하는 총 상품의 금액 계산
		int totalPrice = price.intValue() * count.intValue();
		
		int finalPrice = totalPrice - discount.intValue();
		
		// 최종 가격이 0 미만이라면 0원으로 고정
		if(finalPrice < 0) {
			finalPrice = 0;
		}
		
		System.out.println("=================================================");
		System.out.println("[계산 결과]");
		System.out.println("입력 받은 상품 가격: " + String.valueOf(price) + "원");
		System.out.println("입력 받은 구매 수량: " + String.valueOf(count) + "개");
		System.out.println("총 상품 금액: " + String.valueOf(totalPrice) + "원");
		System.out.println("입력 받은 할인 금액: " + String.valueOf(discount) + "원");
		System.out.println("최종 계산 금액: " + String.valueOf(finalPrice) + "원");
		System.out.println("=================================================");
		
	}
	
	public static boolean isNumeric(String str) {
		// 만약 매개변수가 null 이거나 빈 문자열 "" 일 경우 false 반환
		if(str == null || str == "") {
			return false;
		}
		// 매개변수로 전달된 문자열이 모두 숫자로 이루어졌는지 확인
		// 전달 받은 매개변수를 char 배열로 변환
		char[] c = str.toCharArray();
		
		for(char cs : c) {
			// Character.isDigit(): 해당 char 값이 숫자인지 확인하는 메서드
			if(!Character.isDigit(cs)) {
				return false;
			}
		}
		return true;
	}
}
