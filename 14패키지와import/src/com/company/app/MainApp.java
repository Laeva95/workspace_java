// 패키지 선언문
package com.company.app;

// import 선언문
import com.company.tools.MathTool;

public class MainApp {

	public static void main(String[] args) {
		MathTool tool = new MathTool();
		
		System.out.println("덧셈 결과: " + tool.add(7, 3));
		System.out.println("곱셈 결과: " + tool.multiply(7, 3));
		
	}	
}
