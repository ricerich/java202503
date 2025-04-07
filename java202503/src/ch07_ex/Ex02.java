package ch07_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		ArrayList<Character> al = new ArrayList<Character>();
		
		System.out.print("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/E)>>");
		Scanner sc1 = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			String s = sc1.next();
			
			if(s.length()>1) {
				System.out.println("1글자로 입력해주세요!");
				return;
			}
			
			char c = s.charAt(0);
			
			if( (c>='A' && c<='D') || c == 'F') {
				al.add(c);
			}
			else {
				System.out.println("A,B,C,D,F 중에 입력해주세요");
				return;
			}
			
		}
		
		double score = 0.0;
		for(int i=0; i<al.size(); i++) {
			char c = al.get(i);
			switch(c) {
				case 'A':
					score = 4.0;
					break;
				case 'B':
					score = 3.0;
					break;
				case 'C':
					score = 2.0;
					break;
				case 'D':
					score = 1.0;
					break;
				case 'F':
					score = 0.0;
					break;
			}
					
			System.out.print(score + " ");	
			
		}
	}
}







