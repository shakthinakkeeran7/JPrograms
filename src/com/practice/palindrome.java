package com.practice;

public class palindrome {
	
	private static void subMethod1() {
		int a= 12321;
		int r; 
		int sum = 0;
		int temp = a;
		while(a>0) {
			r=a%10;
			sum = (sum*10)+r;
			a=a/10;
		}
		if(temp == sum) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
	private static void subMethod2() {
		
		String orginal = "name";
		String reverse ="";
		
		for (int i =orginal.length()-1;i>0; i--) {
			reverse = reverse +orginal.charAt(i);
		}
		if(orginal.equals(reverse)) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		
		subMethod1();
		subMethod2();
	
		
		
		
		
	}
	

}
