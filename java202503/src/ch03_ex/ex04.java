package ch03_ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("소문자 알파벳 1개 입력>>");
		String s = sc1.next();
		if(s.length() != 1) {
			System.out.println("알파벳 1개만 입력하셔야 해요!");
			sc1.close();
			return;
		}
			
		char ch1 = s.charAt(0);
		if(ch1 < 'a' || ch1 > 'z') {
			System.out.println("알파벳 소문자만 입력하셔야 해요!");
			sc1.close();
			return;			
		}
		
		for(char i=ch1; i>='a'; i--)
		{
			for(char j='a'; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc1.close();
	}

}




