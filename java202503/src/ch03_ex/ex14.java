package ch03_ex;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) 
	{
		String course[] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목 이름>>");
			String name = sc1.next();
			
			if(name.equals("그만"))
				break;
			
			int i;
			for(i=0; i<course.length; i++) {
				if(name.equals(course[i])) {
					System.out.println(""+name+"의 점수는 "+score[i]+"");
					break;
				}
			}
			
			if(i==course.length)
				System.out.println("없는 과목 입니다!");
		}
		sc1.close();
	}
}





