package ch02_ex;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("(1~99)사이의 정수를 입력하세요>>");
		int num = sc1.nextInt();
		
		if(num<1 || num >99) {
			System.out.println("(1~99)사이의 수가 아닙니다");
			return;
		}
		
		int ten = num / 10;
		int one = num % 10;
		
		int cnt = 0; // 3,6,9의 갯수 카운팅 변수
		
//		if(ten==3 || ten==6 || ten==9) {
//			cnt++;
//		}
		
		if(ten!=0 && ten%3==0){
			cnt++;
		}
		
//		if(one==3 || one==6 || one==9) {
//			cnt++;
//		}
		if(one!=0 && one%3==0){
			cnt++;
		}
		
		if(cnt == 2) {
			System.out.println("박수짝짝");
		}
		else if(cnt == 1) {
			System.out.println("박수짝");
		} 
		else
			System.out.println("박수없음");
	
		sc1.close();
	}

}
