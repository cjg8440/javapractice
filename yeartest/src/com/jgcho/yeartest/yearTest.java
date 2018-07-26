package com.jgcho.yeartest;

import java.util.Scanner;

public class yearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String answer = "";
		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] days = { 0, 3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3 };
		int date = 5;
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		
		
		System.out.print("a 입력 : ");
		a = sc.nextInt();
		
		System.out.print("b 입력 : ");
		b = sc.nextInt();
		
		
		for (int inx = 1; inx < a ; inx++) {
			date = (date + days[inx]) % 7;
			System.out.println(inx + 1 + "월 시작 요일 : " + day[date]);
		}

		date = (date + b -1) % 7;
		
		answer = day[date];

		System.out.println(answer);

	}

}
