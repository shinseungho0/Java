package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		/*
		 * 문자열 변환
		 * 문자열 -> 정수 : Integer.parseInt()
		 * 정수 -> 문자열 : String.valueOf(정수값)
		 */
		int value1 = Integer.parseInt("10"); // 문자열 10을 정수로 바꿈
		double value2 = Double.parseDouble("3.14"); // 문자열 3.14를 실수로 바꿈
		boolean value3 = Boolean.parseBoolean("true"); // 문자열 true를 논리 리터럴로 바꿈
		
		System.out.println("value1: " + value1); 
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		int t = 10 + value1; // value1은 정수 10으로 바껴 10을 더하면 20이된다.
		System.out.println(t);
		
		String str1 = String.valueOf(10); // 정수 10을 문자열로 바꿈
		String str2 = String.valueOf(3.14); // 실수 3.14를 문자열로 바꿈
		String str3 = String.valueOf(true); // 논리 리터럴 true를 문자열로 바꿈
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		String s = str1 + 10; // str1은 문자열로 바뀌어 10을 더하면 결합 연산으로 1010이된다.
		System.out.println(s);
		
	
}
}
