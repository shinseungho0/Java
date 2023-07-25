package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		
		//char 타입 변수를 이용해서 알파벳 대소문자 관계없이 동일하게 처리
		char grade = 'a';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
			
		
		}
	}
}
