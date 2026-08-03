package objecttest1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor				// 모든 변수를 매개 변수로 초기화하는 생성자
@NoArgsConstructor				// 매개 변수가 없는 기본 생성자
//@Getter						// 모든 변수에 대한 getter 메소드
//@Setter						// 모든 변수에 대한 setter 메소드
//@ToString						// 해당 객체의 변수에 대한 정보를 문자열로 출력하는 메소드
//@EqualsAndHashCode			// 객체가 서로 같은지 비교를 위한 메소드
@Data							// 위의 모든 어노테이션을 적용시키는 어노테이션(@AllArgsConstructor 제외)
public class Member3 {
	private int memberNo;
	private String memberEmail;
	private String memberPw;
	private String memberNickName;
	private String memberTel;
	private String memberAddress;
	private String profileImage;
	
	
	
	
}
