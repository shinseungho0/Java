package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		// 중첩된 반복문에서 바깥쪽 반복문까지 break로 종료
		shin: for (char upper = 'A'; upper <= 'Z'; upper++) { // shin이라는 반복문 이름
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'd') {
					break shin; // 바깥쪽 반복문까지 종료
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
/*  출력 결과
A-a
A-b
A-c
A-d
프로그램 실행 종료
*/
