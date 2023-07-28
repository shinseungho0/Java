package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1); 
		
		int sum2 = add( new int[] {83, 90, 87}); // 매개변수로 int[] 배열이 선언된 add() 메소드가 있을 경우
												 // 값 목록으로 배열을 생성하고 new 연산자를 사용한다									
		System.out.println("총합 : " + sum2);
		System.out.println();
		
	}
	public static int add(int[] scores) { // 총합을 계산해서 리턴하는 메소드
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
/* 출력 결과
총합 : 260
총합 : 260
*/  
