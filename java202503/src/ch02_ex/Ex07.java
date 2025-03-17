package ch02_ex;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("점(x,y)의 좌표를 입력하세요>>");
		int x = sc1.nextInt();
		int y = sc1.nextInt();
		
		//점(x,y)가 100,100~200,200 사각형 안에 있을 겨우
		if(x>100 && x<200 && y>100 && y<200) {
			System.out.println("("+x+","+y+")는 사각형 안");
		}
		else
			System.out.println("("+x+","+y+")는 사각형 밖");
			
		sc1.close();	


	}

}
