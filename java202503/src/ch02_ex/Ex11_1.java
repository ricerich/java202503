package ch02_ex;

import java.util.Scanner;

public class Ex11_1 
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12");
		int month = sc1.nextInt();
		
		if(month <1 || month>12){
			System.out.println("1~12 사이의 수가 아닙니다");
			sc1.close();
			return;
		}
		
		if(month >=3 && month <=5) {
			System.out.println("봄");
		}
		else if(month >=6 && month <=8) {
			System.out.println("여름");
		}
		else if(month >=9 && month <=11) {
			System.out.println("가을");
		}
		else if(month ==12 || month ==1 || month ==2) {
			System.out.println("겨울");
		}
		else 
			System.out.println("오류!");

		sc1.close();
	}

}










