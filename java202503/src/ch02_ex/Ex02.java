package ch02_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("2자리의 정수 입력(10~99)>>");
		int num = sc1.nextInt();
		
		if(num<10 || num>99) 
		{
			System.out.println("2자리의 수를 입력해주세요!");
			sc1.close();
			return;
		}
		
		int one = num % 10;
		int ten = num / 10;
		
		if(one == ten) {
			System.out.println("1의 자리와 10의 자리가 같아요!");
		}
		else {
			System.out.println("1의 자리와 10의 자리가 달라요!");
		}
		
		
		sc1.close();
	}

}
