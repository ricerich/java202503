package ch02_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("금액을 입력해주세요>>");
		int money = sc1.nextInt();
		
		int result = money / 50000;
		money = money % 50000;		
		
		if(result >0)
			System.out.println("오만원권 "+result+" 매");
				
		result = money / 10000;
		money = money % 10000;	
		if(result >0)
			System.out.println("만원권 "+result+" 매");
		
		result = money / 5000;
		money = money % 5000;	
		if(result >0)
			System.out.println("오천원권 "+result+" 매");
		
		result = money / 1000;
		money = money % 1000;	
		if(result >0)
			System.out.println("천원권 "+result+" 매");
		
		result = money / 500;
		money = money % 500;	
		if(result >0)
			System.out.println("오백원 "+result+" 개");
		
		result = money / 100;
		money = money % 100;	
		if(result >0)
			System.out.println("백원 "+result+" 개");
		
		result = money / 50;
		money = money % 50;	
		if(result >0)
			System.out.println("오십원 "+result+" 개");
		
		result = money / 10;
		money = money % 10;	
		if(result >0)
			System.out.println("십원 "+result+" 개");
		
		result = money / 1;
		money = money % 1;	
		if(result >0)	
			System.out.println("일원 "+result+" 개");
		
		sc1.close();
	}
}
