package ch04.sec07;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			if(num == 6)
				break;
		}
		System.out.println("프로그랩 종료");

	}

}
