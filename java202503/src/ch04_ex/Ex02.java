package ch04_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("수학,과학,영어 순으로 3개 점수 입력>>");
		int math = sc1.nextInt();
		int science = sc1.nextInt();
		int english = sc1.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은" + me.average());
		sc1.close();

	}

}
