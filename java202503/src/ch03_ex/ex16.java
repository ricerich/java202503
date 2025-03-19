package ch03_ex;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) 
	{
		
		String comArr[] = {"가위","바위","보"}; 
		
		System.out.println("가위,바위,보 게임을 시작합니다");
		
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
			System.out.print("가위,바위,보!>>");
			String me = sc1.next();
			
			if(me.equals("그만")) {
				System.out.println("게임을 종료합니다");
				break;
			}
			
			int i = (int)(Math.random()*3);

			String com = comArr[i];
			
//			String com ="";
			
//			if(i==0)
//				com = "가위";
//			else if(i==1)
//				com = "바위";
//			else if(i==2)
//				com = "보";
			
			if(me.equals("가위")) {
				if(com.equals("가위")) 
					System.out.println("나="+me+",컴퓨터="+com+", 비겼어요");
				else if(com.equals("바위"))
					System.out.println("나="+me+",컴퓨터="+com+", 내가 졌어요");
				else if(com.equals("보")) 
					System.out.println("나="+me+",컴퓨터="+com+", 내가 이겼어요");
			}
			else if(me.equals("바위")) { 
				if(com.equals("가위")) 
					System.out.println("나="+me+",컴퓨터="+com+", 내가 이겼어요");
				else if(com.equals("바위")) 
					System.out.println("나="+me+",컴퓨터="+com+", 비겼어요");
				else if(com.equals("보")) 
					System.out.println("나="+me+",컴퓨터="+com+", 내가 졌어요");
			}
			else if(me.equals("보")) { 
				if(com.equals("가위")) 
					System.out.println("나="+me+",컴퓨터="+com+", 내가 졌어요");
				else if(com.equals("바위")) 
					System.out.println("나="+me+",컴퓨터="+com+", 내가 이겼어요");
				else if(com.equals("보")) 
					System.out.println("나="+me+",컴퓨터="+com+", 비겼어요");
		
			}
		}
	}
}





