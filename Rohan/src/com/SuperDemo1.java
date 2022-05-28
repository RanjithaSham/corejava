package com;

public class SuperDemo1 {
	class A {
		int a;
		int b;

		public A() {
			System.out.println("In A class default constructor");

		}

		public A(int a, int b) {
			System.out.println("In A class parameterized constructor");
			this.a = a;
			this.b = b;
		}
	}

	class B extends A {
		int c;

		public B() {
			super();
			System.out.println("In B class default constructor");
			super.a = 10;
			super.b = 20;
		}

		public B(int c) {
			super();
			this.c = c;
			System.out.println("In B class parameterized constructor");
		}
	}

	public class SuperDemo
	{
		public static void main(String[] args)
		{
			B obj = new B();
			System.out.println(obj.a);
			System.out.println(obj.b);
		}
	}
}
