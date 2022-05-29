package com;

public class IfDemo {

	static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Money is withdrawn");
	}

	public static void main(String[] args) {
		int balance = 1000;
		if (balance > 500)
			IfDemo.withdraw();
		System.out.println("Simple if demonstration");

	}

}
