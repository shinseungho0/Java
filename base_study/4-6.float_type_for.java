package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		/*
		 * 0.1은 float 타입으로 정확하게 표현할수 없어 변수 a에 더해지는 실제값은 0.1보다 약간 크다
		 */
		
		for (float a = 0.1f; a <= 1.0f; a+=0.1f) {
			System.out.println(a);
		}
		
	}
}
/* 출력결과
0.1
0.2
0.3
0.4
0.5
0.6
0.70000005
0.8000001
0.9000001
*/
