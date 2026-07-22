package com.myapp.models;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("내 앱 사용자: " + name);
	}
}
