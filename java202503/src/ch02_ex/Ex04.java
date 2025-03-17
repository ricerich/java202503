package ch02_ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int n1 = sc1.nextInt();
		int n2 = sc1.nextInt();
		int n3 = sc1.nextInt();
		
		int mid = 0;
		if( ((n1>n2) && (n1<n3)) || ((n1>n3) && (n1<n2)) )//n1이 중간값이 경우
		{
			mid = n1;
		}
		else if(((n2>n1) && (n2<n3)) || ((n2>n3) && (n2<n1)))//n2가 중간값이 경우
		{
			mid = n2;
		}
		else if(((n3>n1) && (n3<n2)) || ((n3>n2) && (n3<n1)))//n3가 중간값이 경우
		{
			mid = n3;
		}
		
		System.out.println("중간값은 "+mid+" 입니다 ");
		
		sc1.close();
	}
}
