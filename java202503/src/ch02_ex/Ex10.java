package ch02_ex;

import java.util.Scanner;

public class Ex10 
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("첫번째 원의 중심(x1, y1)과 반지름 (r1) 입력>>");
		int x1 = sc1.nextInt();
		int y1 = sc1.nextInt();
		double r1 = sc1.nextDouble();
		
		System.out.print("두번째원의 중심(x2, y2)과 반지름 (r2) 입력>>");
		int x2 = sc1.nextInt();
		int y2 = sc1.nextInt();
		double r2 = sc1.nextDouble();
		

		
		double l = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		if(l>r1+r2)
			System.out.println("두 원은 겹치지 않습니다");
		else
			System.out.println("두 원은 겹칩니다");
		

		sc1.close();
	}

}










