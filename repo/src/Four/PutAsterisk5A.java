package Four;

import java.util.Scanner;

public class PutAsterisk5A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?:");
		int n = stdIn.nextInt();
		if(n > 0) {
			for(int i = 0; i < n ; i++) {
				System.out.println('*');
				if(i % 5 == 4)
					System.out.println();
			}
			if(n % 5  != 0)
				System.out.println();
		}

	}

}
