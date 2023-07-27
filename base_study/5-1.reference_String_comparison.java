package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		
		String str1 = "신민철";
		String str2 = "신민철"; // str1과 str2는 동일한 문자열 리터럴로 생성된 객체를 참조
		
		if (str1 == str2) { // == 연산자는 변수에 저장된 객체의 번지가 동일한지를 검사!!
			System.out.println("str1과 str2는 참조가 같음");  // true
		}
		else {
			System.out.println("str1과 str2는 참조가 다름"); // false
		}
		
		if (str1.equals(str2)) { // equals() 메소드는 객체이건 상관없이 내부 문자열을 비교하고 싶을 때
			System.out.println("str1과 str2는 문자열이 같음"); //true
		}
		
		String str3 = new String("신민철"); // new 연산자는 힙 영역에 새로운 객체를 만들 때 사용 객체 생성 연산자 
		String str4 = new String("신민철"); 
											 	
		if (str3 == str4) { /* str3과 str4는 new 연산자로 String 객체를 별도로 생성했기에
			 				   str3 == str4 는 false다	*/	
			System.out.println("str3과 str4는 참조가 같음"); // false
		}
		else {
			System.out.println("str3과 str4는 참조가 다름"); // true
		}
		
		if (str3.equals(str4)) { // equals() 메소드는 문자열이 동일한지만!!
			System.out.println("str3과 str4는 문자열이 같음"); // true
		}
	}
}

/* 출력 결과
str1과 str2는 참조가 같음
str1과 str2는 문자열이 같음
str3과 str4는 참조가 다름
str3과 str4는 문자열이 같음
  */
