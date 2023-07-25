package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; 
		++x; 
		System.out.println("x = " + x); //x = 12
		System.out.println("x = " + x++); // x = 12
		
		System.out.println("----------------------------");
		y--; 
		--y; 
		System.out.println("y = " + y); // y = 8
		
		System.out.println("----------------------------");
		z = x++; // x++는 연산자를 먼저 처리한 후 x 1증감 즉 z에 x값이 들어가고 이후에 x값 1증가
		System.out.println("z = " + z); // z = 13
		System.out.println("x = " + x); // x = 14
		
		System.out.println("----------------------------");
		z = ++x;
		System.out.println("z = " + z); // z = 15
		System.out.println("x = " + x); // x = 15
		
		System.out.println("----------------------------");
		z = ++x + y++;
		System.out.println("z = " + z); //24
		System.out.println("x = " + x); // 16
		System.out.println("y = " + y); // 9
	}
}
