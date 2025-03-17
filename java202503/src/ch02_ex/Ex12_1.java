package ch02_ex;

import java.util.Scanner;

public class Ex12_1 
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("연산>>");
		int n1 = sc1.nextInt();
		String op1 = sc1.next();
		int n2 = sc1.nextInt();
		
		int res1 =0;
		
		if(op1.equals("+")) {
			res1 = n1 + n2;
		}
		else if(op1.equals("-")) {
			res1 = n1 - n2;
		}
		else if(op1.equals("*")) {
			res1 = n1 * n2;
		}
		else if(op1.equals("/")) {
			if(n2==0){
				System.out.println("0으로는 나눌 수 없어요");
				sc1.close();
				return;
			}
			res1 = n1 / n2;
		}
		else {
			System.out.println("오류~! 잘못된 계산");
			sc1.close();
			return;
		}
		
		System.out.println(n1 + op1 + n2 +"의 계산 결과는 "+res1);

		sc1.close();
	}

}










