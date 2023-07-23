package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');	
		System.out.println(score + "점은 " + grade + "등급입니다."); // 85점은 B등급입니다.
		
		// 5~7줄 삼항 연산자를 if문으로
		if (score > 90) grade = 'A';
		else if (score > 80) grade = 'B';
		else grade = 'C';
		System.out.println(score + "점은 " + grade + "등급입니다."); // 85점은 B등급입니다.
	}
}
