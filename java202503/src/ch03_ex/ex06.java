package ch03_ex;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) 
	{
		int []unit = {50000,10000,5000, 1000,500,100,50,10,1};
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("금액을 입력해주세요>>");
		int money = sc1.nextInt();

		for(int i=0; i<unit.length; i++)
		{
			int result = money / unit[i];
			money = money % unit[i];		
			
			if(result >0)
				System.out.println(unit[i]+"짜리 "+result+" 개");
		}
		
		sc1.close();
	}
}
