package com.jgcho.test01;

import java.util.Scanner;

public class excerciseTest {
	
	public static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("입력하세요 : ");
		int n = sc.nextInt();
		int[] answer = {};
		
		String temp = Integer.toString(n);
		
		long a ;
		
		temp.toCharArray()
		
		temp.charAt(arg0)
		
		temp.
		
		char b;
		
		
		Integer.par
		
		count = temp.length();
		

		answer = new int[count];
		
		System.out.println("count :" + count);
		
		for(int inx = 0 ; inx < count ; inx++) {
			
			answer[inx] = n%10;
			
			n = n/10;
			
		}
		
		
		for(int inx = 0; inx < count ; inx++) {
			System.out.print(answer[inx]);
		}

	}
	
		
	public static void countNumber(int n) {
		
	
		if(n < 10) {
			count++;
		}else {
			count++;
			countNumber(n/10);
		}
	}

}
