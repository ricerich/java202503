package ch04_ex;

import java.util.Scanner;

public class MonthSchedule 
{
	Scanner sc1;
	Day days[];
	int nDays;

	public MonthSchedule(int nDays) {
		this.sc1 = new Scanner(System.in);
		this.days = new Day[nDays];
		this.nDays = nDays;
		
		for(int i=0; i<days.length;i++) {
			days[i] = new Day();
		}
		
	}


	private void input() {
		
		System.out.print("날짜(1~"+nDays+")?");
		int day = sc1.nextInt();
		
		if(day<1 || day>nDays) {
			System.out.println("1~"+nDays+" 사이의 날짜를 입력해주세요");
			return;
		}
		
		System.out.print("할일(빈칸없이 입력)");
		String work = sc1.next();
		
		days[day-1].set(work);
		
	}
	
	private void view() {
		System.out.print("날짜(1~"+nDays+")?");
		int day = sc1.nextInt();
		
		if(day<1 || day>nDays) {
			System.out.println("1~"+nDays+" 사이의 날짜를 입력해주세요");
			return;
		}
		
//		System.out.println(day+"일에 할일은 "+days[day-1].get()+" 입니다");
		System.out.print(day+"일에 할일은 ");
		days[day-1].show();		
	}
	
	private void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() 
	{
		System.out.println("이번달 스케줄 관리 프로그램.");
		
//		Scanner sc1 = new Scanner(System.in);//멤버변수로 격상
		
		while(true)
		{
			
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			int choice = sc1.nextInt();
			
			switch(choice) {
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					sc1.close();
					return;
			}
			
		}
	}
	

}











