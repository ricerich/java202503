package ch02_ex;

import java.util.Scanner;

public class Ex09 
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("원의 중심(x, y)과 반지름 (r) 입력>>");
		int x = sc1.nextInt();
		int y = sc1.nextInt();
		double r = sc1.nextDouble();
		
		System.out.print("한 점(x, y)입력>>");
		int x1 = sc1.nextInt();
		int y1 = sc1.nextInt();
		
		double l = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		
		if(l>r)
			System.out.println("점("+x1+","+y1+")는 원 밖에");
		else
			System.out.println("점("+x1+","+y1+")는 원 안에");
		

		sc1.close();
	}

}










