//package baekjoon; 백준에서 package 생략해서....
/*
scanner.next() : 문자열 입력시 공백 전 까지만 받음
scanner.nextLine() : 문자열 입력시 Enter 입력 전까지만 받음
scanner.nextInt() : int 타입 입력
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); 
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a + b);
	}

}
