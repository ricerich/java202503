package ch02_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		final double RATE = 1241;
		
		System.out.print("원화를 입력해주세요(단위원)>>");
		int won = sc.nextInt();
		double dollar = won/RATE;
		dollar = (int)(dollar*100)/100.0;
		
		System.out.print(won+"원은 "+dollar+"달러입니다");
		
		sc.close();
	}

}
