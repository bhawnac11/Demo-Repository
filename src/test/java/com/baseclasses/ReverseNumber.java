package com.baseclasses;

public class ReverseNumber{
	public static void main(String[]args) {
		int num=1879;
		int originalNum=num;
		int rev=0;
		
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		
		System.out.println("Original Number"+ originalNum);
		System.out.println("Reversed Number"+rev);
	}
	
}


