package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		/*
		  기본적으로 컴파일러는 정수 리터럴을 int 타입으로 간주
		  리털럴(literal) : 소스코드에서 프로그래머에 의해 직접 입력된 값
		*/
		long var1 = 10; // int 타입 허용 범위
		long var2 = 20L; // long 타입임을 컴파일러에게 알리는 리터럴 뒤에 소문자 l 혹은 대문자 L
		//long var3 = 1000000000000; int 타입 허용 범위 초과
		long var4 = 1000000000000L; // int 타입 허용 범위 초과지만 long 타입임을 알리는 L
		
		System.out.println(var1);
		System.out.println(var2);
		//System.out.println(var3);
		System.out.println(var4);
	}
}
/* 출력

10
20
1000000000000 
*/	
