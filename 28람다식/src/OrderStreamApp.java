
//주제  람다식 + Stream API 응용 - 주문 데이터 조회 (SQL 과 나란히 비교)

import java.util.stream.Collector;
import java.util.stream.Collectors;   //클래스. 스트림 결과를 수집할 때 사용
import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.util.ArrayList;           //클래스. 가변 크기 배열
import java.util.Arrays;              //클래스. asList 로 고정 배열을 만들 때 사용
import java.util.List;                //인터페이스. 목록의 공통 규격



/*
 ==================================================================
 [이 예제의 목표]
   이미 배운 MySQL 의 SELECT 문과 자바 Stream 을 나란히 놓고 비교한다.
   Stream 은 "자바 코드로 쓰는 SQL" 이라고 보면 된다.

     MySQL                     |  자바 Stream
     --------------------------+--------------------------------
     FROM 테이블                 |  목록.stream()
     WHERE 조건                 |  .filter( o -> 조건 )
     SELECT 컬럼 하나             |  .mapToInt( o -> o.컬럼 )
     ORDER BY 컬럼 DESC         |  .sorted( (a,b) -> b.컬럼 - a.컬럼 )
     DISTINCT                  |  .distinct()
     SUM(컬럼)                  |  .sum()
     AVG(컬럼)                  |  .average()
     COUNT(*)                  |  .size()
     결과를 목록으로 받기            |  .collect( Collectors.toList() )

 [람다식 읽는 법]
     o  ->  o.price
     -      -------
     (1)      (2)

     (1) o : 통로에서 꺼내진 객체 1개가 담기는 자리.
             내가 넣는 것이 아니라 filter/mapToInt 메소드가 하나씩 넣어 준다.
     (2) 하고 싶은 일. 화살표 오른쪽이 한 문장이면 return 과 중괄호를 생략한다.

     sorted 만 값을 2개 받는다 --> (a, b) 처럼 괄호로 묶는다.

 [데이터 = MySQL 테이블 orders 라고 생각하면 된다]

     order_id | member_id | product | price   | status
     ---------+-----------+---------+---------+----------
     1        | kim       | 노트북  | 1500000 | 배송완료
     2        | lee       | 마우스  |  100000 | 배송중
     3        | kim       | 키보드  |   80000 | 배송중
     4        | park      | 모니터  |  350000 | 배송완료
     5        | kim       | 이어폰  |  120000 | 주문접수
     6        | lee       | 노트북  | 1500000 | 배송완료
     7        | park      | 마우스  |  130000 | 배송중

     테이블 1행 = 자바 Order 객체 1개 / 테이블 전체 = 자바 List 하나
 ==================================================================
*/

//==================================================================
// 테이블 1행을 담는 클래스 (컬럼 5개 = 멤버 변수 5개)
//==================================================================
class Order{
	int orderId;
	String memberId;
	String product;
	int price;
	String status;
	
	public Order(int orderId, String memberId, String product, int price, String status) {
		this.orderId = orderId;
		this.memberId = memberId;
		this.product = product;
		this.price = price;
		this.status = status;
	}
}

public class OrderStreamApp {

    public static void main(String[] args) {
    	// 1. 데이터가 입력된 테이블 준비(SELECT * FROM Orders)
    	List<Order> orders = Arrays.asList(new Order(1, "kim", "노트북", 1500000, "배송완료"),
    										new Order(2, "lee", "마우스", 100000, "배송중"),
    										new Order(3, "kim", "키보드", 80000, "배송중"),
    										new Order(4, "park", "모니터", 350000, "배송완료"),
    										new Order(5, "kim", "이어폰", 120000, "주문접수"),
    										new Order(6, "lee", "노트북", 1500000, "배송완료"),
    										new Order(7, "park", "마우스", 130000, "배송중"));
    	
//        1        | kim       | 노트북  | 1500000 | 배송완료
//        2        | lee       | 마우스  |  100000 | 배송중
//        3        | kim       | 키보드  |   80000 | 배송중
//        4        | park      | 모니터  |  350000 | 배송완료
//        5        | kim       | 이어폰  |  120000 | 주문접수
//        6        | lee       | 노트북  | 1500000 | 배송완료
//        7        | park      | 마우스  |  130000 | 배송중
    	
        //================================================================================
        // [조회 1]  SELECT * FROM orders WHERE member_id = 'kim';
        //
        //   중간 연산 filter(Predicate<T> predicate)
        //     - 스트림의 각 요소에 조건식을 평가하며 Predicate<T> 함수형 인터페이스를 사용한다.
        //     - Predicate<T> 에는 boolean 을 반환하는 test(T t) 추상메소드가 작성되어 있어서
        //       조건식을 만족한 요소들만 다음 연산으로 넘긴다.
        //================================================================================
    	List<Order> kimOrders = orders.stream()
    								.filter(o -> o.memberId.equals("kim"))
    								.collect(Collectors.toList());
    	
    	System.out.println("=========[조회1] Kim의 주문 정보 ========");
    	for(Order o : kimOrders) {
    		System.out.println(o.orderId + "번 | " + o.product + " | " + o.price + "원");
    	}
    	System.out.println();
    	
        //================================================================================
        // [조회 2]  SELECT * FROM orders WHERE status = '배송중';
        //
        //   조회 1과 구조가 완전히 같고 "람다 안에서 보는 컬럼" 만 다르다.
        //   SQL 에서 WHERE 뒤만 바꾸면 다른 조회가 되는 것과 똑같다.
        //================================================================================
    	List<Order> shippingOrders = orders.stream()
    							.filter(o -> o.status.equals("배송중"))
    							.collect(Collectors.toList());
    	
    	System.out.println("=========[조회2] 배송중인 주문 정보 ========");
    	for(Order o : shippingOrders) {
    		System.out.println(o.orderId + "번 | " + o.memberId + " | " + o.product);
    	}
    	System.out.println("주문 건수: " + shippingOrders.size());
    	System.out.println();
    	
        //================================================================================
        // [조회 3]  SELECT SUM(price) FROM orders WHERE member_id = 'kim';
        //
        //   중간 연산 mapToInt(ToIntFunction<T> mapper)
        //     - 스트림의 각 객체를 int 값 하나로 변환할 때 사용한다.
        //     - 객체가 흐르던 Stream 통로가 int 만 흐르는 IntStream 통로로 바뀐다.
        //     - sum, average 는 숫자에만 쓸 수 있으므로 반드시 이 단계를 거쳐야 한다.
        //================================================================================
    	int kimTotal = orders.stream()
    							.filter(o -> o.memberId.equals("kim"))
    							.mapToInt(o -> o.price)
    							.sum();
    	
    	System.out.println("=========[조회3] Kim의 가격 합계 ========");
    	System.out.println("합계: " + kimTotal + "원");
    	System.out.println();

        //================================================================================
        // [조회 4]  SELECT AVG(price) FROM orders;
        //
        //   종료 연산 average()
        //     - IntStream 통로 숫자들의 평균을 계산한다.
        //     - 결과는 곧바로 숫자가 아니라 OptionalDouble 이라는 "상자" 로 반환된다.
        //       행이 0건이면 평균을 낼 수 없기 때문이다.
        //       (MySQL 에서도 빈 테이블의 AVG 는 NULL 이 나오는 것과 같은 이치)
        //     - orElse(기본값) 으로 그 상자를 열어 값을 꺼낸다. SQL 의 IFNULL 역할.
        //================================================================================
    	double avgOrders = orders.stream()
    							.mapToInt(o -> o.price)
    							.average()
    							.orElse(0.0);
    	
    	System.out.println("=========[조회4] 전체 가격 평균 ========");
    	System.out.println("평균: " + avgOrders + "원");
    	System.out.println();
    	
        //================================================================================
        // [조회 5]  SELECT * FROM orders ORDER BY price DESC;
        //
        //   중간 연산 sorted(Comparator<T> comparator)
        //     - Comparator<T> 함수형 인터페이스를 사용하며,
        //       값 2개를 받아 int 를 반환하는 compare(T a, T b) 추상메소드가 작성되어 있다.
        //     - 반환값이 음수면 a 를 앞에, 양수면 b 를 앞에 놓는다. 0 이면 순서 유지.
        //
        //     정렬 공식 :  a - b  --> 작은 값이 앞 (ORDER BY ASC)
        //                  b - a  --> 큰 값이 앞   (ORDER BY DESC)
        //     외우는 법 : "앞에 오길 원하는 쪽을 뒤에 빼면 된다"
        //================================================================================
    	List<Order> sortedOrders = orders.stream()
    										.sorted((a, b) -> b.price - a.price)
    										.collect(Collectors.toList());
    	
    	System.out.println("=========[조회5] 금액이 큰 순서로 정렬 ========");
    	for(Order o : sortedOrders) {
    		System.out.println(o.price + "원 | " + o.product + " (" + o.memberId + ")");
    	}
    	System.out.println();
    	
        //================================================================================
        // [조회 6]  SELECT DISTINCT product FROM orders;
        //
        //   중간 연산 distinct()
        //     - 람다를 받지 않는다. "이미 지나간 값 명단" 을 스스로 기억하며
        //       equals 로 비교해서 처음 보는 값만 통과시킨다.
        //================================================================================
    	List<String> names = new ArrayList<String>();
    	for(Order o : orders) {
    		names.add(o.product);
    	}
    	names = names.stream().distinct().collect(Collectors.toList());
    	
    	System.out.println("=========[조회6] 판매 상품 종류 ========");
    	for(String s : names) {
    		System.out.println(s);
    	}
    	
    }   //main 의 끝

}   //OrderStreamApp 클래스의 끝

/*
 ==================================================================
 전체 예상 출력
 ------------------------------------------------------------------
 ===== [조회1] kim 의 주문 =====
 1번 | 노트북 | 1500000원
 3번 | 키보드 | 80000원
 5번 | 이어폰 | 120000원

 ===== [조회2] 배송중 주문 =====
 2번 | lee | 마우스
 3번 | kim | 키보드
 7번 | park | 마우스
 건수 : 3건

 ===== [조회3] kim 총 구매액 =====
 1700000원

 ===== [조회4] 전체 평균 금액 =====
 540000.0원

 ===== [조회5] 금액 큰 순서 =====
 1500000원 | 노트북 (kim)
 1500000원 | 노트북 (lee)
 350000원 | 모니터 (park)
 130000원 | 마우스 (park)
 120000원 | 이어폰 (kim)
 100000원 | 마우스 (lee)
 80000원 | 키보드 (kim)

 ===== [조회6] 판매 상품 종류 =====
 - 노트북
 - 마우스
 - 키보드
 - 모니터
 - 이어폰
 ==================================================================
 최종 정리

 1. 모든 조회가 같은 3단계다.
      통로 만들기(stream) -> 중간 연산(filter/mapToInt/sorted/distinct)
      -> 종료 연산(collect/sum/average)

 2. 중간 연산은 통로 객체를 반환하므로 . 으로 계속 이어 붙일 수 있다(체이닝).
    종료 연산이 호출되어야 비로소 통로에 데이터가 흐른다.

 3. 원본 배열(orders)은 절대 변하지 않는다. 항상 새 ArrayList 가 반환된다.

 4. mapToInt 를 지나면 통로의 내용물이 객체에서 숫자로 바뀐다.
    sum, average 는 그 이후에만 쓸 수 있다.

 5. 자주 하는 실수
      - 문자열을 == 로 비교 --> 결과 0건. equals 를 써야 한다
      - mapToInt 없이 sum --> 컴파일 오류
      - collect 를 빠뜨림 --> 통로가 흐르지 않아 아무 일도 안 일어난다
 ==================================================================
*/
