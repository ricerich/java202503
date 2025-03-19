package oop;

public class Ex01_Basic 
{
	public static void main(String[] args) 
	{
		//2.클래스를 사용
		//3.객체 만들기 에
		Circle c1;//객체가 아직 완성이 안됨! c1->객체변수
		c1 = new Circle();//객체 완성 -> c1->객체, new Circle() -> 찐객체
		
		Circle c2 = new Circle();
		
		//4.객체 사용
		c1.x = 100;
		c1.y = 200;
		c1.radius = 10;
		
		//main영역의 지역변수
		float area = c1.getArea();//4.객체사용
		System.out.println("원의 면적은= " + area);
		
		
		
	}

}
