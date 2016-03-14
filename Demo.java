package com.online;

class A {
	int x = 100;
}

class B extends A {
	int x = 150;
	
	void print() {
		System.out.println(super.x);
	}
}

class C extends B {
	int x = 200;
	
	void print() {
		super.print();
		System.out.println(super.x);
		System.out.println(x);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj = new C();
		obj.print();
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
	}

}
