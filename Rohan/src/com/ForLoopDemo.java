package com;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the range");
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = m; i <= n; i++) {
			System.out.println("Multiplication table of" + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j+ "=" + (i * j));
			}
		}

	}

}
