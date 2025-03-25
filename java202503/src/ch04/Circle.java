package ch04;

public class Circle {
	//1.멤버변수 - 무조건 private 
	private String name;
	private int radius;
	
	//2.생성자 - 무조건 public
	public Circle(){
		name = "홍길동";
		radius = 10;
	}
	
	
	//3.메소드 - public or private
	private double getArea()
	{
		return radius*radius*3.14;
	}
	
	public void printArea()
	{
		System.out.println(getArea());
	}
	
	//공개 메소드
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
