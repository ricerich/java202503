package oop;

public class Circle //1.클래스 만들기(==클래스 정의==define)
{
	//클래스 구성 요소(=멤버) 3가지
	//1.멤버변수(=필드)
	//2.생성자(메소드)
	//3.(멤버)메소드
	
	//1.멤버변수(=필드)
	int x;
	int y;
	int radius;
	
	//2.생성자(메소드)
	//규칙1)클래스명과 동일한 메소드
	//규칙2)반환값 자체가 있을수 없다.
	Circle(){//역할: 멤버변수의 기본값(=초기값) 줄 때
		x=10;
		y=25;
	}

	//3.(멤버)메소드
	float getArea()
	{
		return radius*radius*3.14f;
	}
}
