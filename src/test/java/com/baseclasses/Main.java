package com.baseclasses;


class Main extends Data{
	public void m1() {
		System.out.println("m1 is running");
	}
	public static void main(String[]args) {
		Main m=new Main();
		m.m1();
		m.m2();
	}
	
	
}

abstract class Data{
	
	abstract void m1();
	void m2() {
		System.out.println("m2 is running");
	}
}