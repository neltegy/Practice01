package com.javaex.practice;

import java.math.*;
import java.util.Scanner;

public class Problem07 {
	static int game() {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		System.out.println("===================");
		System.out.println("   숫자맞추기게임시작     ");
		System.out.println("===================");
		int res = (int) (Math.random()*100) + 1;
		while(flag) {		
			System.out.println("정답은"+res);
			int input = scan.nextInt();
			if(input == res) {
				System.out.println("맞았습니다.");
				System.out.println("게임을종료하시겠습니까?(y/n)");
				scan.nextLine();
				String str = scan.nextLine();
				if(str.equals("y")) {
					flag = false;
					System.exit(0);
				}else if(str.equals("n")) {
					flag = true;
					return game();
				}
			}else if(input > res) {
				System.out.println("더 작게");
			}else if(input < res) {
				System.out.println("더 크게");
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		game();
	}
}
