package ch03.sec11;

public class LogicAndBinary {

	public static void main(String[] args) {
/*
		//논리 연산자
		boolean a = true;
		boolean b = true;
		
		
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(a == b);
		System.out.println(a != b);
*/		
		//비트 연산자
		int c = 15;
		int d = 8;
		
		System.out.println(c & d);		//and	15 -> 1 1 1 1  
		System.out.println(c | d);		//or	8 -> 1 0 0 0 
		System.out.println(~c);
		System.out.println(c ^= d);		//xor	둘 중 다른거 하나씩   0 1 1 1이 된다

	}

}
