package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		int a = 1;
		double b = 1.0;
		boolean c = (a == b); // 3이 3.0인 double타입으로 바뀐다
		System.out.println(c); // true
		System.out.println(a == b); //true
		//7~8줄과 9줄은 같은 의미
		
		double d = 0.1;
		float e = 0.1f; // 0.1f는 0.1의 근사값으로 표현되어서 0.1보다 더 큰 값이 된다.
		System.out.println(d == e); // false 0.1f가 0.1보다 크다
		System.out.println((float)d == e); // true 피연산자를 모두 float타입으로 변경

		String str1 = "신용권";
		String str2 = "신용권";
		System.out.println(str1.equals(str2)); // true String 변수를 비교할 때에는 equals()메소드 사용 
		System.out.println(!str1.equals(str2)); // false
	}
}
