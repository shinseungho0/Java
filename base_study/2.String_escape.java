package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		/* 
		 * 이스케이프(escape): 문자열 내부에 역슬래시(\)가 붙은 문자를 사용가능
		 * 이스케이프 문자를 사용하면 문자열 내부에 특정 문자를 포함가능
		 */
		String a = "지금은 \"여름\" "; // 큰따옴표사용 \"
		String b = "번호\t이름\t나이"; // 탭만큰 띄위기 \t
		String c = "1\n신\n25"; // 한 줄 내림 \n
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
// \u16진수 : 16진수 유니코드에 해당하는 문자 출력

/* 출력

지금은 "여름" 
번호	이름	나이
1
신
25
*/  
