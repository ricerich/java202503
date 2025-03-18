package ch03_ex;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) 
	{		
		int arr[][] = new int[4][4];
		
		//1.모든 원소를 0으로 초기화 한다
		//2.10개의 난수를 만들어서 넣는다.
		//3.단 위치는 랜덤위치
		//4.모든 원소를 출력한다.
		
		//1.모든 원소를 0으로 초기화 한다
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {
				arr[i][j] = 0;
			}
		}
		
		//2.10개의 난수를 만들어서 넣는다.
//		for(int i=0; i<10;i++) {
//			int row = (int)(Math.random()*4); 
//			int col = (int)(Math.random()*4); 
//			
//			if(arr[row][col] == 0) {
//				arr[row][col] = (int)(Math.random()*10+1);
//			}
//			else {
//				i--;
//			}
//		}
		int cnt=0;
		while(cnt<10) {
			int row = (int)(Math.random()*4); 
			int col = (int)(Math.random()*4); 
			
			if(arr[row][col] == 0) {
				arr[row][col] = (int)(Math.random()*10+1);
				cnt++;
			}
		}
		
		//4.모든 원소를 출력한다.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}





