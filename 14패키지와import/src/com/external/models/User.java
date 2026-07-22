package com.external.models;

public class User {
	private int id;
	
	public User(int id) {
		this.id = id;
	}
	
	public void printInfo() {
		System.out.println("외부 시스템 사용자 ID: " + id);
	}
}
