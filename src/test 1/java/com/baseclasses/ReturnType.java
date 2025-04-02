package com.baseclasses;

public class ReturnType {
public static void main(String[]args) {
	int result=mult(12,12);
	System.out.println("result of value z:"+ result);
}

public static int mult(int x, int y) {
	int z= (x*y);
	System.out.println(z);
	return z;
}
}