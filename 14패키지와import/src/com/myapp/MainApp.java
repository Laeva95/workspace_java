package com.myapp;

// 두 클래스의 이름이 동일하기 때문에 동시에 import 할 수 없음
import com.myapp.models.User;
//import com.external.models.User;

public class MainApp {

	public static void main(String[] args) {
		
		// myapp의 User 클래스 사용
		User localUser = new User("홍길동");
		localUser.printInfo();
		
		// 외부의 User 클래스 사용
		com.external.models.User externalUser = new com.external.models.User(1234);
		externalUser.printInfo();
		
	}
}
