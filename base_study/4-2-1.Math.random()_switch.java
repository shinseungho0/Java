package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		/*
		 * Math.random() 메소드를 활용하여 0.0과 1.0사이에 속하는 double타입 난수 하나 리턴
		 * 0.0 <= Math.random() < 1.0
		 * 0 ~ 9 사이에 속하는 정수 중에서 하나를 얻고 싶다?
		 * (int) 0.0 * 10 <= (int) (Math.random() * 10) < (int) 1.0 * 10
		 * 1 ~ 10 사이에 속하는 정수 중에서 하나를 얻고 싶다?
		 * (int) 0.0 * 10 + 1 <= (int) (Math.random() * 10) + 1 < (int) 1.0 * 10 + 1
		 * 즉 start부터 시작하는 n개의 정수를 얻고 싶다?
		 * int num = (int) (Math.random() * n) + start
		 */
		
		//주사위의 번호 뽑기
		
		int num = (int) (Math.random() * 6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}
}
