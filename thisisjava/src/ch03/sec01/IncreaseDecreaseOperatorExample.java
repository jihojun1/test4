package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;

		int z;
		
		z = x++  + ++x;
		
		for(int i=0; i<9; i++)
		
		System.out.println("x=" + x);
		System.out.println("z=" + z);
		
		byte myValue = 127;
		System.out.println("myValue="+myValue);
		myValue++;
		//System.out.println("myvalue="+myValue); 
		
		
		int a = 12;
		System.out.println("a="+a);
		int b = a<<2;
		System.out.println("b="+b);


	}
	
}
