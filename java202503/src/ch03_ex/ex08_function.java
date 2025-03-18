package ch03_ex;

import java.util.Scanner;

public class ex08_function 
{
	public static boolean check(int arr[], int last, int num)
	{
		for(int i=0; i<last;i++) {
			if(num == arr[i])
				return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("정수 몇 개?");
		int size = sc1.nextInt();
		
		if(size<=0 || size>=100) {
			System.out.println("(1~100)사이의 수를 입력해주세요");
			sc1.close();
			return;
		}
		
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			int n = (int)(Math.random()*100+1);
//			//중복검사 코드
			if(check(arr, i, n))
			{
				i--;
				continue;
			}
			arr[i] = n; 
		}
		
		for(int i=0; i<arr.length; i++) {
			
			if(i!=0 && i%10 == 0) {
				System.out.println();
			}
			
			System.out.print(arr[i] + " ");
		}
		
		sc1.close();
	}
}





