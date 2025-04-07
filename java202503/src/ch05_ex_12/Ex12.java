package ch05_ex_12;

import java.util.Scanner;

abstract class Shape 
{
	public Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	} // 링크 연결

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Rect extends Shape {

	@Override
	public void draw() {
		System.out.println("Rect");
	}

}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}

class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class ShapeManager
{
	Scanner sc1;
	
	Shape first;
	Shape last;
	
	ShapeManager(){
		first=null;
		last=null;
		
		sc1 = new Scanner(System.in);
	}
	
	void run() {
		
		System.out.println("그래픽 에디터 GV1을 실행합니다.");
		
		
		
		while(true) {
			System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
			int choice = sc1.nextInt();
			
			switch(choice) {
			
				case 1://삽입
					System.out.print("Line(1), Rect(2), Circle(3)>>");
					int type = sc1.nextInt();
					
					//입력 메소드
					insert(type);
					
					break;
				case 2://삭제
					System.out.print("삭제할 도형의 위치>>");
					int index = sc1.nextInt();
					
					boolean ok = delete(index);
					if(ok == false ) {
						System.out.println("삭제에 실패하였습니다!");
					}					
					break;
				case 3://모두보기
					Shape s = first;
					while(s != null) {
						s.draw();
						s = s.next;
					}
//					view();					
					break;
				case 4://종료
//					finish();
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
			
			}
		}
	}

	private boolean delete(int index) {
		
		Shape previous=first;
		Shape current=first;
		
		//1.아무것도 없을 때 종료
		if(first == null)
			return false;
		
		//2.지정한 인덱스 위치까지 이동
		for(int i=0; i<index; i++) {
			previous = current;//뒤로 이동하기 전에, 담아둠
			current = current.next;//뒤로 이동
			
			if(current == null)
				return false;
		}
		
		//3-1.원소가 1개 밖에 없을때
		if(first == last) {
			first = null;
			last = null;
			return true;
		}
		
		//3.실제 삭제 작업(current를 삭제함)
		if(current == first)//3-1.첫번째 원소일 때
		{
			first = first.next;
		}
		else if(current == last)//3-2.마지막 원소일 때
		{
			last = previous;
			last.next = null;
		}
		else //3-3.중간 원소일 때
		{
			previous.next = current.next;
		}
		
		return true;
	}

	private void insert(int type) 
	{
		Shape obj=null;
		switch(type) {
			case 1:
				obj = new Line();
				break;
			case 2:
				obj = new Rect();
				break;
			case 3:
				obj = new Circle();
				break;
		}
		
		//1.처음일때, 아무것도 없을 때
		//2.처음이 아닐 때, 1개 이상일때
		
		if(first == null)//1.처음일때, 아무것도 없을 때
		{
			first = obj;
			last = obj;
		}
		else {//2.1개 이상일때
			last.next = obj;
			last = obj;
		}
		
		
		
	}
}

public class Ex12 {
	public static void main(String[] args) {
		new ShapeManager().run();
	}
}




