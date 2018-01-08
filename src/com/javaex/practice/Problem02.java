package com.javaex.practice;

import java.util.Scanner;

/*
숫자를 입력받아 아래와 같이 출력하세요
*/

public class Problem02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를입력하세요.");
		int input = scan.nextInt();
		
		for(int i = 1 ; i <= input ; i++) {
			for(int j = 0 ; j <i ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
