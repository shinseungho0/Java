package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1; char 변수가 산술연산에서 사용되면 int 타입으로 변환 연산 결과는 int 타입 그러므로 컴파일 오류뜸
		int c3 = c2 + 1;
		char c4 = (char)(c2 + 1);
		
		System.out.println("c1 = " + c1); // c1 = B
		System.out.println("c2 = " + c2); // c2 = A
		System.out.println("c3 = " + c3); // c3 = 66
		System.out.println("c4 = " + c4); // c4 = B
	}
}
