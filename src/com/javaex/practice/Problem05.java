package com.javaex.practice;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int max;
		
		System.out.println("숫자를 입력하세요.");
		for(int i = 0 ; i < 5 ; i++) {
			arr[i] = scan.nextInt();
		}
		max = arr[0];
		
		for(int i = 0 ; i < 5 ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("최대값은:"+max+"입니다.");
		
		
	}
}
