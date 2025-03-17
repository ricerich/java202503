package ch03_ex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) 
	{
		int intArray[] = new int[10];
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력해주세요>>");
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc1.nextInt();
		}
		
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i] % 3 == 0)
				System.out.println(intArray[i] + " ");
		}
		
		sc1.close();
	}

}
