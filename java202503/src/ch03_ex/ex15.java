package ch03_ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		do 
		{
			System.out.print("곱하고자하는 두 수의 입력>>");
			try {
				int n = sc1.nextInt();
				int m = sc1.nextInt();
				System.out.println(n + "x" + m +"=" + n*m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요!");
				sc1.nextLine();
				continue;
			}
		}while(true);
		
		sc1.close();

	}
}





