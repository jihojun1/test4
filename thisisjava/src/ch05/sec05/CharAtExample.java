package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "9506231230123";
		
		char sex = ssn.charAt(7);
		
		if(sex == '1' || sex == '3')
			System.out.println("남자입니다.");
		else
			System.out.println("여자입니다.");
//		switch(sex) {
//		case '1':
//		case '3':
//			System.out.println("남자입니다.");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자입니다.");
//		}

	}

}
