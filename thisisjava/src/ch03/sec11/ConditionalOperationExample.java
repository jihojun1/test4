package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 72;
	
		//char grade = (score > 90) ? 'A' : ( (score>80) ? 'B' : (score>70) ?'C' : 'D');
		
		int jumsu = score/10;
		char grade = 'A';
				
		switch(jumsu) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default :
				grade = 'F';
		}
		
		System.out.println(score + "점은" +grade+ "등급입니다");

	}

}
