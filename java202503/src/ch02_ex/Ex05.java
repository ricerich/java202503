package ch02_ex;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요>>");
		int x = sc1.nextInt();
		int y = sc1.nextInt();
		int z = sc1.nextInt();
		
		//삼각형이 안되는 조건 1개라도 걸리면 탈락
		if( x>y+z || y>x+z || z>x+y) {
			System.out.print("삼각형 안됨!");
		}
		else {
			System.out.print("삼각형 가능!");
		}
		sc1.close();
	}
}
